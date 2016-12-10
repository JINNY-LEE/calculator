package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.calculator.domain.CalcDTO;
import com.hanbit.calculator.service.CalcService;
import com.hanbit.calculator.service.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //implement : 기능 extends : 속성

    EditText etNum1, etNum2;
    Button btPlus, btMinus, btMulti, btDivi, btMod, btEqual, btClear;
    TextView tvResult;
    int result;
    CalcDTO cal;
    CalcService service ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1= (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);

        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDivi = (Button) findViewById(R.id.btDivi);
        btMod = (Button) findViewById(R.id.btMod);
        btEqual = (Button) findViewById(R.id.btEqual);
        btClear = (Button) findViewById(R.id.btClear);


        btPlus.setOnClickListener(this); // 버튼에 클릭하여 엑션을 일으키는 있는 기능을 부여
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivi.setOnClickListener(this);
        btMod.setOnClickListener(this);
        btEqual.setOnClickListener(this);
        btClear.setOnClickListener(this);

        tvResult = (TextView) findViewById(R.id.tvResult);

        service = new CalcServiceImpl();
        cal = new CalcDTO();

    }

    @Override
    public void onClick(View v) {

        int num1 = Integer.parseInt(String.valueOf(etNum1.getText()));
        int num2 = Integer.parseInt(etNum2.getText().toString());
        cal.setNum1(num1);
        cal.setNum2(num2);

        switch (v.getId()){

            case R.id.btPlus :
                result = service.plus(cal);
                break;

            case R.id.btMinus:
                result = service.minus(cal);
                break;

            case R.id.btMulti:
                result = service.multi(cal);
                break;

            case R.id.btDivi:
                result = service.divi(cal);
                break;

            case R.id.btMod:
                result = service.mod(cal);
                break;

            case R.id.btEqual:
                tvResult.setText("RESULT : "+ result);
                break;

            case R.id.btClear:
                etNum1.setText(null);
                etNum2.setText(null);
                tvResult.setText("RESULT : ");
                break;


        }
    }
}
