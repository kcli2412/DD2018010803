package com.example.student.dd2018010803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Map<String, Object>> mylist = new ArrayList<>();
    boolean chks[] = new boolean[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, Object> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        m1.put("image", R.drawable.tpe);
        mylist.add(m1);
        HashMap<String, Object> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        m2.put("image", R.drawable.tc);
        mylist.add(m2);
        HashMap<String, Object> m3 = new HashMap<>();
        m3.put("city", "台南");
        m3.put("code", "06");
        m3.put("image", R.drawable.tn);
        mylist.add(m3);
        HashMap<String, Object> m4 = new HashMap<>();
        m4.put("city", "高雄");
        m4.put("code", "07");
        m4.put("image", R.drawable.kh);
        mylist.add(m4);

        HashMap<String, Object> m5 = new HashMap<>();
        m5.put("city", "台北2");
        m5.put("code", "202");
        m5.put("image", R.drawable.tpe);
        mylist.add(m5);
        HashMap<String, Object> m6 = new HashMap<>();
        m6.put("city", "台中2");
        m6.put("code", "204");
        m6.put("image", R.drawable.tc);
        mylist.add(m6);
        HashMap<String, Object> m7 = new HashMap<>();
        m7.put("city", "台南2");
        m7.put("code", "206");
        m7.put("image", R.drawable.tn);
        mylist.add(m7);
        HashMap<String, Object> m8 = new HashMap<>();
        m8.put("city", "高雄2");
        m8.put("code", "207");
        m8.put("image", R.drawable.kh);
        mylist.add(m8);

        lv = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(MainActivity.this, mylist);
        lv.setAdapter(adapter);
    }

    public void click1(View v)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chks.length; i++)
        {
            if (chks[i])
            {
                sb.append(mylist.get(i).get("city") + ",");
            }
        }
        Toast.makeText(MainActivity.this, sb, Toast.LENGTH_LONG).show();
    }
}
