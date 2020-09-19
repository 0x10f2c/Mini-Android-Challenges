package com.example.miniandroidchallenges.frags;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.R;
import com.scottyab.rootbeer.RootBeer;

public class ChallengeOne extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_challenge_one, container, false);
        final Context thiscontext = container.getContext();
        RootBeer rootBeer = new RootBeer(thiscontext);
        if (rootBeer.isRooted()) {
            Toast toast = Toast.makeText(thiscontext, "Root detected!", Toast.LENGTH_LONG);
            toast.show();
            FragmentManager ft = getParentFragmentManager();
            ft.popBackStack();
        }else {
            Toast toast = Toast.makeText(thiscontext, "No root detected!", Toast.LENGTH_LONG);
            toast.show();
        }
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


