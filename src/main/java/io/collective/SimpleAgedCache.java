package io.collective;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class SimpleAgedCache {
    public Clock clock;
    Map <Object, CustomObject> cache;
    /*constructor */
    public SimpleAgedCache(Clock clock) {
        this.cache = new HashMap<>();
        this.clock = clock;
    }
    /*constructor without an arg */
    public SimpleAgedCache() {
        /*create clock */
        this(Clock.system(Clock.systemDefaultZone().getZone()));


    }
    /* This method puts in the data and has a key and a value with how long the thing should be in the cache*/
    public void put(Object key, Object value, int retentionInMillis) {
        if(retentionInMillis > 0){
            float time = retentionInMillis + clock.milis();
            cache.computeIfAbsent(key, k -> new ArrayList<>()).add(value));
        }

    }
    /* */
    public boolean isEmpty() {
        if(cache.isEmpty){
            return true;
        }
        else{
        return false;
    }
    }

    public int size() {
        return 0;
    }

    public Object get(Object key) {
        return null;
    }
}