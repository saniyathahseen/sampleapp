package com.example.sampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class MenuFragmentView extends Fragment  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.menu_fragment_view, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

               Button b =(Button) view.findViewById(R.id.jetty_informations);
                b.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i=new Intent(getActivity(),JettyInfoSwipeView.class);
                        startActivity(i);
                    }
                });

    }

}
