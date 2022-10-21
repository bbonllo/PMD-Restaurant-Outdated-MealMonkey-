package com.example.restaurantes.ui.italian;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ItalianViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ItalianViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is italian fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}