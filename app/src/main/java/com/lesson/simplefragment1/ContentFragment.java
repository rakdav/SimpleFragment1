package com.lesson.simplefragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;


public class ContentFragment extends Fragment {
    private Button update;
    private TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_content, container, false);
        update=view.findViewById(R.id.updateButton);
        text=view.findViewById(R.id.dateTextView);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String curDate=new Date().toString();
                text.setText(curDate);
            }
        });
        return view;
    }
}