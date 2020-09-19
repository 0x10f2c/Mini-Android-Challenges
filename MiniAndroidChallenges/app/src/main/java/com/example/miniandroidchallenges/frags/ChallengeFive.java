package com.example.miniandroidchallenges.frags;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.R;
import com.example.miniandroidchallenges.utils.checkFlag;

public class ChallengeFive extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_challenge_five, container, false);
        broadcastIntent(view);
        final Context thiscontext = container.getContext();

        //setup edittext and textviews
        final EditText Flagtxt = view.findViewById(R.id.editTextFlag);
        final TextView hint1Textview = view.findViewById(R.id.hint1Textchall5);

        //setup button for flag submission
        Button submitPINbutton = view.findViewById(R.id.buttonPinOKchall5);
        submitPINbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //submit text and check flag
                final String flag = Flagtxt.getText().toString();
                if (checkFlag.flagCheck(flag)) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frameLayout, new FlagFragement2());
                    ft.addToBackStack("challfive");
                    ft.commit();
                } else {
                    Toast toast = Toast.makeText(thiscontext, "Wrong Flag!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        //broadcast button
        Button broadcastbutton = view.findViewById(R.id.buttonSendbroadcast);
        broadcastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadcastIntent(view);
                Toast toastsend = Toast.makeText(thiscontext, "Broadcast Sent!", Toast.LENGTH_LONG);
                toastsend.show();
            }
        });

        //hint 1 button
        Button hint1Button = view.findViewById(R.id.buttonHintOnechall5);
        hint1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint1Textview.setVisibility(TextView.VISIBLE);
            }
        });

        return view;
    }

    public void broadcastIntent(View view) {
        // Decoding this base64 is cheating; the goal is to intercept the broadcast!
        String string = "Broadcast from MiniAndroidChallenges ";
        String  Flag = new String(Base64.decode("VGhlV2hvbGVXb3JsZENhblNlZU1l",Base64.DEFAULT));
        // Decoding this base64 is cheating; the goal is to intercept the broadcast!
        Intent intent = new Intent();
        intent.putExtra("INTRO", string);
        intent.putExtra("FLAG", Flag);
        intent.setAction("com.fake.minibroadcast");
        getActivity().sendBroadcast(intent);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }
}
