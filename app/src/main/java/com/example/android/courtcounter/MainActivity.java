package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        whoIsWinning();
    }

    /**
     * Used to increment the score of team A
     */
    public void freeThrowA(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
        whoIsWinning();
    }

    public void twoPointsA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
        whoIsWinning();
    }

    public void threePointsA(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
        whoIsWinning();
    }

    public void resetPoints(View view) {
        teamAScore = 0;
        teamBScore =0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
        whoIsWinning();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    // ==========> TEAM B <============

    /**
     * Used to increment the score of team A
     */

    public void freeThrowB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
        whoIsWinning();
    }

    public void twoPointsB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
        whoIsWinning();
    }

    public void threePointsB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
        whoIsWinning();
    }

    public void resetPointsB(View view) {
        teamBScore = 0;
        displayForTeamB(teamBScore);
        whoIsWinning();
    }


     // Displays the given score for Team B.
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void whoIsWinning(){

        if(teamAScore > teamBScore){
            TextView winnerView = (TextView) findViewById(R.id.winner_text);
            winnerView.setText(String.valueOf("Team A\nis winning!"));
        }else if(teamAScore < teamBScore){
            TextView winnerView = (TextView) findViewById(R.id.winner_text);
            winnerView.setText(String.valueOf("Team B\nis winning!"));
        }else{
            TextView winnerView = (TextView) findViewById(R.id.winner_text);
            winnerView.setText(String.valueOf("Draw"));
        }
    } // Winner result in text view
}



