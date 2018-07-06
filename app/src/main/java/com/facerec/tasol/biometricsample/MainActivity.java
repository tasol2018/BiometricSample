package com.facerec.tasol.biometricsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.integratedbiometrics.ibscanultimate.IBScan;

public class MainActivity extends AppCompatActivity {
    IBScan m_ibScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_ibScan = IBScan.getInstance(MainActivity.this);
    }
}
