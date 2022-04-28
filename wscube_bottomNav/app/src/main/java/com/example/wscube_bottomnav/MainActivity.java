package com.example.wscube_bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnView = findViewById(R.id.bnView);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.nav_home){

                    loadFragment(new AFragment(), false);

                }else if (id == R.id.nav_search){

                    loadFragment(new BFragment(), false);

                }else if (id == R.id.nav_utilities){

                    loadFragment(new CFragment(), false);

                }else if (id == R.id.nav_contactus){

                    loadFragment(new DFragment(), false);

                }else { // for profile

                    loadFragment(new EFragment(), true);
                }
                return true;
            }
        });

        bnView.setSelectedItemId(R.id.nav_my_profile);   // it is for first by default selected

        }
    public void loadFragment(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (flag ) {
            ft.add(R.id.container1, new EFragment());
        }else{
            ft.replace(R.id.container1,fragment);
        }
        ft.commit();
    }


}