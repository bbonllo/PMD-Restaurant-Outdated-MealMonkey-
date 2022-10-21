package com.example.restaurantes.ui.asian;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AsianViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AsianViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is asian fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}