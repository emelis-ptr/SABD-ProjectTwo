package benchmarks;

import org.apache.flink.streaming.api.functions.sink.SinkFunction;

/**
 * Class used for flink benchmark evaluations.
 * In order to use this performance evaluator a Flink sink must be created using ".addSink(new BenchmarkSink())"
 */
public class BenchmarkSink implements SinkFunction<String> {

    @Override
    public void invoke(String value, Context context) {
        // stats counter
        SynchronizedCounter.incrementCounter();
    }
}
