package cl.ubb.fastfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class sandwitch extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"Italiano","600 gramos","$4.500","Detalles Aqui!","600 gramos de bistec de posta rosada, 1 paltas grandes,1 tomate grande,2 panes frica ,mayonesa"},
            {"chacarero","550 gramos","$4.500","Detalles Aqui!","550 gramos de bistec de posta rosada, porotos verdes ,1 tomate grande,2 panes frica ,mayonesa"},
            {"luco","500 gramos","$4.000","Detalles Aqui!","500 gramos de bistec de posta rosada, 2 laminas de queso derretido,2 panes frica "},
            {"pollo","600 gramos","$3.500","Detalles Aqui!","600 gramos de pollo frito, lechuga ,1 tomate grande,2 panes frica ,mayonesa"},
            {"lomito","600 gramos","$4.500","Detalles Aqui!","600 gramos de lomito de cerdo, 1 palta grande,2 panes frica ,mayonesa"},
            {"jarpa","400 gramos","$2.000","Detalles Aqui!","400 gramos de jamon ahumado de cerdo, 2 laminas de queso derretido ,1 palta ,2 panes frica "},
    };

    int[] datosimg ={R.drawable.italianoimagen,R.drawable.chacareroimagen,R.drawable.lucoimagen,R.drawable.polloimagen,R.drawable.lomitoimagen,R.drawable.jarpaimagen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwitch);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(new adaptador(this, datos, datosimg));


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visordetalles = new Intent(view.getContext(), detallessandwitch.class);
                visordetalles.putExtra("TIT", datos[position][0]);
                visordetalles.putExtra("DET", datos[position][4]);
                startActivity(visordetalles);
            }
        });
    }

}
