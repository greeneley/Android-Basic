package com.example.td3_asl.acitivities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.widget.TextView;

import com.example.td3_asl.R;

public class PreferenceActitivy extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preference);

        } catch (Exception e){
            e.getMessage();
        }
    }
}
