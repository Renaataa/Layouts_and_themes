package example.project4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
        setContentView(R.layout.activity_main);
    }

    public void makeLayout(View view){
        Button b = (Button) view;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key1", b.getText());
        startActivity(intent);
    }
}