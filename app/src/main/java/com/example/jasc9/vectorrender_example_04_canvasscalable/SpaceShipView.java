package com.example.jasc9.vectorrender_example_04_canvasscalable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jasc9 on 5/4/2016.
 */
public class SpaceShipView extends View {

    private VectorDrawableCompat spaceShip;
    private int vectorWidth = 297;
    private int vectorHeight = 362;

    public SpaceShipView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        prepareImage();
    }

    public SpaceShipView(Context context, AttributeSet attrs) {
        super(context, attrs);
        prepareImage();
    }

    public SpaceShipView(Context context) {
        super(context);
        prepareImage();
    }

    public void prepareImage() {
        Resources res = getResources();
        spaceShip = VectorDrawableCompat.create(res, R.drawable.space_ship, null);
    }

    public void setVectorWidth(int pWIdth) {
        this.vectorWidth = pWIdth;
    }

    public void setVectorHeight(int pHeight) {
        this.vectorHeight = pHeight;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawARGB(0, 255, 255, 255);

        spaceShip.setBounds(0, 0, vectorWidth, vectorHeight);
        spaceShip.draw(canvas);
    }
}
