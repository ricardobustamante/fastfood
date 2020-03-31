package cl.ubb.fastfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button nosotross;
    private Button sandwitch;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nosotross = findViewById(R.id.botonsobrenosotros);
        sandwitch = findViewById(R.id.botonsandwitch);
        imagen = findViewById(R.id.logo);
    }

    public void nosotrosabrir(View view) {
        Intent nosotrosabrir = new Intent(this, nosotros.class);
        startActivity(nosotrosabrir);

    }
    public void nosotrossandwitch(View view) {
        Intent nosotrossandwitch = new Intent(this, sandwitch.class);
        startActivity(nosotrossandwitch);

    }
}
