package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","inicio");
        Toast.makeText(getApplicationContext(),"inicio",Toast.LENGTH_SHORT);
        Log.i("MainActivityInfo", "inicioMainActivityInfo");
        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","destroy");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);

        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Toast.makeText(getApplicationContext(),"down",Toast.LENGTH_SHORT).show();
                System.out.println("down");
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Toast.makeText(getApplicationContext(),"move",Toast.LENGTH_SHORT).show();
                System.out.println(event.getX());
                return true;
            case (MotionEvent.ACTION_UP) :
                Toast.makeText(getApplicationContext(),"up",Toast.LENGTH_SHORT).show();
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }

    public void boton(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}