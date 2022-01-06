package com.example.canvasdraw.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private static int SQUAR_SIZE = 100;
    private Rect rect;
    private Paint paint;

    public CustomView(Context context) {
        super(context);

        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init (@Nullable AttributeSet set){

         rect = new Rect();
         paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas){

        rect.left = 10;
        rect.top  = 10;
        rect.right= rect.left + SQUAR_SIZE;
        rect.bottom= rect.top+ SQUAR_SIZE;

        paint.setColor(Color.GREEN);



        canvas.drawRect(rect , paint);
        //canvas.drawColor(Color.RED);


    }

}
