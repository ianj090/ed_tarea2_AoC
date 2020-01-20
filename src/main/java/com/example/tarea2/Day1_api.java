package com.example.tarea2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
public class Day1_api {

    @RequestMapping("/")
    public int main(Integer num1) {
        return calculateMass(num1);
    }

    public static int calculateMass(int mass) {
        return (mass/3) -2;
    }
}
