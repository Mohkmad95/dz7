package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer x, y;
    private boolean isOperationClick;
    private String operation;
    private String opertion2;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                appendNumber("1");
                break;
            case R.id.btn_two:
                appendNumber("2");
                break;
            case R.id.btn_tree:
                appendNumber("3");
                break;
            case R.id.btn_four:
                appendNumber("4");
                break;
            case R.id.btn_five:
                appendNumber("5");
                break;
            case R.id.btn_six:
                appendNumber("6");
                break;
            case R.id.btn_seven:
                appendNumber("7");
                break;
            case R.id.btn_eight:
                appendNumber("8");
                break;
            case R.id.btn_nine:
                appendNumber("9");
                break;
            case R.id.btn_zero:
                appendNumber("0");
                break;
            case R.id.btn_clear:
                clearTextView();
                break;
            case R.id.dot:
                appendNumber(".");
                break;
        }
        isOperationClick = false;

    }

    private void appendNumber(String number) {
        if (textView.getText().toString().equals("0") || isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
    }


    private void clearTextView() {
        textView.setText("0");
    }


    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "+";
                break;
            case R.id.minus:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "-";
                break;
            case R.id.umnojenie:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "*";
                break;
            case R.id.delenie:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "/";
                break;
            case R.id.procent:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "%";
            case R.id.plusminus:
                x = Integer.valueOf(textView.getText().toString());
                isOperationClick = true;
                operation = "+/-";
                break;
            case R.id.rawno:
                if (isOperationClick) {
                    int y = Integer.valueOf(textView.getText().toString());
                    switch (operation) {
                        case "+/-":
                            result = x ^ y;
                            break;
                        case "%":
                            result = x % y;
                            break;
                        case "+":
                            result = x + y;
                            break;
                        case "-":
                            result = x - y;
                            break;
                        case "*":
                            result = x * y;
                            break;
                        case "/":
                            result = x / y;
                            break;
                        default:
                            result = 0;
                            break;
                    }
                    textView.setText(String.valueOf(result));
                }

                isOperationClick = true;
                break;
        }
    }


}