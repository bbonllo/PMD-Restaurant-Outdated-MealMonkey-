package com.example.restaurantes.ui.mexican;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MexicanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MexicanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mexican fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}