package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnMod = (Button) findViewById(R.id.BtnMod);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + String.valueOf(result));                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + String.valueOf(result));
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + String.valueOf(result));
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else if(num2.equals("0")){
                    Toast.makeText(MainActivity.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + String.valueOf(result));
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else if(num2.equals("0")){
                    Toast.makeText(MainActivity.this, "0으로는 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + String.valueOf(result));
                }
            }
        });

    }
}
