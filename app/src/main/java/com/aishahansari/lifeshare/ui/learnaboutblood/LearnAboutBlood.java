package com.aishahansari.lifeshare.ui.learnaboutblood;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aishahansari.lifeshare.R;

public class LearnAboutBlood extends Fragment {

    private LearnAboutBloodViewModel mViewModel;

    public static LearnAboutBlood newInstance() {
        return new LearnAboutBlood();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.learn_about_blood_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LearnAboutBloodViewModel.class);
        // TODO: Use the ViewModel
    }

}
