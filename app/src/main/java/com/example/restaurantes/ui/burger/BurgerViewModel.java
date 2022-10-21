package com.example.restaurantes.ui.burger;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BurgerViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BurgerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is burger fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}