package ru.mirea.malyushin.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void btnCountChar(View view) {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                "Студент № 19, группа № 6. Количество символов - " + editText.getText().length(),
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
}