package com.example.secondscreen;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;

import com.github.anastr.speedviewlib.SpeedView;

public class SecondaryDisplay extends Presentation {
    /**
     * Creates a new presentation that is attached to the specified display
     * using the default theme.
     *
     * @param outerContext The context of the application that is showing the presentation.
     *                     The presentation will create its own context (see {@link #getContext()}) based
     *                     on this context and information about the associated display.
     * @param display      The display to which the presentation should be attached.
     */
    public SecondaryDisplay(Context outerContext, Display display) {
        super(outerContext, display);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondary_display);
        SpeedView speedView = (SpeedView) findViewById(R.id.speedView);
        speedView.speedTo(50);
    }
}
