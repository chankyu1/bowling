package com.example.demo;

public class Greeting {
    private final long number_throw;
    private final String knock_down_pin;
    private final String total_score;

    public Greeting(long number_throw, String knock_down_pin, String content2 ) {
        this.number_throw = number_throw;
        this.knock_down_pin = knock_down_pin;
        this.total_score = content2;
    }

    public long getNumber_throw() {
        return number_throw;
    }

    public String getKnock_down_pin() {
        return knock_down_pin;
    }

    public String getTotal_score() {
        return total_score;
    }
}
