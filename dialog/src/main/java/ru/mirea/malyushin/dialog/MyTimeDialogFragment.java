package ru.mirea.malyushin.dialog;
//
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.app.Dialog;
//import android.app.TimePickerDialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.widget.TimePicker;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.DialogFragment;
//
//import java.util.Calendar;
//
//public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
////        Calendar dateAndTime = Calendar.getInstance();
//        @NonNull
//        @Override
//        public Dialog onCreateDialog(Bundle savedInstanceState) {
//            final Calendar c = Calendar.getInstance();
//            int hour = c.get(Calendar.HOUR_OF_DAY);
//            int minute = c.get(Calendar.MINUTE);
//            return new TimePickerDialog(getActivity(),
//                    this,
//                    hour,
//                    minute,
//                    android.text.format.DateFormat.is24HourFormat(getActivity())
//            );
//
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                // Do something with the time chosen by the user
//            }
////            TimePickerDialog.Builder builder = new AlertDialog.Builder(getActivity());
////            builder.set
////            TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(),
////                    new TimePickerDialog.OnTimeSetListener() {
////                        @Override
////                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
////                        }
////                    },
////                    dateAndTime.get(Calendar.HOUR_OF_DAY),
////                    dateAndTime.get(Calendar.MINUTE),
////                    true)
////                    .show();
//        }
//    }
////    int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
////    int currentMinute = calendar.get(Calendar.MINUTE);
////    TimePickerDialog timePickerDialog = new TimePickerDialog(
////            getActivity(),
////            new TimePickerDialog.OnTimeSetListener() {
////
////                @Override
////                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
////                    // Сделайте что-то с выбранным временем
////                }
////            },
////            currentHour, // Начальный час, который будет отображаться в выборе времени
////            currentMinute, // Начальная минута, которая будет отображаться в выборе времени
////            true // Использовать 24-часовой формат времени или нет
////    );

import static android.content.ContentValues.TAG;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private int mHour;
    private int mMinute;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        mHour = calendar.get(Calendar.HOUR_OF_DAY);
        mMinute = calendar.get(Calendar.MINUTE);
        return new TimePickerDialog(
                getActivity(),
                this,
                mHour,
                mMinute,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Log.d(TAG, "Выбранное время: " + hourOfDay + ":" + minute);
        mHour = hourOfDay;
        mMinute = minute;
        Toast.makeText(view.getContext(), "Selected time: " + mHour + ":" + mMinute, Toast.LENGTH_SHORT).show();
    }
}

