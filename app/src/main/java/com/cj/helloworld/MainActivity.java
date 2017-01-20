package com.cj.helloworld;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int i = 0;

    public void click(View view) {

        EditText myText1 = (EditText) findViewById(R.id.userName);
        EditText myText2 = (EditText) findViewById(R.id.userPass);

        Toast.makeText(MainActivity.this, "Welcome, " + myText1.getText().toString() + "!", Toast.LENGTH_LONG).show();

        Log.i("Info", myText1.getText().toString());
        Log.i("Info", myText2.getText().toString());
    }

    public void switcher(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        if(checked && i==0){
            ImageView image = (ImageView) findViewById(R.id.team);
            image.setImageResource(R.drawable.hawgs);

            Toast.makeText(MainActivity.this, "Go Hawgs!", Toast.LENGTH_SHORT).show();

            i = 1;
        }else{
            ImageView image = (ImageView) findViewById(R.id.team);
            image.setImageResource(R.drawable.paw_1);

            Toast.makeText(MainActivity.this, "Go Tigers!", Toast.LENGTH_SHORT).show();

            ((RadioButton) view).setChecked(false);
            i = 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
