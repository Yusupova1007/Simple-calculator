package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //создаем элементы
    EditText editTextNum1, editTextNum2;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    TextView textView;
    int num1, num2;

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

        //устанавливаем обработчик для всех кнопок
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
    }

    public int getIntFromEditText(EditText editText) {
        //если текстовое поле пустое
        if (editText.getText().toString().equals("")) {
            //то выведем всплывающее сообщение
            Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show();
            //также возвращаем значение, равное нулю
            return 0;
        } else
            //если текстовое поле не пустое, преобразуем его в целое число
            return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View view) {
       num1 = getIntFromEditText(editTextNum1);
       num2 = getIntFromEditText(editTextNum2);
        //по id определяем кнопку, вызвавшую этот обработчик
        int id = view.getId();
        if (id == R.id.btn_add) {
            //обработка нажатия кнопки +
            textView.setText("Ответ = " + (num1 + num2));
        } else if (id == R.id.btn_sub) {
            //обработка нажатия кнопки -
            textView.setText("Ответ = " + (num1 - num2));
        } else if (id == R.id.btn_mul) {
            //обработка нажатия кнопки ×
            textView.setText("Ответ = " + (num1 * num2));
        } else if (id == R.id.btn_div) {
            //обработка нажатия кнопки ÷
            textView.setText("Ответ = " + ((float) num1 / (float) num2));
        }
    }
}