package com.example.fa19_bse_028_ass_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class action_freg extends Fragment {
    Button add_record,search_record;
    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.fragment_action__freg, container, false);
        return v;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        add_record=getView().findViewById(R.id.add_record);
        search_record=getView().findViewById(R.id.search_record);

        add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment frg1= new add_record_freg();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame2,frg1,null).commit();
            }
        });

        search_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment frg2= new search_record_freg();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame2,frg2,null).commit();
            }
        });
        // Inflate the layout for this fragment

    }
}