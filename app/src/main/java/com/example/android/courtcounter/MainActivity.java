package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }
    public void points3Order(View v) {
        scoreForTeamA = scoreForTeamA+3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void points2Order(View v) {
        scoreForTeamA = scoreForTeamA+2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void freeThrowOrder(View v) {
        scoreForTeamA = scoreForTeamA+1;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void points3OrderB(View v) {
        scoreForTeamB = scoreForTeamB+3;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void points2OrderB(View v) {
        scoreForTeamB = scoreForTeamB+2;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void freeThrowOrderB(View v) {
        scoreForTeamB = scoreForTeamB+1;
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View v) {
        scoreForTeamA = 0;
        displayForTeamA(scoreForTeamA);
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
    }
}
