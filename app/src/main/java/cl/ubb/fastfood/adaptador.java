package cl.ubb.fastfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosimg;

    public adaptador (Context conexto, String[][] datos, int[] imagenes)
    {
        this.contexto = conexto;
        this.datos = datos;
        this.datosimg = imagenes;

        inflater = (LayoutInflater) conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView titulo = (TextView) vista.findViewById(R.id.titulosandwitch);
        TextView tamaños = (TextView) vista.findViewById(R.id.tamañosandwitch);
        TextView precio = (TextView) vista.findViewById(R.id.preciosandwitch);
        TextView informacion = (TextView) vista.findViewById(R.id.botoninfo);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView);

        titulo.setText(datos[i][0]);
        tamaños.setText(datos[i][1]);
        precio.setText("precio " + datos[i][2]);
        imagen.setImageResource(datosimg[i]);
        informacion.setText(datos[i][3]);


        imagen.setTag(i);

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visordeimagen = new Intent(contexto, visordeimagen.class);
                visordeimagen.putExtra("IMG", datosimg[(Integer)v.getTag()]);
                contexto.startActivity(visordeimagen);
            }
        });

        return vista;
    }

    @Override
    public int getCount() {
        return datosimg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
