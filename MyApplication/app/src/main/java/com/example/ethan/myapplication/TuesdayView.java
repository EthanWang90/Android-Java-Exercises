package com.example.ethan.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Paint;

public class TuesdayView extends View {
    public TuesdayView(Context context) {
        super(context);
    }

    public TuesdayView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TuesdayView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    float x = 20f;
    float y = 20f;
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.CYAN);
        canvas.drawCircle(x, y, 200, paint);
        x = x + 0.5f;
        y = y + 0.5f;

        invalidate();
    }
}
