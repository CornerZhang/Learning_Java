package com.nextreme.lib;

/**
 * Created by huazhang on 10/26/15.
 */
public abstract class Benchmark {
    /**
     * method benchmark
     */
    abstract void benchmark();

    public final long repeat(int count) {
        long start = System.nanoTime();

        for(int i=0; i<count; ++i) {
            benchmark();
        }

        return (System.nanoTime() - start);
    }
}
