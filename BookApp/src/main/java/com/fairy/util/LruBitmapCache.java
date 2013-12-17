package com.fairy.util;


import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * Created by Mykola.Koshurenko on 11/21/13.
 */
public final class LruBitmapCache extends LruCache<Integer, Bitmap> {
    private static LruBitmapCache _singleton;

    public LruBitmapCache(int maxSize) {
        super(maxSize);
    }

    @Override
    protected void entryRemoved(boolean evicted, Integer key, Bitmap oldValue, Bitmap newValue)
    {
        // When the entry is dismissed we can do the work and recycle the bitmap
        oldValue.recycle();
        // super hast to be called AFTERWARDS
        super.entryRemoved(evicted, key, oldValue, newValue);
    }


    protected int sizeOf(Integer key, Bitmap value)
    {
        // Replacement for Bitmap.getByteCount() on < HONEYCOMB
        int size = value.getRowBytes() * value.getHeight();
        return size;
    }

    public synchronized static LruBitmapCache getSingleton() {
        if (_singleton == null) {
            long maxMemory = Runtime.getRuntime().maxMemory() / 4;
            maxMemory = Math.max(1024L * 1024L * 4L, maxMemory);
            _singleton = new LruBitmapCache((int) maxMemory);
        }
        return  _singleton;
    }
}
