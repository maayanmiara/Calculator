package com.example.kalma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Screen;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnplus, btnminus, btnmul, btndiv, btnequal, btnC, btnpow, btnsin, btncos, btntan;
    private char op;
    private double lastAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen = (TextView) findViewById(R.id.Screen);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnequal = (Button) findViewById(R.id.btnequal);
        btnC = (Button) findViewById(R.id.btnC);
        btnpow = (Button) findViewById(R.id.btnpow);
        btnsin = (Button) findViewById(R.id.btnsin);
        btncos = (Button) findViewById(R.id.btncos);
        btntan = (Button) findViewById(R.id.btntan);
        op = '?';
        Screen.setText(String.valueOf(0));
        lastAns = 0;
    }

    public void click0(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(0));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 0;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click1(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(1));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 1;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click2(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(2));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 2;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click3(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(3));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 3;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click4(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(4));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 4;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click5(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(5));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 5;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click6(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(6));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 6;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click7(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(7));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 7;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click8(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(8));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 8;
            Screen.setText(String.valueOf(x));
        }
    }
    public void click9(View view) {
        if(op!='?')
        {
            lastAns = Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(9));
        }
        else
        {
            double x = Double.parseDouble(Screen.getText().toString());
            x= x*10 + 9;
            Screen.setText(String.valueOf(x));
        }
    }
    public void clickequal(View view) {
        if(op =='+'){
            double answer = lastAns+Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op == '-'){
            double answer = lastAns-Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op == '/'){
            if(Double.parseDouble(Screen.getText().toString()) != 0) {
                double answer = lastAns / Double.parseDouble(Screen.getText().toString());
                Screen.setText(String.valueOf(answer));
                op = '?';
            }
            else{
                Screen.setText("Math Error");
                op = '?';
            }
        }

        if(op == '*'){
            double answer = lastAns*Double.parseDouble(Screen.getText().toString());
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op =='^'){
            double answer = Math.pow(lastAns,Double.parseDouble(Screen.getText().toString()));
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op == 'o'){
            double answer = Math.cos(Double.parseDouble(Screen.getText().toString()));
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op == 's'){
            double answer = Math.sin(Double.parseDouble(Screen.getText().toString()));
            Screen.setText(String.valueOf(answer));
            op = '?';
        }
        if(op == 't'){
            double answer = Math.tan(Double.parseDouble(Screen.getText().toString()));
            Screen.setText(String.valueOf(answer));
            op = '?';
        }

    }

    public void clickclear(View view){
       op = 'c';
        if(op == 'c'){
            lastAns=0;
            Screen.setText(String.valueOf(0));
            op = '?';
        }
    }
    public void clickMinus(View view)
    {
        op = '-';
    }public void clickPlus(View view)
    {
        op = '+';
    }public void clickDiv(View view)
    {
        op = '/';
    }public void clickMul(View view)
    {
        op = '*';
    }public void clickPow(View view)
    {
        op = '^';
    }
    public void clickSin(View view) {
        op = 's';
    }

    public void clickCos(View view) {
        op = 'o';
    }

    public void clickTan(View view) {
        op = 't';
    }
}