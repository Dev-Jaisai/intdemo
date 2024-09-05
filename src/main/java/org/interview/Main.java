package org.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
          String name="jaisai jaisai sarkate";
          //calculate the frequentcy of repeating char
        HashMap<String,Integer> hm= new HashMap<>();

        for (String word:name.split(" ")){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        hm.entrySet().stream().filter(x->x.getValue()>1)
                .forEach(System.out :: println);
    }
}