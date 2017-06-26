package com.example.android.quizmaster;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.example.android.quizmaster.R;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int m=0;
    public void SUBMIT (View view){
        int a=0;


        EditText name=(EditText) findViewById(R.id.NAME);;
        String name1= name.getText().toString();

        EditText animal=(EditText) findViewById(R.id.ANIMAl);;
        String animal1= animal.getText().toString();

        CheckBox milk=(CheckBox) findViewById(R.id.MILK);
        boolean milk1=milk.isChecked();

        CheckBox icecream=(CheckBox) findViewById(R.id.ICECREAM);
        boolean icecream1=icecream.isChecked();

        boolean checked=((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.TEN:
                if(checked){a=a+1;}
                break;

        }


        int c= scorecalculator(milk1,icecream1,a,animal1,name1);

        display(c);


    }

    public   int scorecalculator (boolean a, boolean b, int f,String d,String e){
        int m=0;
        if (a==true&&b==true)
            m=m+1;
        if(f==1){m=m+1;}

        if (d=="India"){m=m+1;}
        if (e=="Bill Gates")
            m=m+1;

        return m;
    }
    public void RESET(View view){
        int m=0;
        display(m);
    }

    public void display(int a){
        TextView textView = (TextView)findViewById(R.id.SCORE);
        textView.setText(a);

    }
}


