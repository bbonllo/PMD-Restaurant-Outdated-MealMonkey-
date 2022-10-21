package com.example.restaurantes.ui.italian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.restaurantes.databinding.FragmentItalianBinding;

public class ItalianFragment extends Fragment {

    private FragmentItalianBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ItalianViewModel italianViewModel =
                new ViewModelProvider(this).get(ItalianViewModel.class);

        binding = FragmentItalianBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textItalian;
        italianViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}