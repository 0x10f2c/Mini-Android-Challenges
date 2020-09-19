package com.example.miniandroidchallenges;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.frags.ChallengeFive;
import com.example.miniandroidchallenges.frags.ChallengeFour;
import com.example.miniandroidchallenges.frags.ChallengeOne;
import com.example.miniandroidchallenges.frags.ChallengeThree;
import com.example.miniandroidchallenges.frags.ChallengeTwo;

public class FragmentMain extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        final Context thiscontext = container.getContext();

        //button for challone
        Button buttonChalOne = view.findViewById(R.id.challOneButton);
        buttonChalOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.frameLayout, new ChallengeOne());
                //add mainpage fragment to backstack so user can click back to go back easily
                ft.addToBackStack("Mainpage");
                // Complete the changes added above
                ft.commit();
            }
        });

        //button for challtwo
        Button buttonChalTwo = view.findViewById(R.id.challTwoButton);
        buttonChalTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.frameLayout, new ChallengeTwo());
                //add mainpage fragment to backstack so user can click back to go back easily
                ft.addToBackStack("Mainpage");
                // Complete the changes added above
                ft.commit();
            }
        });

        //button for challthree
        Button buttonChalThree = view.findViewById(R.id.challThreeButton);
        buttonChalThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.frameLayout, new ChallengeThree());
                //add mainpage fragment to backstack so user can click back to go back easily
                ft.addToBackStack("Mainpage");
                // Complete the changes added above
                ft.commit();
            }
        });

        //button for challfour
        Button buttonChalFour = view.findViewById(R.id.challFourButton);
        buttonChalFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.frameLayout, new ChallengeFour());
                //add mainpage fragment to backstack so user can click back to go back easily
                ft.addToBackStack("Mainpage");
                // Complete the changes added above
                ft.commit();
            }
        });

        //button for challfive
        Button buttonChalFive = view.findViewById(R.id.challFiveButton);
        buttonChalFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                // Replace the contents of the container with the new fragment
                ft.replace(R.id.frameLayout, new ChallengeFive());
                //add mainpage fragment to backstack so user can click back to go back easily
                ft.addToBackStack("Mainpage");
                // Complete the changes added above
                ft.commit();
            }
        });


        //github link
        TextView txt= view.findViewById(R.id.textlink); //txt is object of TextView
        txt.setMovementMethod(LinkMovementMethod.getInstance());
        txt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://github.com/0x10f2c"));
                startActivity(browserIntent);
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
        // Need to setup buttons with click listeners that will swap to said fragment, this also needs to support fragment backstack so users can go back to
    }
}
