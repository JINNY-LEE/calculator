package com.hanbit.calculator.domain;

/**
 * Created by hb2008 on 2016-12-10.
 */

public class CalcDTO { // POJO : 이렇게 만든 것들은 상속이나 구현 하지 마라.

    private int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
