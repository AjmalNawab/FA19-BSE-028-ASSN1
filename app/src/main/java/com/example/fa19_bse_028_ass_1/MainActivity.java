package com.example.fa19_bse_028_ass_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManagerNonConfig;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Action_Fragment_left fragment= new Action_Fragment_left();
        fragmentTransaction.add(R.id.frame2, fragment);
        fragmentTransaction.commit();
        
    }
}