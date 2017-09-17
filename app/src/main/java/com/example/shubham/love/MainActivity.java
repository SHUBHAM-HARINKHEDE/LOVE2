package com.example.shubham.love;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView t;
    Button b;
    int ex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int min(int a,int b){
        if(a<b){
            return(a);
        }
        else return(b);
    }
    int max(int a,int b){
        if(a>b){
            return(a);
        }
        else return(b);
    }

    public void onButtonClick(View v){


        try{

            t1=(EditText)findViewById(R.id.editText);
            t2=(EditText)findViewById(R.id.editText2);
            t=(TextView)findViewById(R.id.textView2);
            String y=t1.getText().toString();
            String p=t2.getText().toString();
            char[] a=new char[y.length()];
            char[] b=new char[p.length()];
           int s1=0,s2=0;

            for (int i=0;i<min(y.length(),p.length());i++){
                a[i]=y.charAt(i);
                b[i]=p.charAt(i);
                s1=s1+(Character.getNumericValue(a[i]));
                s2=s2+(Character.getNumericValue(b[i]));




            }
            ex=min(s1,s2)*100/max(s1,s2);
            if(ex==84)
                t.setText("100%");
            else
            t.setText(Integer.toString(ex)+"%");



        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG);
        }

    }
}
