package com.timetable.allforme3.timetable;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.os.Bundle;

/**
 * Created by allforme3 on 15/02/2015.
 */
public class About extends Fragment {

    private NavigationDrawerFragment.NavigationDrawerCallbacks mCallbacks;
    View rootview;
    public boolean setup;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.about, container, false);
        return rootview;

    }
}



    /*
               public void addMainButtonListener() {
                    ToggleButton toggle = (ToggleButton) rootview.findViewById(R.id.toggleButton);
                    toggle.setOnCheckedChangeListener(new ToggleButton.OnCheckedChangeListener() {
                        public void onCheckedChanged(ToggleButton buttonView, boolean isChecked) {
                            if (isChecked) {
                                LinearLayout layout =(LinearLayout) rootview.findViewById(R.id.about_page);
                                layout.setBackground(getResources().getDrawable(R.drawable.allan));
                                Toast.makeText(getActivity(),"Look at that face!",Toast.LENGTH_SHORT);
                                mCallbacks.onNavigationDrawerItemSelected(5);
                            } else {
                                LinearLayout layout =(LinearLayout) rootview.findViewById(R.id.about_page);
                                layout.setBackgroundColor(android.R.color.white);
                                mCallbacks.onNavigationDrawerItemSelected(5);

                            }
                        }
                    });
                }

} */
