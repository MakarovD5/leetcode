package com.maka.question.jianzhi1;

import java.util.LinkedList;

/**
 * @author MakarovD
 * @date 2022/10/24 15:18
 * @description
 */
public class J30 {
}

//辅助栈之储存插入后的最小值，因为出栈顺序固定，所以辅助栈的出栈顺序和主栈一致
class MinStack {
    private LinkedList<Integer> mainList;
    private LinkedList<Integer> supList;

    /** initialize your data structure here. */
    public MinStack() {
        mainList = new LinkedList<>();
        supList = new LinkedList<>();
    }

    public void push(int x) {
        mainList.addLast(x);
        if (supList.size()==0 || supList.peekLast()>=x){
            supList.addLast(x);
        }
    }

    public void pop() {
        Integer last = mainList.removeLast();
        if (supList.size()!=0 && last.equals(supList.peekLast()))
            supList.removeLast();

    }

    public int top() {
        return mainList.getLast();
    }

    public int min() {
        return supList.getLast();
    }
}

//定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
//
//
//
// 示例:
//
// MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.min();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.min();   --> 返回 -2.
//
//
//
//
// 提示：
//
//
// 各函数的调用总次数不超过 20000 次