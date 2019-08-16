package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template1 = "%s pins knocked down";
    private static final String template2 = "%s scores";
    private final AtomicLong counter = new AtomicLong();
    private int bonus;
    private int score;
    private BowlingGame g = new BowlingGame();

    @RequestMapping("/bowling")
    public Greeting greeting(@RequestParam(value="pins", defaultValue = "0") String pins) {

        int i_pins = Integer.parseInt(pins);
        g.roll(i_pins);
        score = g.score();

        return new Greeting(counter.incrementAndGet(), String.format(template1, pins), String.format(template2, score));


    }
}
