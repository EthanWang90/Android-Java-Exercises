package com.example.ethan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//当 Android 应用程序被编译，会自动生成一个 R 类，其中包含了所有 res/ 目录下资源的 ID，如布局文件，资源文件，图片（values下所有文件）的ID等。

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        R.drawable.ic_launcher_foreground;
        setContentView(R.layout.activity_main);
//        final TextView editText = findViewById(R.id.myText);
//        Button button = findViewById(R.id.myButton);
//        button.setOnClickListener(new View.OnClickListener(){
// //          @Override
//           public void onClick(View view){
//               editText.setText("bye world");
//           }
//        });
    }
}
