package com.example.dobotappcontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetOnClickListeners();
    }

    private void SetOnClickListeners(){
        LinearLayout layout = (LinearLayout) findViewById(R.id.dobotConnectView);
        layout.setOnClickListener(this::ConnectToDobot);
    }


    DobotConnector connector;
    TextView midbut;

    //How to make a comment, it is like this
    public void ConnectToDobot(android.view.View aView){
        midbut = (TextView) findViewById(R.id.dobotConnectorStatus);
        midbut.setText("Connected");

        connector = new DobotConnector();
        connector.ConnectToDobot();
    }
}