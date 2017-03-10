package tuilmenau.androidclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello world!");
        System.out.println("Hello world! Another one!");
        System.out.println("Hello world! Are you ready to code?!");
        System.out.println("Commit");
    }
    protected void CalculateTime(int hour1, int hour2, int minute1, int minute2){
        int matrix[][] = {};

            matrix[3][0] = hour1 % 2;
            hour1 /= 2;

            matrix[2][0] = hour1 % 2;
            hour1 /= 2;

            matrix[1][0] = hour1 % 2;
            hour1 /= 2;

            matrix[0][0] = hour1 % 2;
            hour1 /= 2;
        //

            matrix[3][1] = hour1 % 2;
            hour2 /= 2;

            matrix[2][1] = hour1 % 2;
            hour2 /= 2;

            matrix[1][1] = hour1 % 2;
            hour2 /= 2;

            matrix[0][1] = hour1 % 2;
            hour2 /= 2;

        //
            matrix[3][2] = hour1 % 2;
            minute1 /= 2;

            matrix[2][2] = hour1 % 2;
            minute1 /= 2;

            matrix[1][2] = hour1 % 2;
            minute1 /= 2;

            matrix[0][2] = hour1 % 2;
            minute1 /= 2;
        //
            matrix[3][3] = hour1 % 2;
            minute2 /= 2;

            matrix[2][3] = hour1 % 2;
            minute2 /= 2;

            matrix[1][3] = hour1 % 2;
            minute2 /= 2;

            matrix[0][3] = hour1 % 2;
            minute2 /= 2;

    }

}


