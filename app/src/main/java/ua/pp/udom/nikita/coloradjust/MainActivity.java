package ua.pp.udom.nikita.coloradjust;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private CanvasView customCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customCanvas = (CanvasView) findViewById(R.id.signature_canvas);
    }

    public void draw(View v) {
        int red = Integer.parseInt((((EditText) findViewById(R.id.red)).getText().toString()));
        int green = Integer.parseInt((((EditText) findViewById(R.id.green)).getText().toString()));
        int blue = Integer.parseInt((((EditText) findViewById(R.id.blue)).getText().toString()));
        int color = Color.rgb(red, green, blue);
        customCanvas.draw(color);
    }
}
