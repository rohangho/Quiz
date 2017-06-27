package com.example.android.kbc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int radioscorebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SUBMIT(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        String name1 = name.getText().toString();
        EditText animal = (EditText) findViewById(R.id.animal);
        String animal1 = animal.getText().toString();
        CheckBox milk = (CheckBox) findViewById(R.id.milk);
        boolean milk1 = milk.isChecked();
        CheckBox icecream = (CheckBox) findViewById(R.id.icecream);
        boolean icecream1 = icecream.isChecked();
        CheckBox wine = (CheckBox) findViewById(R.id.wine);
        boolean wine1 = wine.isChecked();
        int finalscore = check(milk1, icecream1, wine1, name1, animal1);
        Toast.makeText(MainActivity.this, "THE SCORE IS "+finalscore, Toast.LENGTH_SHORT).show();
        display(finalscore);
    }

    public int check(boolean a, boolean b, boolean o, String d, String e) {
        int score = 0;
        int f=0;
        if (a == true) {
            if (b == true) {
                if (o == false) {
                    score = score + 1;
                }
            }
        }
        if (d.equals("Bill")) {
            score = score + 1;
        }
        if (e.equals("India")) {
            score = score + 1;
        }
        else {
            f=f+1;
        }
        return (score + radioscorebutton);
    }

    public void onRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.TEN:
                if (checked) {
                    radioscorebutton++;
                }
                break;
            case R.id.TWENTY:
                if (checked) {
                    radioscorebutton = 0;
                }
                break;
            case R.id.THIRTY:
                if (checked) {
                    radioscorebutton = 0;
                }
                break;
        }
    }
    public void display(int a) {
        TextView textView = (TextView) findViewById(R.id.SCORE);
        textView.setText("" + a);

    }
}
