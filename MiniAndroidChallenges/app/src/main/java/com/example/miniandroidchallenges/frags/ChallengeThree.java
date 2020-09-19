package com.example.miniandroidchallenges.frags;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.miniandroidchallenges.R;

public class ChallengeThree extends Fragment {

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        // This inflates the main menu and assigns it to a view so we can setup the various buttons
        View view = inflater.inflate(R.layout.fragment_challenge_three, container, false);

        final WebView WV = view.findViewById(R.id.webview);
        WebSettings WS = WV.getSettings();
        WS.setJavaScriptEnabled(true);

        WV.setWebChromeClient(new WebChromeClient());

        //setup edittext and textviews
        final EditText webviewtext = view.findViewById(R.id.editInputtext);
        final TextView hint1Textview = view.findViewById(R.id.hint1Textchall3);
        final TextView hint2Textview = view.findViewById(R.id.hint2Textchall3);


        //setup button for text submission
        Button submitInputtext = view.findViewById(R.id.buttonPinOKchall3);
        submitInputtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //put text in webview
                final String data = webviewtext.getText().toString();
                WV.loadData(data, "text/html", "UTF-8");
            }
        });



        //hint 1 button
        Button hint1Button = view.findViewById(R.id.buttonHintOnechall3);
        hint1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hint1Textview.setVisibility(TextView.VISIBLE);
            }
        });
        //hint 2 button
        Button hint2Button = view.findViewById(R.id.buttonHintTwochall3);
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
