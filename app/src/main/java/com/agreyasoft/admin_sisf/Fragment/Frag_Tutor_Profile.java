package com.agreyasoft.admin_sisf.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agreyasoft.admin_sisf.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Tutor_Profile extends Fragment {


    public Frag_Tutor_Profile() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__tutor__profile, container, false);
    }

}
