package com.example.cne_shop.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by 博 on 2017/8/21.
 */

public abstract class BaseFragment extends Fragment {

    protected Context mContext ;
    protected View mView ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int resRootViewId =  getResRootViewId () ;
        mView = inflater.inflate(resRootViewId , container , false) ;
        mContext = this.getContext() ;
        init();

        return mView ;
    }

    protected abstract int getResRootViewId() ;
    protected abstract void init() ;

}
