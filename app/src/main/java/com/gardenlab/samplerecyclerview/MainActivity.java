package com.gardenlab.samplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        // recycler view가 보일 형태 지정

        final PersonAdapter adapter = new PersonAdapter();
        adapter.addItem(new Person("김민수", "010-4520-3425"));
        adapter.addItem(new Person("김하늘", "010-2367-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        adapter.addItem(new Person("홍길동", "010-8523-3425"));
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new OnPersonItemClickListener() {
            @Override
            public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position) {
                Person item = adapter.getItem(position);
                Toast.makeText(getApplicationContext(),"아이템 선택됨: "+item.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
