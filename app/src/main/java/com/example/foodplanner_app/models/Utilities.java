package com.example.foodplanner_app.models;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;

import com.example.foodplanner_app.R;
import com.example.foodplanner_app.app_activities.HomeActivity;
import com.google.android.material.snackbar.Snackbar;

public class Utilities {
    static ProgressDialog progressDoalog;
    static AlertDialog dialog;
    public static void showLoading(Context context){
        progressDoalog =new ProgressDialog(context);
        progressDoalog.setMessage("loading....");
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDoalog.setIndeterminateDrawable(context.getResources().getDrawable(R.drawable.progress_indicator));
        progressDoalog.setIndeterminate(true);
        progressDoalog.setCancelable(false);
        progressDoalog.show();
    }

    public static void showDialog(Context context, String msg, FragmentActivity activity){
//        dialog =new AlertDialog.Builder(context).setCancelable(true).setMessage(msg).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        }).show();

        Snackbar s = Snackbar.make(activity.findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG)
                .setBackgroundTint(Color.RED);
        s.show();
    }

    public static void showSnackbar( String msg,View view){
//        dialog =new AlertDialog.Builder(context).setCancelable(true).setMessage(msg).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        }).show();

        Snackbar s = Snackbar.make(view.findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG)
                .setBackgroundTint(Color.RED);
        s.show();
    }



}
