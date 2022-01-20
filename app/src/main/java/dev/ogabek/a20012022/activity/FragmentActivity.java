package dev.ogabek.a20012022.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import dev.ogabek.a20012022.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}