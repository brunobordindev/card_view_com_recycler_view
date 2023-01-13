package com.example.cardview_comrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview_comrecyclerview.R;
import com.example.cardview_comrecyclerview.model.Postagem;

import java.util.List;

public class AdapterPostagem extends RecyclerView.Adapter<AdapterPostagem.MyViewHolder> {

    private List<Postagem> listaPostagem;

    public AdapterPostagem(List<Postagem> listaPostagem) {
        this.listaPostagem = listaPostagem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemPostagem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_adapter_postagem, parent, false);

        return new MyViewHolder(itemPostagem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = listaPostagem.get(position);
        holder.nome.setText(postagem.getNome());
        holder.imagem.setImageResource(postagem.getImagem());
        holder.postagem.setText(postagem.getPostagem());

    }

    @Override
    public int getItemCount() {
        return listaPostagem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textName);
            postagem = itemView.findViewById(R.id.textPostagem);
            imagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
