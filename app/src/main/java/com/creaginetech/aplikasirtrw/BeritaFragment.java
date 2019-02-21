package com.creaginetech.aplikasirtrw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeritaFragment extends Fragment {

    private Toolbar beritaToolbar;


    public BeritaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_berita, container, false);

        beritaToolbar = view.findViewById(R.id.beritaToolbar);
        beritaToolbar.inflateMenu(R.menu.main_menu_account);
//        Menu menu = beritaToolbar.getMenu();

//        ((AppCompatActivity)getActivity()).setSupportActionBar(beritaToolbar);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.main_menu_account, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
