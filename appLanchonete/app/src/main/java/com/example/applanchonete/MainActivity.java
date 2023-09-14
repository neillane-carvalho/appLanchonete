package com.example.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.main_listview_itens);

        List lista = Arrays.asList("Hambuerguer Big", "Suco de Laranja", "Coxinha de frango", "Brigadeirao");

        ListAdapter adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(adapter);

    }
}