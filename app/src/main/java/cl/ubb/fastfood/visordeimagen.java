package cl.ubb.fastfood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class visordeimagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visordeimagen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        ImageView img = (ImageView) findViewById(R.id.imagencompleta);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null){
            img.setImageResource(b.getInt("IMG"));
        }


    }
}
