package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Used to increment the score of team A
     */
    public void freeThrow(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void twoPoints(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void threePoints(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
