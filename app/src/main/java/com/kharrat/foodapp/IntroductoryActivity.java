package com.kharrat.foodapp;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


import com.airbnb.lottie.LottieAnimationView;
import com.cuberto.liquid_swipe.LiquidPager;

public class IntroductoryActivity extends AppCompatActivity {

    ImageView bg, icon;
    TextView app_text;
    LottieAnimationView lottie;

    private static final int NUM_PAGES=3;
    private LiquidPager vPager;
    private ScreenSliderPagerAdapter screenSliderPagerAdapter;
    private Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,0, systemBars.right, systemBars.bottom);
            return insets;
        });

        app_text = findViewById(R.id.app_name);
        bg = findViewById(R.id.bg);
        icon = findViewById(R.id.icon);
        lottie = findViewById(R.id.lottie);

        bg.animate().translationY(-2500).setDuration(1800).setStartDelay(3500);
        icon.animate().translationY(2500).setDuration(1800).setStartDelay(3500);
        app_text.animate().translationY(2500).setDuration(1800).setStartDelay(3500);
        lottie.animate().translationY(2500).setDuration(1800).setStartDelay(3500);

        anim = AnimationUtils.loadAnimation(this, R.anim.splash_to_intro_anim);

        vPager = findViewById(R.id.pager);
        screenSliderPagerAdapter = new ScreenSliderPagerAdapter(getSupportFragmentManager());
        vPager.setAdapter(screenSliderPagerAdapter);
        vPager.setAnimation(anim);
    }
    private class ScreenSliderPagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSliderPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new OnBoarding1();
                case 1:
                    return new OnBoarding2();
                case 2:
                    return new OnBoarding3();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}