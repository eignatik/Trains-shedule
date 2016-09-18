package com.train_shedule.trains_shedule;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnStart: {
                startFirstPageActivity();
                break;
            }
        }
    }

    private void startFirstPageActivity(){
        Intent intent = new Intent(this, ScheduleMain.class);
        startActivity(intent);
    }
}
