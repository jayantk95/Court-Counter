package com.example.courtcounter;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //for maintaining the score of teamA
    private int teamAScore = 0;

    //for maintaining the score of teamB
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //increment score of teamA by 1
    public void incrementFreeThrowTeamA(View view) {
        teamAScore++;
        displayScoreTeamA();
    }

    //increment score of teamA by 2
    public void incrementPoints2TeamA(View view) {
        teamAScore += 2;
        displayScoreTeamA();
    }

    //increment score of teamA by 3
    public void incrementPoints3TeamA(View view) {
        teamAScore += 3;
        displayScoreTeamA();
    }

    //display score of teamA
    private void displayScoreTeamA() {
        TextView scoreTeamA = findViewById(R.id.teamA_score_text_view);
        scoreTeamA.setText(String.valueOf(teamAScore));
    }

    //increment score of teamB by 1
    public void incrementFreeThrowTeamB(View view) {
        teamBScore++;
        displayScoreTeamB();
    }

    //increment score of teamB by 2
    public void incrementPoints2TeamB(View view) {
        teamBScore += 2;
        displayScoreTeamB();
    }

    //increment score of teamB by 3
    public void incrementPoints3TeamB(View view) {
        teamBScore += 3;
        displayScoreTeamB();
    }

    //display score of teamB
    public void displayScoreTeamB() {
        TextView scoreTeamB = findViewById(R.id.teamB_score_text_view);
        scoreTeamB.setText(String.valueOf(teamBScore));
    }

    //resets the scores of both teams
    public void resetScore(View view){
        teamBScore = 0;
        teamAScore = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }
}