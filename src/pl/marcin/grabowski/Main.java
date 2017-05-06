package pl.marcin.grabowski;

import pl.marcin.grabowski.exc1p1.Exc1p1Serialization;
import pl.marcin.grabowski.exc1p1.MeasurableMethod;
import pl.marcin.grabowski.util.Benchmark;

public class Main {

    public static void main(String[] args) {
        MeasurableMethod exc1p1 = new Exc1p1Serialization();
        Benchmark benchmark = new Benchmark();
        System.out.println(benchmark.benchmarkExecutionTime(exc1p1) +"us");
    }
}
