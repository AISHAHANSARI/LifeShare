package com.aishahansari.lifeshare.ui.learnaboutblood;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.aishahansari.lifeshare.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;

public class LearnAboutBlood extends Fragment {


    private LearnAboutBloodViewModel mViewModel;

    public static LearnAboutBlood newInstance() {
        return new LearnAboutBlood();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.learn_about_blood_fragment, container, false);
//        TextView tv = v.findViewById(R.id.demotxt);
//        tv.setText(getString(R.string.process));
        ExpandableTextView expTv1 =
                v.findViewById(R.id.expand_text_view);

// IMPORTANT - call setText on the ExpandableTextView to set the text content to display
        expTv1.setText(getString(R.string.elite_info));



// IMPORTANT - call setText on the ExpandableTextView to set the text content to display

//Comment out this default return type and created a view using object and used it
//        return inflater.inflate(R.layout.learn_about_blood_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LearnAboutBloodViewModel.class);
        // TODO: Use the ViewModel
    }

}
