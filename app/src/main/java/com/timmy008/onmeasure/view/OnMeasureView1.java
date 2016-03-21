package com.timmy008.onmeasure.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tan on 2016/3/21.
 */
public class OnMeasureView1 extends View{
    public OnMeasureView1(Context context) {
        this(context, null);
    }

    public OnMeasureView1(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OnMeasureView1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
