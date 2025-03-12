package com.dev.myapplication.controller;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.dev.myapplication.R;
import com.dev.myapplication.model.book;
import com.dev.myapplication.view.BookDetailActivity;

import java.util.List;

public class book_mng_Adapter extends  RecyclerView.Adapter<book_mng_Adapter.BookViewHolder> {
    private List<book> bookList;

    public book_mng_Adapter(List<book> bookList) {
        this.bookList = bookList;
    }


    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_mng_viewholder, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull book_mng_Adapter.BookViewHolder holder, int position) {
        book bookitem = bookList.get(position);
        holder.bookName.setText(bookitem.getBookname());
        holder.bookTitle.setText(bookitem.getTitle());
       holder.btnBD.setOnClickListener(v-> {
            Intent intent =new Intent(v.getContext(), BookDetailActivity.class);
            intent.putExtra("bookName",bookitem.getBookname());
            intent.putExtra("bookTitle",bookitem.getTitle());
            intent.putExtra("bookImage",bookitem.getImage());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView bookName,bookTitle;
        ImageView bookImage;
        Button btnBD;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookTitle = itemView.findViewById(R.id.bookTitle);
            bookName = itemView.findViewById(R.id.bookName);
            bookImage = itemView.findViewById(R.id.bookimg);
            btnBD = itemView.findViewById(R.id.btnBD);
        }
    }
}