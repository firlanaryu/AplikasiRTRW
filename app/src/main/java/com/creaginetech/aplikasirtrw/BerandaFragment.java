package com.creaginetech.aplikasirtrw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {

    private Toolbar berandaToolbar;

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        berandaToolbar = view.findViewById(R.id.berandaToolbar);
        berandaToolbar.inflateMenu(R.menu.main_menu);

        return view;
    }

}
