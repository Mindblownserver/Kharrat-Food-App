package com.kharrat.foodapp;

import android.os.Bundle;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LoginActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private TabLayoutMediator tabLMed;
    private FloatingActionButton fab_fb;
    private FloatingActionButton fab_ig;
    private FloatingActionButton fab_ggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left,0, systemBars.right, systemBars.bottom);
            return insets;
        });
        fab_fb = findViewById(R.id.fab_fb);
        fab_ig = findViewById(R.id.fab_ig);
        fab_ggle = findViewById(R.id.fab_ggle);

        tabLayout = findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager2 = findViewById(R.id.login_pager);
        final LoginAdapter loginAdapter = new LoginAdapter(this);
        viewPager2.setAdapter(loginAdapter);

        tabLMed = new TabLayoutMediator(tabLayout,viewPager2,(tab,position)->{
            switch (position){
                case 0:
                    tab.setText("Login");
                    break;
                case 1:
                    tab.setText("Signup");
            }
        });
        tabLMed.attach();

        // animation

        fab_fb.setTranslationY(100);
        fab_ggle.setTranslationY(100);
        fab_ig.setTranslationY(100);
        tabLayout.setTranslationY(100);
        fab_fb.setAlpha((float)0);
        fab_ggle.setAlpha((float)0);
        fab_ig.setAlpha((float)0);
        tabLayout.setAlpha((float)0);

        fab_fb.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        fab_ggle.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        fab_ig.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tabLMed.detach();
    }
}