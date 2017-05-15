package com.example.android.scorekeeperapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int PlayerA = 0;

    int PlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //*** Increase the score for Player A by 1 point but no more than 1.*/

    public void addOneForPlayerA(View v) {
        if (PlayerA + 1 > 10) {
            EditText playerNameEditText = (EditText) findViewById(R.id.player_a_name);
            String winnerName = playerNameEditText.getText().toString();
            Toast.makeText(this, winnerName + "  won.", Toast.LENGTH_LONG).show();
        } else {
            PlayerA = PlayerA + 1;
        }
        displayForPlayerA(PlayerA);
    }

    /**
     * Increase the score for Player B by 1 point but no more than 11.
     */
    public void addOneForPlayerB(View v) {
        if (PlayerB + 1 > 10) {
            EditText playerNameEditText = (EditText) findViewById(R.id.player_b_name);
            String winnerName = playerNameEditText.getText().toString();
            Toast.makeText(this, winnerName + "  won.", Toast.LENGTH_LONG).show();
        } else {
            PlayerB = PlayerB + 1;
            displayForPlayerB(PlayerB);
        }
    }

    /**
     * Resets the score for both players back to 0.
     */
    public void resetScore(View v) {
        PlayerA = 0;
        PlayerB = 0;
        displayForPlayerA(PlayerA);
        displayForPlayerB(PlayerB);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }
}