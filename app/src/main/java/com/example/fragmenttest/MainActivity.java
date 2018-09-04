package com.example.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonTest1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment1);
                if (fragment != null && fragment instanceof Main1Fragment) {
                    ((Main1Fragment) fragment).buttonTest();
                }
            }
        });

        findViewById(R.id.buttonTest2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fragment2);
                if (fragment != null && fragment instanceof Main2Fragment) {
                    ((Main2Fragment) fragment).buttonTest();
                }
            }
        });
    }

    public void mainMethod(String className) {
        Toast.makeText(this, className + " -> mainMthod!", Toast.LENGTH_SHORT).show();
    }
}
