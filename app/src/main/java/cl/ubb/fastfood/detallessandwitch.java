package cl.ubb.fastfood;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detallessandwitch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detallessandwitch);

        TextView titulo = (TextView) findViewById(R.id.titulodescripcion);
        TextView detalles = (TextView) findViewById(R.id.brevedescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));
        }

    }
}
