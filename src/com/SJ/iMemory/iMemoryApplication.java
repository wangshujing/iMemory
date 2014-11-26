package com.SJ.iMemory;

import android.app.Application;
import android.util.Log;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

/**
 * Created by Sunyao_Will on 14/11/25.
 */

/**
 * 初始化Application。
 */
public class iMemoryApplication  extends Application{
    @Override
    public void onCreate() {

        Log.d("", "[iMemoryApplication] onCreate");

        super.onCreate();
    }
}
