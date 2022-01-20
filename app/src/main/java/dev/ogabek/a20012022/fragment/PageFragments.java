package dev.ogabek.a20012022.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import dev.ogabek.a20012022.R;

public class PageFragments extends Fragment {

    private final int position;

    public PageFragments(int position) {
        this.position = position;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int layout;

        switch (position) {
            case 1: {
                layout = R.layout.fragment_first;
                break;
            }
            default: {
                layout = R.layout.fragment_second;
                break;
            }
        }

        return inflater.inflate(layout, container, false);

    }
}
