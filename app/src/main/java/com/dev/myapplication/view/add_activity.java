package com.dev.myapplication.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.dev.myapplication.R;

public class add_activity extends AppCompatActivity {
    private EditText inBookName, inBookContent;
    private Button addbtn;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        inBookName = findViewById(R.id.inBookName);
        inBookContent = findViewById(R.id.inBookContent);
        addbtn = findViewById(R.id.addbtn);
        imageView = findViewById(R.id.imageView);

    }
}