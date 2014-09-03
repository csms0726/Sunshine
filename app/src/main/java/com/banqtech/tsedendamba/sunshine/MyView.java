package com.banqtech.tsedendamba.sunshine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Tsedendamba on 9/3/2014.
 */
public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int hSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int hSpecSize = MeasureSpec.getSize(heightMeasureSpec);
        int myHeight = hSpecSize;

        int wSpecMode = MeasureSpec.getMode(widthMeasureSpec);
        int wSpecSize = MeasureSpec.getSize(widthMeasureSpec);
        int myWidth = wSpecSize;

        if(hSpecMode == MeasureSpec.EXACTLY){
            myHeight = hSpecSize;
        } else if (hSpecMode == MeasureSpec.AT_MOST) {

        }

        if(wSpecMode == MeasureSpec.EXACTLY){
            myWidth = hSpecSize;
        } else if (wSpecMode == MeasureSpec.AT_MOST) {

        }
        setMeasuredDimension(myWidth,myHeight);
    }
}
