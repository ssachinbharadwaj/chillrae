package com.example.android.navigationdrawerexample;

/**
 * Created by gabdulla on 12/26/2014.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by gabdulla on 12/24/2014.
 */
public class add_money extends Fragment {

    TextView text1;
    GlobalData gdata;
    Button gate;
    private static TextView textview;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_money,
                container, false);
        text1=(TextView)view.findViewById(R.id.gdata_add);
        gate=(Button)view.findViewById(R.id.button4);
        gdata=(GlobalData) getActivity().getApplicationContext();


        text1.setText(gdata.getEmail());

     //   textview = (TextView) view.findViewById(R.id.textView1);

        return view;
    }


}

