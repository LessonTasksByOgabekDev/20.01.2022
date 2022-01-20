package dev.ogabek.a20012022.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import dev.ogabek.a20012022.R;

public class RuntimeActivity extends AppCompatActivity {

    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime);

        initViews();

    }

    private void initViews() {
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_first, firstFragment)
                .replace(R.id.fragment_second, secondFragment)
                .commit();
    }

}
