package com.example.restaurantes.ui.kebab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentKebabBinding;

public class KebabFragment extends Fragment {

    private FragmentKebabBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KebabViewModel kebabViewModel =
                new ViewModelProvider(this).get(KebabViewModel.class);

        binding = FragmentKebabBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKebab;
        kebabViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}