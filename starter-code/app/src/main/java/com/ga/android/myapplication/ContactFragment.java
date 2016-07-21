package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Qube on 7/20/16.
 */
public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_text, container, false);

        TextView textView1 = (TextView) rootView.findViewById(R.id.textView1);
        TextView textView2 = (TextView) rootView.findViewById(R.id.textView2);
        TextView textView3 = (TextView) rootView.findViewById(R.id.textView3);

        textView1.setText("Phone: 1-800-Fragment");
        textView2.setText("Email: jchan122490@gmail.com");
        textView3.setText("Fragments are hard ");
        return rootView;
    }
}
