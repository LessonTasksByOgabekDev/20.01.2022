package dev.ogabek.a20012022.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import dev.ogabek.a20012022.R;
import dev.ogabek.a20012022.fragment.RuntimeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, ViewPagerActivity.class));
        finish();

    }

    private void initView() {

    }
}