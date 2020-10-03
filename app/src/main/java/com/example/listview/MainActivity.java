package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity
{

    ListView list;
    String[] web =
            {
                    "Android",
                    "Java",
                    "cấu trúc dữ liệu",
                    "giải tích",
                    "đại số",
                    "toán",
                    "lí"
            };
    Integer[] imageId =
            {
                    R.drawable.image2,
                    R.drawable.java,
                    R.drawable.cauturv,
                    R.drawable.giaitich,
                    R.drawable.daso,
                    R.drawable.toan,
                    R.drawable.li


            };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CustomList adapter = new CustomList(MainActivity.this, web, imageId);

        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override

            public void onItemClick(AdapterView <? > parent, View view,
                                    int position, long id)
            {
                Toast.makeText(MainActivity.this, "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}