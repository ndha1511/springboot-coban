package com.code.springbootcoban.test;

public class EngineJapan implements Engine{
    private String name;

    public EngineJapan(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "EngineJapan{" +
                "name='" + name + '\'' +
                '}';
    }
}
