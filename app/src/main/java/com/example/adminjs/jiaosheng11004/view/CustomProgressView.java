package com.example.adminjs.jiaosheng11004.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.xys.libzxing.zxing.activity.CaptureActivity;

/**
 * Created by Adminjs on 2017/11/4.
 */
public class CustomProgressView extends View {

    //定义一个画笔
    private Paint paint;

    private int progress = 0;
    Context context;

    public CustomProgressView(Context context) {
        super(context);
    }

    public CustomProgressView(Context context, AttributeSet attrs) {
        this(context, attrs,0);

    }


    public CustomProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        //创建一个画笔
        paint = new Paint();
        // 抗锯齿
        paint.setAntiAlias(true);
        //设置画笔的颜色
        paint.setColor(Color.RED);
        //设置画笔 填充是空心的
        paint.setStyle(Paint.Style.STROKE);

    }

    public void start(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {


                    if (progress >= 360) {
                        Intent intent = new Intent(context, CaptureActivity.class);
                        context.startActivity(intent);
                        return;
                    }
                    progress += 10;

                    //子线程刷新 系统调用onDraw（） 方法
                    postInvalidate();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }).start();

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int x = getWidth() / 2;
        int y = getHeight() / 2;

        int radius = 100;

        paint.setStrokeWidth(20);
        RectF rectF = new RectF(x - radius, y - radius, x + radius, y + radius);
        canvas.drawArc(rectF, -90, progress, false, paint);
        int text = (int) ((float) progress / 360 * 100);
        float textWidth = paint.measureText(text + "%");
        Rect rextText = new Rect();
        paint.getTextBounds(text + "%", 0, (text + "%").length(), rextText);


        paint.setTextSize(30);
        paint.setStrokeWidth(1);
        //画文字
        canvas.drawText(text + "%", x - textWidth / 2, y + rextText.height() / 2, paint);


    }


}
