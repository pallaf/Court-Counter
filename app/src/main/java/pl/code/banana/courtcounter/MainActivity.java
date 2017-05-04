package pl.code.banana.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final char A = 'A', B = 'B';
    private int scoreA, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void increaseA(View view) {
        int id = view.getId();
        int points = 0;
        if (id == R.id.one_point_button_A)
            points = 1;
        if (id == R.id.two_points_button_A)
            points = 2;
        if (id == R.id.three_points_button_A)
            points = 3;
        scoreA = increaseScore(scoreA, points);
        display(scoreA, A);
    }

    public void increaseB(View view) {
        int id = view.getId();
        int points = 0;
        if (id == R.id.one_point_button_B)
            points = 1;
        if (id == R.id.two_points_button_B)
            points = 2;
        if (id == R.id.three_points_button_B)
            points = 3;
        scoreB = increaseScore(scoreB, points);
        display(scoreB, B);
    }

    private int increaseScore(int score, int points) {
        return score += points;
    }

    public void display(int score, char x) {
        TextView t = null;
        if (x == 'A')
            t = (TextView) findViewById(R.id.score_text_view_A);
        if (x == 'B')
            t = (TextView) findViewById(R.id.score_text_view_B);
        t.setText("" + score);
    }

    public void reset(View view) {
        scoreA = scoreB = 0;
        display(scoreA, A);
        display(scoreB, B);
    }
}
