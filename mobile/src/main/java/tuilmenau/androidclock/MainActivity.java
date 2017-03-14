package tuilmenau.androidclock;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Time;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity TAG: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
        hour10.setVisibility(View.VISIBLE);

        new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                while (!Thread.interrupted())
                    try
                    {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() // start actions in UI thread
                        {

                            @Override
                            public void run()
                            {
                                ImageView hour00 = (ImageView) findViewById(R.id.imageView00);
                                if (hour00.getVisibility() == View.VISIBLE)
                                    hour00.setVisibility(View.INVISIBLE);
                                else hour00.setVisibility(View.VISIBLE);


                            }
                        });
                    }
                    catch (InterruptedException e)
                    {
                        // ooops
                    }
            }
        }).start(); // the while thread will start in BG thread


        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //transparency test
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        ImageView myImage = (ImageView) findViewById(R.id.imageView3);
        myImage.setAlpha(50);
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-




        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //read system clock (hour + minutes) and print it in textview1
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        int current_hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int current_minutes = Calendar.getInstance().get(Calendar.MINUTE);

        TextView current_time = (TextView) findViewById(R.id.textView1);
        current_time.setText(hour1(current_hour) + "  " + hour2(current_hour) + "       " + minute1(current_minutes) + "  " + minute2(current_minutes));
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

        convertTime(2, 0, 5, 3);

    }

    public void convertTime(int hour1, int hour2, int minute1, int minute2) {

        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //This function converts pasted in time in a binary
        //matrix; matrix to be read from bottom up
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-



        int[][] matrix = new int[4][4];

        //int hour1 = 2, hour2 = 1, minute1 = 3, minute2 = 9;

        //first column
        matrix[3][0] = hour1 % 2;
        hour1 /= 2;

        matrix[2][0] = hour1 % 2;
        hour1 /= 2;

        matrix[1][0] = hour1 % 2;
        hour1 /= 2;

        matrix[0][0] = hour1 % 2;

        //second column
        matrix[3][1] = hour2 % 2;
        hour2 /= 2;

        matrix[2][1] = hour2 % 2;
        hour2 /= 2;

        matrix[1][1] = hour2 % 2;
        hour2 /= 2;

        matrix[0][1] = hour2 % 2;

        //third column
        matrix[3][2] = minute1 % 2;
        minute1 /= 2;

        matrix[2][2] = minute1 % 2;
        minute1 /= 2;

        matrix[1][2] = minute1 % 2;
        minute1 /= 2;

        matrix[0][2] = minute1 % 2;

        //fourth column
        matrix[3][3] = minute2 % 2;
        minute2 /= 2;

        matrix[2][3] = minute2 % 2;
        minute2 /= 2;

        matrix[1][3] = minute2 % 2;
        minute2 /= 2;

        matrix[0][3] = minute2 % 2;
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        //This printout needs to be changed, it prints in
        //System.out; needs to print to phone screen
        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++)
//                System.out.print(matrix[i][j]);
//            System.out.println("");
//        }

        for(int i = 0; i < 4; i++)
            for(int j = 0; j< 4; j++){
                String imageID = "imageView" + i + j;
                int resourceID = getResources().getIdentifier(imageID, "id", getPackageName());
                ImageView myImage = (ImageView) findViewById(resourceID);
                if(matrix[i][j] == 0){
                    myImage.setAlpha(50);
                } else {
                    myImage.setAlpha(255);
                }



            }


    }

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    //functions that split hours and minutes into single digits
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    public int hour1(int x) {
        int l = Integer.toString(x).length();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = x % 10;
            x /= 10;
        }
        int digit = array[1];
        return digit;
    }

    public int hour2(int x) {
        int l = Integer.toString(x).length();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = x % 10;
            x /= 10;
        }
        int digit = array[0];
        return digit;

    }

    public int minute1(int y) {
        int l = Integer.toString(y).length();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = y % 10;
            y /= 10;
        }
        int digit = array[1];
        return digit;
    }

    public int minute2(int y) {
        int l = Integer.toString(y).length();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = y % 10;
            y /= 10;
        }
        int digit = array[0];
        return digit;
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
}




