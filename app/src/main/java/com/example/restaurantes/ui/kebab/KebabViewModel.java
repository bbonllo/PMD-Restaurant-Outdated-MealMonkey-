package com.example.restaurantes.ui.kebab;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KebabViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KebabViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is kebab fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}