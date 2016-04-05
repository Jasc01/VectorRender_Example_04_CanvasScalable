package com.example.jasc9.vectorrender_example_04_canvasscalable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SpaceShipView spaceShip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spaceShip = (SpaceShipView) findViewById(R.id.space_ship);
        spaceShip.setVectorWidth(150);
        spaceShip.setVectorHeight(183);
        spaceShip.invalidate();
    }
}
