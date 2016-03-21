package com.timmy008.onmeasure.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tan on 2016/3/21.
 */
public class OnMeasureView2 extends View {
    public OnMeasureView2(Context context) {
        this(context, null);
    }

    public OnMeasureView2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OnMeasureView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(widthMeasureSpec));
    }

    private int measureHeight(int widthMeasureSpec) {
        int result = 0;
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        if (mode == MeasureSpec.EXACTLY) {
            return size;
        } else {
            // 给个默认值
            result = 200;
            if (mode == MeasureSpec.AT_MOST) {
                result = Math.min(result, size);
            }
        }
        return result;
    }

    private int measureWidth(int widthMeasureSpec) {
        int result = 0;
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int size = MeasureSpec.getSize(widthMeasureSpec);
        if (mode == MeasureSpec.EXACTLY) {
            return size;
        } else {
            result = 200;
            if (mode == MeasureSpec.AT_MOST) {
                result = Math.min(result, size);
            }
        }
        return result;
    }
}
