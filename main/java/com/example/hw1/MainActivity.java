package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //建立全域變數
    Button btnShow;
    TextView txv;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //讓Java檔找到在布局檔的元件
        btnShow = findViewById(R.id.button5);
        editText = findViewById(R.id.Name);

    }
    //建立一個顯示文字的方法
    public void Show(View v){
        //string就是字串，設定字串為由editText取得的文字
        String str = editText.getText().toString().trim();
        //trim()  去除String物件前後的空白再回傳字串
        if (str.length()==0)
            txv.setText("請輸入大名");
    }


}