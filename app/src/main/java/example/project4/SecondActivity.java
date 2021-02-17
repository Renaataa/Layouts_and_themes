package example.project4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TableLayout;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup layout = getLayout(getIntent().getStringExtra("key1"));
        if(layout == null) return;
        layout.addView(new ProgressBar(this));
        layout.addView(new RadioButton(this));
        layout.addView(new RatingBar(this));
        layout.addView(new CheckBox(this));
        layout.addView(new Switch(this));
        layout.addView(new SeekBar(this));
        setContentView(layout);
    }

    private ViewGroup getLayout(String message){
        switch (message){
            case "Frame Layout": return new FrameLayout(this);
            case "Linear Layout": return new LinearLayout(this);
            case "Table Layout": return new TableLayout(this);
            case "Grid Layout": return new GridLayout(this);
            case "Relative Layout": return new RelativeLayout(this);
        }
        return null;
    }
}