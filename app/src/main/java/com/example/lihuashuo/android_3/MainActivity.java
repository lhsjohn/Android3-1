package com.example.lihuashuo.android_3;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lihuashuo.android_3.com.lhs.fragment.TextFragment1;
import com.example.lihuashuo.android_3.com.lhs.fragment.TextFragment3;
import com.example.lihuashuo.android_3.com.lhs.fragment.TextFragment4;
import com.example.lihuashuo.android_3.com.lhs.fragment.TextFragment5;
import com.example.lihuashuo.android_3.com.lhs.fragment.TopFragment;

public class MainActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.btn1);
        TopFragment topFragment = new TopFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.topfragementlayout, topFragment);
        fragmentTransaction.commit();
        button1.setOnClickListener(new Button1ClickListener());
        Button button2=findViewById(R.id.btn2);
        button2.setOnClickListener(new Button2Listener(this));
        Button button3=findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextFragment3 textFragment3=new TextFragment3();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.topfragementlayout,textFragment3);
                fragmentTransaction.commit();
            }
        });
              Button button4=findViewById(R.id.btn4);
              button4.setOnClickListener(this);
     }
     @Override
       public void onClick(View v) {
         TextFragment4 textFragment4=new TextFragment4();
         FragmentManager fragmentManager=getFragmentManager();
         FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.topfragementlayout,textFragment4);
         fragmentTransaction.commit();
      }

    public void clickHandler(View view){
      TextFragment5 textFragment5=new TextFragment5();
      FragmentManager fragmentManager=getFragmentManager();
      FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
      fragmentTransaction.replace(R.id.topfragementlayout,textFragment5);
      fragmentTransaction.commit();
    }
    class Button1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            TextFragment1 fragment1 = new TextFragment1();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.topfragementlayout, fragment1);
            transaction.commit();
        }
    }


}