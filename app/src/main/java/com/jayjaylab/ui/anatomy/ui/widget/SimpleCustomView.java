package com.jayjaylab.ui.anatomy.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.jayjaylab.ui.anatomy.util.Log;

/**
 * Created by jjkim on 2016. 7. 20..
 */
public class SimpleCustomView extends View {
    public SimpleCustomView(Context context) {
        super(context);
        init(context, null);
    }

    public SimpleCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public SimpleCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SimpleCustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    void init(Context context, AttributeSet atrs) {

    }

    void logMode(int measureSpec) {
        switch(measureSpec) {
            case MeasureSpec.AT_MOST:
                Log.d("at_most");
                break;
            case MeasureSpec.EXACTLY:
                Log.d("exactly");
                break;
            case MeasureSpec.UNSPECIFIED:
                Log.d("unspeicified");
                break;
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if(Log.DEBUG) Log.d("widthMeasureSpec : " + widthMeasureSpec
                + ", heightMeasureSpec : " + heightMeasureSpec);

        logMode(View.MeasureSpec.getMode(widthMeasureSpec));
        Log.d("w.size : " + View.MeasureSpec.getSize(widthMeasureSpec));
        logMode(View.MeasureSpec.getMode(heightMeasureSpec));
        Log.d("h.size : " + View.MeasureSpec.getSize(heightMeasureSpec));
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if(Log.DEBUG) Log.d("changed : " + changed
                + ", l : " + left + ", t : " + top + ", r : " + right +", b : " + bottom);
    }
}
