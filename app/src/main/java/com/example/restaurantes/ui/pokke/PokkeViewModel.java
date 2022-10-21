package com.example.restaurantes.ui.pokke;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PokkeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PokkeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pokke fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}