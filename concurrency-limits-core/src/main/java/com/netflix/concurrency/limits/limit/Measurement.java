package com.netflix.concurrency.limits.limit;

/**
 * Contract for tracking a measurement such as a minimum or average of a sample set
 */
public interface Measurement {
    /**
     * Add a single sample and update the internal state.
     * @param sample
     * @return True if internal state was updated
     */
    boolean add(long sample);
    
    /**
     * @return Return the current value
     */
    long get();
    
    /**
     * Reset the internal state as if no samples were ever added
     */
    void reset();
}
