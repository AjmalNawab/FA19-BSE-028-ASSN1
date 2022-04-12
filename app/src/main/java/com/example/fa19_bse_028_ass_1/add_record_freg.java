package com.example.fa19_bse_028_ass_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class add_record_freg extends Fragment {
    EditText email,name,age,address;
    Button btn_save;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_record_freg, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        email=getView().findViewById(R.id.email);
        name=getView().findViewById(R.id.name);
        age=getView().findViewById(R.id.age);
        address=getView().findViewById(R.id.address);
        btn_save=getView().findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(),"Record Saved Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}