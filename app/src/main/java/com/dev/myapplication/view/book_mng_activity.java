package com.dev.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.myapplication.R;
import com.dev.myapplication.controller.book_mng_Adapter;
import com.dev.myapplication.model.book;

import java.util.ArrayList;
import java.util.List;

public class book_mng_activity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private book_mng_Adapter adapter;
    private List<book> bookList;
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_mng);
        recyclerView = findViewById(R.id.show_book);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bookList = new ArrayList<>();

        adapter = new book_mng_Adapter(bookList);
        recyclerView.setAdapter(adapter);

        addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(v->{
            Intent intent = new Intent(this,add_activity.class);
            startActivity(intent);
        });
    }
}