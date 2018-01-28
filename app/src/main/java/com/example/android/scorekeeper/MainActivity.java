package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int setScoreA = 0;
    int setScoreB = 0;
    int matchScoreA = 0;
    int matchScoreB = 0;
    int setNumber = 1;
    boolean isSetStarted = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView setView = (TextView) findViewById(R.id.txt_set);
        setView.setText("SET : " + String.valueOf(setNumber));
    }

    public void onePointA(View view) {
        setScoreA = setScoreA + 1;
        displayScoreA(setScoreA);
    }

    public void onePointB(View view) {
        setScoreB = setScoreB + 1;
        displayScoreB(setScoreB);
    }

    public void displaySetNumber() {
        if (setNumber != 5)
            setNumber = setNumber + 1;
        else return;
        TextView setView = (TextView) findViewById(R.id.txt_set);
        setView.setText("SET : " + String.valueOf(setNumber));
    }

    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void resetSetScore(View view) {
        if (setScoreA == 0 && setScoreB == 0)
            return;

        if (setScoreA > setScoreB && setScoreA-setScoreB>=2 && setScoreA>=25) {
            matchScoreA = matchScoreA + 1;
        } else if (setScoreA < setScoreB && setScoreB-setScoreA>=2 && setScoreB>=25) {
            matchScoreB = matchScoreB + 1;
        }
        else
            return;
        if (setNumber == 1) {
            displaySetOne();
        } else if (setNumber == 2) {
            displaySetTwo();
        } else if (setNumber == 3) {
            displaySetThree();
        } else if (setNumber == 4) {
            displaySetFour();
        } else if (setNumber == 5) {
            displaySetFive();
        } else
            return;
        setScoreA = 0;
        setScoreB = 0;
        displayScoreB(setScoreB);
        displayScoreA(setScoreA);
        displaySetNumber();

    }
  public  void displayMatchScore(View view)
  {
      if (setNumber <=4){
          TextView scoreViewA = (TextView) findViewById(R.id.a_match_score);
          scoreViewA.setText(String.valueOf(matchScoreA));
          TextView scoreViewB = (TextView) findViewById(R.id.b_match_score);
          scoreViewB.setText(String.valueOf(matchScoreB));
      }
  }
    public void displaySetOne() {
        TextView scoreViewA = (TextView) findViewById(R.id.a_match_score_one);
        scoreViewA.setText(String.valueOf(matchScoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.b_match_score_one);
        scoreViewB.setText(String.valueOf(matchScoreB));

    }

    public void displaySetTwo() {
        TextView scoreViewA = (TextView) findViewById(R.id.a_match_score_two);
        scoreViewA.setText(String.valueOf(matchScoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.b_match_score_two);
        scoreViewB.setText(String.valueOf(matchScoreB));
    }

    public void displaySetThree() {
        TextView scoreViewA = (TextView) findViewById(R.id.a_match_score_three);
        scoreViewA.setText(String.valueOf(matchScoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.b_match_score_three);
        scoreViewB.setText(String.valueOf(matchScoreB));
    }

    public void displaySetFour() {
        TextView scoreViewA = (TextView) findViewById(R.id.a_match_score_four);
        scoreViewA.setText(String.valueOf(matchScoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.b_match_score_four);
        scoreViewB.setText(String.valueOf(matchScoreB));
    }

    public void displaySetFive() {
        TextView scoreViewA = (TextView) findViewById(R.id.a_match_score_five);
        scoreViewA.setText(String.valueOf(matchScoreA));
        TextView scoreViewB = (TextView) findViewById(R.id.b_match_score_five);
        scoreViewB.setText(String.valueOf(matchScoreB));
    }
}
