package com.code.springbootcoban.test;

public class Main {
    public static void main(String[] args) {
        EngineChina engineChina = new EngineChina("engine china");
        Car car = new Car("abc", "yamaha");
        car.setEngineCar(engineChina);
        System.out.println(car);
    }
}
