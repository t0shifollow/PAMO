package com.pamo.niceapp.ui.BMI;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BMIViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BMIViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}