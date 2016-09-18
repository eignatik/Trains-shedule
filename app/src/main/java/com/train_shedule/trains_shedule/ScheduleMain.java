package com.train_shedule.trains_shedule;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class ScheduleMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_main);
        showHint();

    }

    private void showHint(){
        RelativeLayout parentContainer;
        parentContainer = (RelativeLayout) findViewById(R.id.parrentLayout);
        Snackbar.make(parentContainer, "Выберете интресующий вас переезд", Snackbar.LENGTH_LONG).show();
    }
}
