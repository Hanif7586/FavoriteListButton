package com.favorite.favouritebutton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.favorite.favouritebutton.ui.FavoriteActivity;
import com.favorite.favouritebutton.ui.FavoriteDao;
import com.favorite.favouritebutton.ui.FavoriteDatabase;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FavoriteDao mFavoriteDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FavoriteDatabase db = FavoriteDatabase.getDatabase(this);
        mFavoriteDao = db.getDao();

        Button save = findViewById(R.id.btn_getData);
        save.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), FavoriteActivity.class)));

        getData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();
    }

    private void getData() {
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        List<MyModel> list = new ArrayList<>();
        list.add(new MyModel(1, "Burger", "Price:$12.0",R.drawable.burger));
        list.add(new MyModel(2, "Coffee", "Price:$15.0",R.drawable.coffee));
        list.add(new MyModel(3, "Crispy Fried", "Price:$18.0",R.drawable.crispy_fried_chicken));
        list.add(new MyModel(4, "Burger", "Price:$12.0",R.drawable.burger));
        list.add(new MyModel(5, "Coffee", "Price:$15.0",R.drawable.coffee));
        list.add(new MyModel(6, "Crispy Fried", "Price:$18.0",R.drawable.crispy_fried_chicken));
        list.add(new MyModel(7, "Burger", "Price:$12.0",R.drawable.burger));
        list.add(new MyModel(8, "Coffee", "Price:$15.0",R.drawable.coffee));
        list.add(new MyModel(9, "Crispy Fried", "Price:$18.0",R.drawable.crispy_fried_chicken));
        list.add(new MyModel(10, "Burger", "Price:$12.0",R.drawable.burger));
        list.add(new MyModel(11, "Coffee", "Price:$15.0",R.drawable.coffee));
        list.add(new MyModel(12, "Crispy Fried", "Price:$18.0",R.drawable.crispy_fried_chicken));
        list.add(new MyModel(13, "Burger", "Price:$12.0",R.drawable.burger));
        list.add(new MyModel(14, "Coffee", "Price:$15.0",R.drawable.coffee));
        list.add(new MyModel(15, "Crispy Fried", "Price:$18.0",R.drawable.crispy_fried_chicken));
        list.add(new MyModel(16, "hanif", "Price:$19.0",R.drawable.ic_launcher_background));

        MyAdapter adapter = new MyAdapter(list, mFavoriteDao);
        recyclerView.setAdapter(adapter);
    }

}
