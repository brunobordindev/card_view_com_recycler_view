package com.example.cardview_comrecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview_comrecyclerview.R;
import com.example.cardview_comrecyclerview.adapter.AdapterPostagem;
import com.example.cardview_comrecyclerview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> listaPostagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        criarPostagens();
        //Adapter
        AdapterPostagem adapter = new AdapterPostagem(listaPostagem);

        //Configuracao recyclerPostagem
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);
        recyclerPostagem.setAdapter(adapter);

        //      Pode mostrar um grid de imagens
//      LinearLayoutManager layoutManager = new GridLayoutManager(this, 4);
//      recyclerPostagem.setLayoutManager(layoutManager);
//      recyclerPostagem.setHasFixedSize(true);
//      recyclerPostagem.setAdapter(adapter);
    }

    public void criarPostagens(){

        Postagem postagem = new Postagem("Bruno Bordin", "#tbt Viajando pelo mundo!", R.drawable.imagem1);
        listaPostagem.add(postagem);

        postagem = new Postagem("Rubens Amaral", "Em cima das nuvens!", R.drawable.imagem2);
        listaPostagem.add(postagem);

        postagem = new Postagem("Stephane", "#tbt Paris!", R.drawable.imagem3);
        listaPostagem.add(postagem);

        postagem = new Postagem("Dra. Patricia do Amaral ", "#tbt Amo mato!", R.drawable.imagem4);
        listaPostagem.add(postagem);
    }
}