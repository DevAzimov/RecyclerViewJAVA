package com.magicapp.recyclerviewjava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.magicapp.recyclerviewjava.R;
import com.magicapp.recyclerviewjava.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button btn_rcyler = findViewById(R.id.btn_rcycler);
        btn_rcyler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRcyclerActivity();
//                User user = new User(11, "PDP");
//                openDetailActivity(user);
            }
        });
    }
    void openDetailActivity(User user){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user", user);
//        intent.putExtra("name", "PDP");
        startActivity(intent);
    }

    void openRcyclerActivity(){
        Intent intent = new Intent(this, RecyclerActivity.class);
        startActivity(intent);
    }
}