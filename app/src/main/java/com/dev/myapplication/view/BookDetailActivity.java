package com.dev.myapplication.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dev.myapplication.R;

public class BookDetailActivity extends AppCompatActivity {
    private TextView bookName,bookTitle;
    private ImageView bookImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book_detail);

        bookTitle = findViewById(R.id.booktitle);
        bookName = findViewById(R.id.bookname);
        bookImage = findViewById(R.id.bookimage);

        Intent intent = getIntent();
        String name = intent.getStringExtra("bookName");
        String title = intent.getStringExtra("bookTitle");
        int image = intent.getIntExtra("bookImage",0);

        bookName.setText(name);
        bookTitle.setText(title);
        bookImage.setImageResource(image);

    }
}