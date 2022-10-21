package com.example.restaurantes.ui.asian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentAsianBinding;

public class AsianFragment extends Fragment {

    private FragmentAsianBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AsianViewModel asianViewModel =
                new ViewModelProvider(this).get(AsianViewModel.class);

        binding = FragmentAsianBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAsian;
        asianViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}