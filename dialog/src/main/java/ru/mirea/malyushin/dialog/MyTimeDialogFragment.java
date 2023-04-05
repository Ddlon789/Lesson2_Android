package ru.mirea.malyushin.dialog;

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

