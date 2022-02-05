package com.magicapp.recyclerviewjava.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.magicapp.recyclerviewjava.R;
import com.magicapp.recyclerviewjava.model.User;

public class DetailActivity extends AppCompatActivity {
    static final String TAG = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }
    void initViews(){
        TextView tv_detail = findViewById(R.id.tv_detail);

        User user = (User) getIntent().getSerializableExtra("user");
        Log.d(TAG, user.toString());
        tv_detail.setText(user.toString());

//        String name =  getIntent().getStringExtra("name");
//        Log.d(TAG, name);
//
//        tv_detail.setText(name);
    }
}
