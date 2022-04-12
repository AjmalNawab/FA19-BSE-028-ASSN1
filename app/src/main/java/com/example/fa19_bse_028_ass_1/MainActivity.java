package com.example.fa19_bse_028_ass_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManagerNonConfig;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment action_freg= new action_freg();
        getSupportFragmentManager().beginTransaction().add(R.id.frame1,action_freg,null).commit();


        Fragment msg_Frg= new message_freg();
        getSupportFragmentManager().beginTransaction().add(R.id.frame2,msg_Frg,null).commit();
    }
}