package com.example.gdopappandroid.ui.gdop;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GDOPViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GDOPViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}