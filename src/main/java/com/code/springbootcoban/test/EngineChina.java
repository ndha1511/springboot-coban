package com.code.springbootcoban.test;

public class EngineChina implements Engine{
    private String name;

    public EngineChina(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EngineChina{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println(this.name);
    }
}
