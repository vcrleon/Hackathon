package com.example.murodjonrahimov.hackathon.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.murodjonrahimov.hackathon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourtsFragment extends Fragment {

    View rootView;


    public CourtsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_courts, container, false);


        return rootView;
    }

}
