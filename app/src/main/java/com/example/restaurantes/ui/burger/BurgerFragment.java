package com.example.restaurantes.ui.burger;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentBurgerBinding;

public class BurgerFragment extends Fragment {

    private FragmentBurgerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BurgerViewModel burgerViewModel =
                new ViewModelProvider(this).get(BurgerViewModel.class);

        binding = FragmentBurgerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBurger;
        burgerViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}