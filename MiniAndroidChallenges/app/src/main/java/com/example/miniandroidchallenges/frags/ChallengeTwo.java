package com.example.miniandroidchallenges.frags;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.FragmentMain;
import com.example.miniandroidchallenges.R;
import com.example.miniandroidchallenges.utils.PinUtil;

public class ChallengeTwo extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_challenge_two, container, false);
        final Context thiscontext = container.getContext();

        //setup edittext and textviews
        final EditText PINtxt = view.findViewById(R.id.editText);
        final TextView hint1Textview = view.findViewById(R.id.hint1Textchall2);
        final TextView hint2Textview = view.findViewById(R.id.hint2Textchall2);

        //setup button for pin submission
        Button submitPINbutton = view.findViewById(R.id.buttonPinOK);
        submitPINbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //submit text and check pin
                final String PIN = PINtxt.getText().toString();
                if (PinUtil.pincodeCheck(PIN)) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frameLayout, new FlagFragement());
                    ft.addToBackStack("challTwo");
                    ft.commit();
                } else {
                    Toast toast = Toast.makeText(thiscontext, "Wrong PIN!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        //hint 1 button
        Button hint1Button = view.findViewById(R.id.buttonHintOnechall2);
        hint1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint1Textview.setVisibility(TextView.VISIBLE);
            }
        });

        //hint 2 button
        Button hint2Button = view.findViewById(R.id.buttonHintTwochall2);
        hint2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint2Textview.setVisibility(TextView.VISIBLE);
            }
        });

        return view;
    }
}