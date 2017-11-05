package com.example.adminjs.jiaosheng11004.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Adminjs on 2017/11/4.
 */
public class CustmuProgressView extends View {
    Context context;
    public CustmuProgressView(Context context) {
        super(context);
    }

    public CustmuProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public CustmuProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustmuProgressView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setTextSize(10);
        paint.setColor(Color.BLACK);
        Rect rect = new Rect(0,0,150,80);
        canvas.drawRect(rect,paint);

        Paint pain = new Paint();
        pain.setTextSize(10);
        pain.setColor(Color.RED);
        Rect rect1 = new Rect(150,150,300,160);
        canvas.drawRect(rect1,pain);

        Paint pain3 = new Paint();
        pain3.setTextSize(10);
        pain3.setColor(Color.BLUE);
        Rect rect2 = new Rect(150,150,300,160);
        canvas.drawRect(rect2,pain3);
        canvas.drawRect(150,80,300,160,paint);
        canvas.drawRect(300,160,500,250,pain);
        canvas.drawRect(150,80,300,160,pain3);

    }


}
