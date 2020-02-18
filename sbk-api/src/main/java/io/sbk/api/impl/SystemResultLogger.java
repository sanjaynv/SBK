/**
 * Copyright (c) KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

package io.sbk.api.impl;

import io.sbk.api.ResultLogger;

/**
 * Class for recoding/printing results on System.out.
 */
public class SystemResultLogger implements ResultLogger {

    public SystemResultLogger() {
        return;
    }

    public void print(String action, long records, double recsPerSec, double mbPerSec, double avgLatency, double maxLatency) {
        System.out.printf("%s %10d records, %9.1f records/sec, %8.2f MB/sec, %8.1f ms avg latency, %8.1f ms max latency\n",
                action, records, recsPerSec, mbPerSec, avgLatency, maxLatency);
    }

    public void printLatencies(String action, long one, long two, long three, long four, long five, long six) {
        System.out.printf("%s %d ms 50th, %d ms 75th, %d ms 95th, %d ms 99th, %d ms 99.9th, %d ms 99.99th.\n",
                 action, one, two, three, four, five, six);
    }

    public void printDiscardedLatencies(String action, int discard) {
        if (discard > 0) {
            System.out.printf("%s %d\n", action, discard);
        }
    }
}
