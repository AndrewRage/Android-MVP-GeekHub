package com.github.andreyrage.mvpgeekhub.mainscreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.github.andreyrage.mvpgeekhub.AbstractFragment;
import com.github.andreyrage.mvpgeekhub.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        //noinspection RestrictedApi
        List<Fragment> list = getSupportFragmentManager().getFragments();
        boolean back = true;
        for (Fragment fragment : list) {
            if (fragment != null && fragment instanceof AbstractFragment
                    && ((AbstractFragment) fragment).onBackPressed()) {
                back = false;
            }
        }
        if (back) {
            super.onBackPressed();
        }
    }
}
