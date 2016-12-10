package com.hanbit.calculator.service;

import com.hanbit.calculator.domain.CalcDTO;

/**
 * Created by hb2008 on 2016-12-10.
 */

public class CalcServiceImpl implements CalcService {

    @Override
    public int plus(CalcDTO param) {
        return param.getNum1()+param.getNum2();
    }

    @Override
    public int minus(CalcDTO param) {
        return param.getNum1()-param.getNum2();
    }

    @Override
    public int multi(CalcDTO param) {
        return param.getNum1()*param.getNum2();
    }

    @Override
    public int divi(CalcDTO param) {
        return param.getNum1()/param.getNum2();
    }

    @Override
    public int mod(CalcDTO param) {
        return param.getNum1()%param.getNum2();
    }
}
