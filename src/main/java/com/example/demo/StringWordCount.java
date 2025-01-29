package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StringWordCount {
 
    public static void main(String[] args) {
 
        String str = "Hello India is my country I love my india";
 
        List <String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
            .collect(Collectors.toList());
 
        Map <String, Integer > wordCounter = list.stream()
            .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));
 
        System.out.println(wordCounter);
 
    }
}
