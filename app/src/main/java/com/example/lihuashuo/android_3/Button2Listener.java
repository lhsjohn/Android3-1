package com.example.lihuashuo.android_3;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

import com.example.lihuashuo.android_3.com.lhs.fragment.TextFragment2;

/**
 * Created by lihuashuo on 2018/5/5.
 */

public class Button2Listener implements View.OnClickListener {
    private Activity activity;

    public Button2Listener(Activity activity) {
        this.activity = activity;
    }
    @Override
    public void onClick(View v) {
      TextFragment2 textFragment2=new TextFragment2();
        FragmentManager fragmentManager=activity.getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.topfragementlayout,textFragment2);
        fragmentTransaction.commit();
    }
}
