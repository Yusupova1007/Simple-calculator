package com.example.simplecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //создаем элементы
    EditText editTextNum1, editTextNum2;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //получение ссылки на View элементов (связываем графический элемент через его id с программным)
        editTextNum1 = findViewById(R.id.number1);
        editTextNum2 = findViewById(R.id.number2);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);
        textView = findViewById(R.id.answer);
    }
}