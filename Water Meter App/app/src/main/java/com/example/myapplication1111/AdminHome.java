package com.example.myapplication1111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AdminHome extends AppCompatActivity {

    ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10;
    TextView tv;
    int[] color ={Color.rgb(123,172,209),Color.rgb(7,134,245)};
    int val=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        iv1=(ImageView)findViewById(R.id.v1);
        iv2=(ImageView)findViewById(R.id.v2);
        iv3=(ImageView)findViewById(R.id.v3);
        iv4=(ImageView)findViewById(R.id.v4);
        iv5=(ImageView)findViewById(R.id.v5);
        iv6=(ImageView)findViewById(R.id.v6);
        iv7=(ImageView)findViewById(R.id.v7);
        iv8=(ImageView)findViewById(R.id.v8);
        iv9=(ImageView)findViewById(R.id.v9);
        iv10=(ImageView)findViewById(R.id.v10);
        tv=(TextView) findViewById(R.id.valTxt);

        tv.setText(""+val+"%");

        if (val>=0 ) { iv1.setBackgroundColor(color[1]);}
        else {iv1.setBackgroundColor(color[0]);}

        if (val>=10 ) { iv2.setBackgroundColor(color[1]);}
        else {iv2.setBackgroundColor(color[0]);}

        if (val>=20 ) { iv3.setBackgroundColor(color[1]);}
        else {iv3.setBackgroundColor(color[0]);}

        if (val>30 ) { iv4.setBackgroundColor(color[1]);}
        else {iv4.setBackgroundColor(color[0]);}

        if (val>40 ) { iv5.setBackgroundColor(color[1]);}
        else {iv5.setBackgroundColor(color[0]);}

        if (val>50 ) { iv6.setBackgroundColor(color[1]);}
        else {iv6.setBackgroundColor(color[0]);}

        if (val>60 ) { iv7.setBackgroundColor(color[1]);}
        else {iv7.setBackgroundColor(color[0]);}

        if (val>70 ) { iv8.setBackgroundColor(color[1]);}
        else {iv8.setBackgroundColor(color[0]);}

        if (val>80 ) { iv9.setBackgroundColor(color[1]);}
        else {iv9.setBackgroundColor(color[0]);}

        if (val>90 ) { iv10.setBackgroundColor(color[1]);}
        else {iv10.setBackgroundColor(color[0]);}





    }


    public void logout(){
        Log.d("STATE","openAdminHome running");
        Intent intent =new Intent(AdminHome.this,MainActivity.class);
        startActivity(intent);
    }
}
