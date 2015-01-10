package com.example.android.navigationdrawerexample;

/**
 * Created by gabdulla on 12/26/2014.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gabdulla on 12/24/2014.
 */
public class about extends Fragment {

    TextView text;
    GlobalData gdata;


    private static TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about,
                container, false);

        text=(TextView)view.findViewById(R.id.gdata_abo);

        gdata=(GlobalData) getActivity().getApplicationContext();


        text.setText(gdata.getEmail());


        //    textview = (TextView) view.findViewById(R.id.textView1);

        return view;
    }


}
