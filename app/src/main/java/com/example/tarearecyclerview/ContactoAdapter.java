package com.example.tarearecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder> {
    
    ArrayList<Contacto> coleccion;

    public ContactoAdapter(ArrayList<Contacto> coleccion) {
        this.coleccion = coleccion;
    }

    @NonNull
    @Override
    public ContactoAdapter.ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactoAdapter.ContactoViewHolder contactoViewHolder =
                new ContactoViewHolder(
                        LayoutInflater.from(parent.getContext()).inflate(R.layout.fichacontacto,parent,false)
                );
        return contactoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoAdapter.ContactoViewHolder holder, int position) {
        Contacto contacto = coleccion.get(position);
        holder.imageView.setImageResource(contacto.getFoto());
        holder.tv_nombreCompleto.setText(contacto.getNombre() + "  " + contacto.getApellidos());//);
        holder.tv_email.setText(contacto.getEmail());
        holder.tv_telefono.setText(contacto.getTelefono());
    }

    @Override
    public int getItemCount() {
        return coleccion.size();
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tv_nombreCompleto;
        TextView tv_email;
        TextView tv_telefono;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.foto);
            tv_nombreCompleto = itemView.findViewById(R.id.nombreCompleto);
            tv_email = itemView.findViewById(R.id.email);
            tv_telefono = itemView.findViewById(R.id.telefono);
        }
    }
}
