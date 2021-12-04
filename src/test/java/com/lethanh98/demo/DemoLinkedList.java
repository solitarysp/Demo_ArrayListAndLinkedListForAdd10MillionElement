package com.lethanh98.demo;

import org.junit.Test;

import java.util.LinkedList;

public class DemoLinkedList {

    @Test
    public void test()  {
        Node last = null;
        Node first = null;
        long start = System.nanoTime();

        for (int i = 0; i < 10_000_000; i++) {
            final Node l = last;
            final Node newNode = new Node(l,  null);
            if (first == null)
                first = newNode;
            else
                l.next = newNode;

            last = newNode;
        }

        long timeRun = System.nanoTime() - start;
        System.out.println("nanoTime: " + timeRun);
    }

    public static class Node {
        Node next;
        Node prev;

        Node(Node prev, Node next) {
            this.next = next;
            this.prev = prev;
        }
    }
    @Test
    public void arrayListAndLinkedListForAdd1MillionElement() {
        String data = "Test";
        LinkedList<String> list = new LinkedList<>();

        long start = System.nanoTime();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(data);
        }

        System.out.println("Done: " + (System.nanoTime() - start));
    }


}
