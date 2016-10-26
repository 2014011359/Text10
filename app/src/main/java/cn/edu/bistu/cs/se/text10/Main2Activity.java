package cn.edu.bistu.cs.se.text10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b2=(Button)findViewById(R.id.b2);
        Intent intent1=getIntent();
        String name=intent1.getStringExtra("name");
        Integer age=intent1.getIntExtra("age", 20);
        Toast.makeText(this,name+age, Toast.LENGTH_LONG).show();

    }

}
