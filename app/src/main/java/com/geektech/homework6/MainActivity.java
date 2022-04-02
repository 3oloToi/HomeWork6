package com.geektech.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button);
        EditText editText = findViewById(R.id.edit_email);
        EditText editText1 = findViewById(R.id.edit_password);
        TextView textView = findViewById(R.id.textView);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText.getText().toString().isEmpty()){
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else {
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editText1.getText().toString().isEmpty()){
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else {
                    button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("Admin")&& editText1.getText().toString().equals("Admin")){
                    button1.setVisibility(View.INVISIBLE);
                    Toast.makeText(MainActivity.this, "Успешно", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Ошибка", Toast.LENGTH_SHORT).show();
                }
            }
        });
        






    }

}