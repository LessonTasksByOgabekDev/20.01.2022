package dev.ogabek.a20012022.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import dev.ogabek.a20012022.R;
import dev.ogabek.a20012022.adapter.ViewPagerAdapter;
import dev.ogabek.a20012022.fragment.PageFragments;

public class ViewPagerActivity extends AppCompatActivity {

    static final String TAG = ViewPagerActivity.class.toString();

    ViewPagerAdapter adapter;
    private ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        initView();

    }

    private void initView() {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tablayout);

        adapter.add(new PageFragments(1), "Page 1");
        adapter.add(new PageFragments(2), "Page 2");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}