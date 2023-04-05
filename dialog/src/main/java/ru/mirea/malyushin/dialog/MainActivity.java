package ru.mirea.malyushin.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
        Snackbar.make(view, "MIREA", Snackbar.LENGTH_LONG).show();
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void btnOnClickTime(View view) {
        MyTimeDialogFragment myTimeDialogFragment = new MyTimeDialogFragment();
        myTimeDialogFragment.show(getSupportFragmentManager(), "time");
    }

    public void btnOnClickProcess(View view) {
        MyProgressDialogFragment myProgressDialogFragment = new MyProgressDialogFragment(MainActivity.this);
        myProgressDialogFragment.showProgressDialog("Loading...");
    }

    public void btnOnClickDate(View view) {
        MyDateDialogFragment myDateDialogFragment = new MyDateDialogFragment();
        myDateDialogFragment.show(getSupportFragmentManager(), "date");
    }
}