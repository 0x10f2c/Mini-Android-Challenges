package com.example.miniandroidchallenges.frags;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.R;

public class ChallengeFour extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_challenge_four, container, false);
        final TextView hint1Textview = view.findViewById(R.id.hint1Textchall4);
        final TextView hint2Textview = view.findViewById(R.id.hint2Textchall4);
        //hint 1 button
        Button hint1Button = view.findViewById(R.id.buttonHintOnechall4);
        hint1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint1Textview.setVisibility(TextView.VISIBLE);
            }
        });

        //hint 2 button
        Button hint2Button = view.findViewById(R.id.buttonHintTwochall4);
        hint2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint2Textview.setVisibility(TextView.VISIBLE);
            }
        });
        return view;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}

/*
Android exported activity
 */