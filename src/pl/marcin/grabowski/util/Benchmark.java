package pl.marcin.grabowski.util;

import pl.marcin.grabowski.exc1p1.MeasurableMethod;

/**
 * Created by marcin on 09.04.17.
 */
public class Benchmark {

    BenchmarkCallBack callBack = new BenchmarkImpl();
    public long benchmarkExecutionTime(MeasurableMethod methodToBench) {
        return callBack.getExecTime(methodToBench);
    }
}
