package com.maka.question.jianzhi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author MakarovD
 * @date 2022/10/24 15:56
 * @description
 */
public class J06 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next=new ListNode(3);
        node.next.next=new ListNode(2);
        new Solution().print(node);
        System.out.println(Arrays.toString(new Solution().reversePrint(node)));
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

class Solution {
    public void print(ListNode head){
        while (head!=null){
            System.out.println("head = " + head);
            head = head.next;
        }
    }
    //递归方法
    List list = new ArrayList();
    public int[] reversePrint(ListNode head) {
        reverse(head);
        //System.out.println("list = " + list);
        int[] ints = new int[list.size()];
        for (int i = 0; i<list.size(); i++){
            ints[i] = (int) list.get(i);
        }
        return ints;
    }

    public void reverse(ListNode node) {
        if (node==null)
            return;
        reverse(node.next);
        list.add(node.val);
    }
    //利用栈先进后出实现倒序
    //public int[] reversePrint(ListNode head) {
    //    LinkedList<Integer> linkedList = new LinkedList<>();
    //    ListNode node = head;
    //    while (node!=null){
    //        linkedList.addFirst(node.val);
    //        node = node.next;
    //    }
    //    int[] arr = new int[linkedList.size()];
    //    for (int i = 0; i<linkedList.size(); i++){
    //        arr[i] = linkedList.get(i);
    //    }
    //
    //    return arr;
    //
    //}
}