package com.example.restaurantes.ui.fastfood;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FastFoodViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FastFoodViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fast food fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}