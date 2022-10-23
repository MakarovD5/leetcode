package com.maka.test;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @author MakarovD
 * @date 2022/10/22 18:41
 * @description
 */
public class PriorityQueueTest {
    @Test
    public void t1(){
        PriorityQueue queue = new PriorityQueue();
        queue.add("wod");
        queue.add("ao");
        queue.add("ao");
        queue.add("dddd");
        System.out.println("queue = " + queue);
    }
}
