package com.example.androishaper.colorfultoastmessage;

import androidx.appcompat.app.AppCompatActivity;
import es.dmoral.toasty.Toasty;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Toasty.Config.reset();
        //Toasty.Config.getInstance().setSuccessColor(Color.parseColor("#ff4757")).apply();
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn)
        {
            Toasty.success(getApplicationContext(),"Scucess Cridental", Toast.LENGTH_SHORT,true).show();
        }

    }
}
