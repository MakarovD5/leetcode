package com.maka.question.jianzhi1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author MakarovD
 * @date 2022/10/24 14:44
 * @description
 */
public class J09 {
    public static void main(String[] args) {
        new CQueue();
    }
}
class CQueue {
    private LinkedList<Integer> list1;
    private LinkedList<Integer> list2;

    public CQueue() {
        list1  = new LinkedList<>();
        list2  = new LinkedList<>();
    }

    public void appendTail(int value) {
        list1.addLast(value);
    }

    public int deleteHead() {
        if (list2.size()!=0)
            return list2.removeLast();
        if (list1.size()==0)
            return -1;
        while (!list1.isEmpty())
            list2.add(list1.removeLast());
        return list2.removeLast();
    }
}