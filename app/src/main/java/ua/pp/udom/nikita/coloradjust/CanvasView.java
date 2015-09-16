package ua.pp.udom.nikita.coloradjust;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CanvasView extends View {
    private Paint mPaint;

    public CanvasView(Context c, AttributeSet attrs) {
        super(c, attrs);

        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), mPaint);
    }


    public void draw(int color) {
        mPaint.setColor(color);
        invalidate();
    }
}

