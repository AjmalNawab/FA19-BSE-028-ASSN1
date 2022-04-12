package com.example.fa19_bse_028_ass_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class message_freg extends Fragment {

    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        text=container.findViewById(R.id.text);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_freg, container, false);
    }
}