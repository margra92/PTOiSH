package pl.marcin.grabowski.util;

import pl.marcin.grabowski.exc1p1.MeasurableMethod;

/**
 * Created by marcin on 09.04.17.
 */
public interface BenchmarkCallBack {
    long getExecTime(MeasurableMethod measurableMethod);
}
