package com.example.restaurantes.ui.fastfood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentFastfoodBinding;

public class FastFoodFragment extends Fragment {

    private FragmentFastfoodBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FastFoodViewModel fastfoodViewModel =
                new ViewModelProvider(this).get(FastFoodViewModel.class);

        binding = FragmentFastfoodBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFastfood;
        fastfoodViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}