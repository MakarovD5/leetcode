package com.maka.question.jianzhi1;

/**
 * @author MakarovD
 * @date 2022/10/23 15:32
 * @description
 */
public class J14I {
    public static void main(String[] args) {
        int i = new J14I().cuttingRope(6);
        System.out.println("i = " + i);
    }

    /*数学方法
    绳子切分方案	乘积	结论
    2 = 1 + 12=1+1	1 \times 1 = 11×1=1	22 不应切分
    3=1+23=1+2	1 \times 2 = 21×2=2	33 不应切分
    4=2+2=1+34=2+2=1+3	2 \times 2 = 4 > 1 \times 3 = 32×2=4>1×3=3	44 和 22 等价，且 2+22+2 比 1+31+3 更优
    5=2+3=1+45=2+3=1+4	2 \times 3 = 6 > 1 \times 4 = 42×3=6>1×4=4	55 应切分为 2+32+3
    6=3+3=2+2+26=3+3=2+2+2	3 \times 3 = 9 > 2 \times 2 \times 2 = 83×3=9>2×2×2=8	66 应切分为 3+33+3 ，进而推出 33 比 22 更优
    >7>7	...	长绳（长度>7）可转化为多个短绳（长度1~6），因此肯定应切分

    分别计算出1、2、3、4、5、6的最长方案，找规律发现，最小切到2和3，而其他数字的最长方案都是由2和3组成，而且3优先级高于2

     */
    public int cuttingRope(int n) {
        if (n==2)
            return 1;
        if (n==3)
            return 2;
        if (n%3==0)
            return (int) Math.pow(3,(n/3));
        else if (n%3==1)
            return (int) ((Math.pow(3,(n/3)-1)) * (n-(3*((n/3)-1))));
        else//if (n%3==2)
            return (int) ((Math.pow(3,n/3)) * (n-(3*(n/3))));
    }
}
