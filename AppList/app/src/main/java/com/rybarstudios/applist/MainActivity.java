package com.rybarstudios.applist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context context;
    AppListing mAppListing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        ArrayList<AppListing> lists = AppRepository.getAllApps();

        for(AppListing ele : lists) {
            ((LinearLayout)findViewById(R.id.layout_list)).addView(genTextView(ele.getAppName()));
        }
    }

    private TextView genTextView(String appName) {
        TextView view = new TextView(context);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        view.setText(appName);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                //TODO:
                //Send app data to details activity to be displayed
                startActivity(intent);
            }
        });

        return view;
    }
}
