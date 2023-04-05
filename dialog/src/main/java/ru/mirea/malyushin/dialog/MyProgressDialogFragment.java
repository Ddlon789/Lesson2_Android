package ru.mirea.malyushin.dialog;

import android.app.ProgressDialog;
import android.content.Context;

public class MyProgressDialogFragment {
    private ProgressDialog progressDialog;
    private Context context;

    public MyProgressDialogFragment(Context context) {
        this.context = context;
    }

    public void showProgressDialog(String message) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(true);
        progressDialog.show();
    }
}

