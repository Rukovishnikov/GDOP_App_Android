package com.onlylemi.mapview.library.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;

import com.onlylemi.mapview.library.MapView;

public class AnchorLayer extends MapBaseLayer {

    public AnchorLayer(MapView mapView) {
        super(mapView);
    }

    @Override
    public void onTouch(MotionEvent event) {

    }

    @Override
    public void draw(Canvas canvas, Matrix currentMatrix, float currentZoom, float currentRotateDegrees) {

    }
}
