package com.example.selimreza.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showPointsA,showPoints;
    Button oneA ,twoA,threeA,one,two,three,reset;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showPoints = (TextView) findViewById(R.id.tvshow);
        showPointsA = (TextView) findViewById(R.id.tvshowA);
        one = (Button) findViewById(R.id.btnpoints3);
        two = (Button) findViewById(R.id.btnpoints2);
        three = (Button) findViewById(R.id.btnpoints1);
        oneA = (Button) findViewById(R.id.btnpoints3A);
        twoA = (Button) findViewById(R.id.btnpoints2A);
        threeA = (Button) findViewById(R.id.btnpoints1A);
        reset = (Button) findViewById(R.id.btnreset);
    }
    public void forShowing3(View view){
        display(3);
    }
    public void forShowing2(View view){
        display(2);
    }
    public void forShowing1(View view){
        display(1);
    }
    public void forShowing3A(View view){
        displayA(3);
    }
    public void forShowing2A(View view){
        displayA(2);
    }
    public void forShowing1A(View view){
        displayA(1);
    }
    public void resetPoints(View view){

       scoreTeamA=0;
        scoreTeamB=0;
        showPoints.setText(""+scoreTeamB);
        showPointsA.setText(""+scoreTeamA);
    }
    //for desplay
    public void display(int score){
        scoreTeamB=scoreTeamB+score;
        showPoints.setText(""+scoreTeamB);
    }
    public void displayA(int score){
        scoreTeamA=scoreTeamA+score;
        showPointsA.setText(""+scoreTeamA);
    }
}
