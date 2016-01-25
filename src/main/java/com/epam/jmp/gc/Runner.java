package com.epam.jmp.gc;

import java.util.ArrayList;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long end = start + 5 * 60 * 1000; // 5 minutes

        while(System.currentTimeMillis() < end) {
            ArrayList<Integer> list = new ArrayList<Integer>(new Random().nextInt(20));
            list = null;
        }

    }
}
