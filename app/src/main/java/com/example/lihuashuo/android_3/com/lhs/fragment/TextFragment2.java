package com.example.lihuashuo.android_3.com.lhs.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lihuashuo.android_3.R;

/**
 * Created by lihuashuo on 2018/5/5.
 */

public class TextFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.text2_layout,container,false);
        return  view;

    }
}
