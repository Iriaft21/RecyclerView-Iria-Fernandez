package com.example.tarearecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements ContactoAdapter.OnItemClickListener{

    public ArrayList<Contacto> contactoArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        contactoArrayList = new ArrayList<>(Arrays.asList(new Contacto[]{
                new Contacto("Lucia", R.drawable.perfil1,"Garcia Perez", "lgarcia@example.com", "600123456"),
                new Contacto("Carlos", R.drawable.perfil2,"Martinez Rodriguez", "cmartinez@example.com", "600345678"),
                new Contacto("Ana", R.drawable.perfil3,"Lopez Gomez", "alopez@example.com", "600234567"),
                new Contacto("Marta", R.drawable.perfil4,"Hernandez Sanchez", "mhernandez@example.com", "600456789"),
                new Contacto("Javier", R.drawable.perfil5,"Gonzalez Fernandez", "jgonzalez@example.com", "600567890"),
                new Contacto("Elena", R.drawable.perfil6,"Perez Gonzalez", "eperez@example.com", "600678901"),
                new Contacto("Miguel", R.drawable.perfil7,"Sanchez Lopez", "msanchez@example.com", "600789012"),
                new Contacto("Sara", R.drawable.perfil8,"Ramirez Martinez", "sramirez@example.com", "600890123"),
                new Contacto("Laura", R.drawable.perfil9,"Torres Garcia", "ltorres@example.com", "600901234"),
                new Contacto("Pablo", R.drawable.perfil10,"Diaz Hernandez", "pdiaz@example.com", "600012345"),
                new Contacto("Carla", R.drawable.perfil11,"Ruiz Jimenez", "cruiz@example.com", "600123457"),
                new Contacto("Maria", R.drawable.perfil12,"Moreno Ortiz", "mmoreno@example.com", "600234568")
        }));

        //crear adaptador
        ContactoAdapter adapter = new ContactoAdapter(contactoArrayList, this);
        //instanciar recyclerView
        RecyclerView rvContactos = findViewById(R.id.rv_contacto);

        // modificar el tipo de LayoutManager (opcional)
        rvContactos.setLayoutManager(new LinearLayoutManager(this));

        // Asignar el adaptador al RecyclerView
        rvContactos.setAdapter(adapter);


    }

    @Override
    public void onItemClick(View view, int position) {
        Contacto contacto = contactoArrayList.get(position);
        Toast.makeText(this, "Nombre: " + contacto.getNombre() + " " + contacto.getApellidos() + "\n Telefono: " + contacto.getTelefono() + " Email: " + contacto.getEmail(), Toast.LENGTH_SHORT).show();
    }
}