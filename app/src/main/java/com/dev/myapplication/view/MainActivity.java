package com.dev.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.myapplication.R;
import com.dev.myapplication.controller.book_mng_Adapter;
import com.dev.myapplication.model.book;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private book_mng_Adapter adapter;
    private List<book> bookList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        View mng_book = findViewById(R.id.mng_book);
        mng_book.setOnClickListener(v -> {
            Intent intent = new Intent(this, book_mng_activity.class);
            startActivity(intent);  
        });
    }
}