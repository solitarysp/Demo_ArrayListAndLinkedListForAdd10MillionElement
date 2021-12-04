package com.lethanh98.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    @Test
    public void timeDoneUseCopyOf() {
        String[] a1 = new String[10_000_000];
        for (int i = 0; i < 10_000_000; i++) {
            a1[i] = "Test";
        }
        long start = System.nanoTime();
        String[] a2 = Arrays.copyOf(a1, 20_000_000);
        System.out.println("Done: " + (System.nanoTime() - start));
    }

    @Test
    public void arrayListAndLinkedListForAdd1MillionElement() {
        String data = "Test";
        ArrayList<String> list = new ArrayList<>();

        long start = System.nanoTime();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(data);
        }

        System.out.println("Done: " + (System.nanoTime() - start));
    }
}
