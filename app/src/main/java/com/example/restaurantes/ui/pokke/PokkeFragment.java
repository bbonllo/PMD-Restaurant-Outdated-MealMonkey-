package com.example.restaurantes.ui.pokke;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentPokkeBinding;

public class PokkeFragment extends Fragment {

    private FragmentPokkeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PokkeViewModel pokkeViewModel =
                new ViewModelProvider(this).get(PokkeViewModel.class);

        binding = FragmentPokkeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPokke;
        pokkeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}