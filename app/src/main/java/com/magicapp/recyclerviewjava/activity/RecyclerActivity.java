package com.magicapp.recyclerviewjava.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.magicapp.recyclerviewjava.R;
import com.magicapp.recyclerviewjava.adapter.RecyclerAdapter;
import com.magicapp.recyclerviewjava.model.Member;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initViews();
    }
    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));
        members.add(new Member(R.mipmap.muslim, "Muslim"));

        refreshAdapter(members);

    }

    void refreshAdapter(ArrayList<Member> members){
        RecyclerAdapter adapter = new RecyclerAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }
}
