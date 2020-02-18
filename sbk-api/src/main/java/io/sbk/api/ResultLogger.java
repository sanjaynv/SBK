/**
 * Copyright (c) KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.sbk.api;

/**
 * Interface for recoding/printing results.
 */
public interface ResultLogger {

    /**
     * Print the performance results.
     * @param action  Name of the action/operation.
     * @param records data to write.
     * @param recsPerSec  records per second.
     * @param mbPerSec Throughput value in terms of MB (Mega Bytes) per Second.
     * @param avgLatency Average Latency.
     * @param maxLatency Maximum Latency.
     */
    void print(String action, long records, double recsPerSec, double mbPerSec, double avgLatency, double maxLatency);

    /**
     * Print the Latency values.
     * @param action  Name of the action/operation.
     * @param one 50th Percentile.
     * @param two  75th Percentile.
     * @param three 95th Percentile.
     * @param four 99th Percentile
     * @param five 99.9th Percentile
     * @param six  99.99th Percentile
     */
    void printLatencies(String action, long one, long two, long three, long four, long five, long six);

    /**
     * Print the number of discarded latency values .
     * @param action  Name of the action/operation.
     * @param discard number of discarded latencies.
     */
    void printDiscardedLatencies(String action, int discard);
}
