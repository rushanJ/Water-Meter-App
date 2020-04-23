package com.example.myapplication1111;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private EditText usernameField,passwordField;
    private TextView status,role,method,mTextViewResult;
    private Button loginBtn,registerBtn;
    private boolean authStatus=false;
    private String file = "userInfo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        mTextViewResult = findViewById(R.id.textView2);



        //openAdminHome();
        //openUserHome();
        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.d("STATE","Button Clicked");
                EditText userName = (EditText) findViewById(R.id.userName);
                EditText password = (EditText) findViewById(R.id.password);
                String userNameTxt = userName.getText().toString();
                String passwordTxt = password.getText().toString();

                Log.d("STATE",userNameTxt);
                Log.d("STATE",passwordTxt);


               // auth(userNameTxt,passwordTxt);
                if (passwordTxt.equals("nimda") && userNameTxt.equals("admin")){
                    Toast.makeText(getBaseContext(),"Success",Toast.LENGTH_SHORT).show();
                    openAdminHome();
                }


                else{
                    AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                    a_builder.setMessage("Username ot Password error!")
                            .setCancelable(false)
                            .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            . setNegativeButton("Retry", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert =a_builder.create();
                    alert.setTitle("Error !");
                    alert.show();
                }
            }
        });





    }

    public void openAdminHome(){
        Log.d("STATE","openAdminHome running");
        Intent intent =new Intent(MainActivity.this,AdminHome.class);
        startActivity(intent);
    }


}
