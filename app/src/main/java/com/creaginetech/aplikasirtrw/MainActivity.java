package com.creaginetech.aplikasirtrw;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView mainBottomNav;

    private BerandaFragment berandaFragment;
    private BeritaFragment beritaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.mainToolbar);
//        setSupportActionBar(toolbar);
//        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));

        mainBottomNav = findViewById(R.id.mainBottomNav);
        mainBottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        berandaFragment = new BerandaFragment();
        beritaFragment = new BeritaFragment();

        replaceFragment(berandaFragment);

    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.main_menu,menu);
//
//        return true;
//    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;

            switch (menuItem.getItemId()){

                case R.id.navBerita:
                    fragment = new BeritaFragment();
                    replaceFragment(fragment);
                    return true;

                case R.id.navBeranda:
                    fragment = new BerandaFragment();
                    replaceFragment(fragment);
                    return true;

            }

            return true;
        }
    };

    public void replaceFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainContainer,fragment);
        fragmentTransaction.commit();

    }

}
