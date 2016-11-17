package com.example.windows10.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button button1, button2, button3, button4;
    TextView tv;
    String myStr1, myStr2;
    double num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button5);

        tv=(TextView)findViewById(R.id.textView3);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                myStr1 = et1.getText().toString();
                myStr2 = et2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "하나라도 입력해요", Toast.LENGTH_SHORT).show();
                }else{
                    num = Double.parseDouble(myStr1) + Double.parseDouble(myStr2);
                    tv.setText("계산 결과 : " + num);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                myStr1 = et1.getText().toString();
                myStr2 = et2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "하나라도 입력해요", Toast.LENGTH_SHORT).show();
                }else{
                    num = Double.parseDouble(myStr1) - Double.parseDouble(myStr2);
                    tv.setText("계산 결과 : " + num);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                myStr1 = et1.getText().toString();
                myStr2 = et2.getText().toString();
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "하나라도 입력해요", Toast.LENGTH_SHORT).show();
                }else{
                    num = Double.parseDouble(myStr1) * Double.parseDouble(myStr2);
                    tv.setText("계산 결과 : " + num);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                myStr1 = et1.getText().toString();
                myStr2 = et2.getText().toString();
                String zero = "0";
                if(myStr1.isEmpty() || myStr2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "하나라도 입력해요", Toast.LENGTH_SHORT).show();
                }else if(myStr2.equals(zero)){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }else{
                    num = Double.parseDouble(myStr1) / Double.parseDouble(myStr2);
                    tv.setText("계산 결과 : " + num);
                }
            }
        });


    }
}
