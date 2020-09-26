package com.aishahansari.lifeshare.ui.bloodcompatibility;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aishahansari.lifeshare.R;

public class BloodCompatibility extends Fragment {

    private BloodCompatibilityViewModel mViewModel;

    public static BloodCompatibility newInstance() {
        return new BloodCompatibility();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.blood_compatibility_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BloodCompatibilityViewModel.class);
        // TODO: Use the ViewModel
    }

}
