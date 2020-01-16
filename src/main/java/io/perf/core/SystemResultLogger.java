package io.perf.core;

public class SystemResultLogger implements ResultLogger {

    public SystemResultLogger() {
        ;;
    }

    public void print(String action, long records, double recsPerSec, double mbPerSec, double avglatency, double maxlatency) {
        System.out.printf("%s %10d records, %9.1f records/sec, %6.2f MB/sec, %7.1f ms avg latency, %7.1f ms max latency\n",
                action, records, recsPerSec, mbPerSec, avglatency, maxlatency);
    }

    public void printLatencies(String action, int one, int two, int three, int four, int five, int six) {
        System.out.printf("%s %d ms 50th, %d ms 75th, %d ms 95th, %d ms 99th, %d ms 99.9th, %d ms 99.99th.\n",
                 action, one, two, three,four, five, six);
    }

    public void printDiscardedLatencies(String action, int discard) {
        if (discard > 0) {
            System.out.printf("%s %d\n", action, discard);
        }
    }
}
