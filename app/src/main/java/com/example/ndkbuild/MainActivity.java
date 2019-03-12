package com.example.ndkbuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Android NDK开发（二） 使用ndk-build构建工具进行NDK开发
 * https://www.jianshu.com/p/6e900de253db
 */
public class MainActivity extends AppCompatActivity {
    // 加载native-lib，不加lib前缀
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 将获取的字符串显示在TextView上
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * native-lib中的原生方法
     */
    public native String stringFromJNI();
}
