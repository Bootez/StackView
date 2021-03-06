package com.example.stackview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.SimpleAdapter;
import android.widget.StackView;

public class MainActivity extends Activity {
    private StackView stackView;
    int[] imageIds = new int[] { R.drawable.bomb5, R.drawable.bomb6,
            R.drawable.bomb7, R.drawable.bomb8, R.drawable.bomb9,
            R.drawable.bomb10, R.drawable.bomb11, R.drawable.bomb12,
            R.drawable.bomb13, R.drawable.bomb14, R.drawable.bomb15,
            R.drawable.bomb16 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        stackView = (StackView)findViewById(R.id.stackview);
        List<Map<String, Object>> listItems = new ArrayList<Map<String,Object>>();
        
        for (int i = 0; i < imageIds.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("image", imageIds[i]);
            listItems.add(listItem);
        }
        
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.cell, 
                new String[] {"image"}, new int[] {R.id.image1});
        stackView.setAdapter(simpleAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
