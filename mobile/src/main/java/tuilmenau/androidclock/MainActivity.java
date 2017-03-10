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
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("Hello develop!");
        System.out.println("Hello commit!");
=======
<<<<<<< HEAD
=======
>>>>>>> 6668545135c6b4c72d9a5b0971928aeddab95f76


        System.out.println("Hello world! Are you ready to code?!");
<<<<<<< HEAD
>>>>>>> 0499f7ecdcf8beda1a46fcf8f695330a3ddfc396
>>>>>>> 9a46e7b5030d1e9faaf630ba3b1c07c650d6c2b7
=======

>>>>>>> 6668545135c6b4c72d9a5b0971928aeddab95f76
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


