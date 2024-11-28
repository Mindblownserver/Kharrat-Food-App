package com.kharrat.foodapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LoginAdapter extends FragmentStateAdapter {
    public static final int NB_FRAG = 2;

    public LoginAdapter(@NonNull FragmentActivity fragAct) {
        super(fragAct);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new LoginTabFragment();
            case 1:
                return new SignupTabFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return NB_FRAG;
    }
}
