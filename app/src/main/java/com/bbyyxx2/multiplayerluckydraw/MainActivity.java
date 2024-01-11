package com.bbyyxx2.multiplayerluckydraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bbyyxx2.tagcloudlibx.view.TagCloudView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TagCloudView myCloud;
    TextTagsAdapter textTagsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTagsAdapter = new TextTagsAdapter(Arrays.asList("111", "222", "333", "444", "555", "666", "777", "888", "999", "1010", "1111", "2222", "3333", "4444", "5555"));
        myCloud=(TagCloudView)findViewById(R.id.tag_cloud);
        myCloud.setAdapter(textTagsAdapter);
    }
}