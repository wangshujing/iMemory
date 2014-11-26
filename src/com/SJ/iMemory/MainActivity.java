package com.SJ.iMemory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.SJ.iMemory.lbs.MapActivity;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button mapButton = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mapButton=(Button) findViewById(R.id.mapButton);    //获取地图按钮。
        /*
         * 为地图按钮添加监听，跳转到MapActivity
         */
        mapButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ();
                intent.setClass(MainActivity.this,MapActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
