package com.example.android.kbc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void SUBMIT(View view) {
        int m=0;
        EditText name = (EditText) findViewById(R.id.NAME);
        String name1 = name.getText().toString();

        EditText animal = (EditText) findViewById(R.id.ANIMAl);
        String animal1 = animal.getText().toString();

        CheckBox milk = (CheckBox) findViewById(R.id.MILK);
        boolean milk1 = milk.isChecked();

        CheckBox icecream = (CheckBox) findViewById(R.id.ICECREAM);
        boolean icecream1 = icecream.isChecked();


        display(check(milk1,icecream1,name1,animal1));

    }

    public  int check(boolean a,boolean b,String d,String e){
        int c=0;
        if(a==true){if (b=true){c=c+1;}}
        if(d.equals("Bill")){c=c+1;}
        if(e.equals("India")){c=c+1;}
        return (c+k);
    }

    public void onRadioButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.TEN:
                if (checked) {
                    k++;
                }
                break;
            case R.id.TWENTY:
                if (checked) {
                    k = 0;
                }
                break;
            case R.id.THIRTY:
                if (checked) {
                    k = 0;
                }
                break;
        }
    }





    public  void display(int a){
        TextView textView = (TextView) findViewById(R.id.SCORE);
        textView.setText(""+a);
    }

}
