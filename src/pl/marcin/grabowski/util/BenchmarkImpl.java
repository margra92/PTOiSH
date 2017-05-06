package pl.marcin.grabowski.util;

import pl.marcin.grabowski.exc1p1.MeasurableMethod;

/**
 * Created by marcin on 09.04.17.
 */
public class BenchmarkImpl implements BenchmarkCallBack {


    @Override
    public long getExecTime(MeasurableMethod measurable) {
        long startTime = System.nanoTime();
        measurable.execMeasuringMethod();
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        return elapsedTime/1000;
    }
}
