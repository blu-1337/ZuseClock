package tuilmenau.androidclock;

import android.support.v7.app.AppCompatActivity;
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
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {


<<<<<<< HEAD
    private static final String TAG = "Main Activity TAG: ";

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    //Timer Function
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    int secondsPassed = 0;
    int i = 0;

    Timer myTimer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            secondsPassed++;
            setContentView(R.layout.activity_main);
            Log.i(TAG, "Seconds passed: " + secondsPassed);
            ImageView hour00 = (ImageView) findViewById(R.id.imageView1);
            if (i % 2 == 0)
                hour00.setVisibility(View.VISIBLE);
            else
                hour00.setVisibility(View.INVISIBLE);
            i++;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    public void start(){
        Log.i(TAG, "PLEASE SAVE US FROM THIS PROGRAMMING NIGHTMARE!");
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
    }


    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-


    Button b1, b2, b3;

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

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrix[i][j]);
            System.out.println("");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        MainActivity test = new MainActivity();
        test.start();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hour00 = (ImageView) findViewById(R.id.imageView1);
        hour00.setVisibility(View.VISIBLE);

        ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
        hour10.setVisibility(View.VISIBLE);

        convertTime(2, 0, 5, 3);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);


//
//        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
//        //Here i tried to make a timer
//        //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
//
//        Timer timer = new Timer();
//
//        timer.schedule(new TimerTask(){
//            public int i = 0;
//            public ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
//
//            public void run(){
//                if (i % 2 == 0){
//                    setContentView(R.layout.activity_main);
//                    ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
//                    hour10.setVisibility(View.VISIBLE);
//                } else {
//
//                    ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
//                    hour10.setVisibility(View.GONE);
//                }
//                this.i++;
//            }
//        }, 0,2000);


//        Timer timer2 = new Timer();
//        timer2.schedule(new TimerTask(){
//            public void run(){
//                ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
//                hour10.setVisibility(View.INVISIBLE);
//            }
//        }, 0,1000);


//        new Timer().scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run () {
//                Log.i("tag", "A kiss every 5 seconds");
//                ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
//                hour10.setVisibility(View.INVISIBLE);
//
//        }
//    },0,2500);
//     //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    //buttons experiment
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public void b1Clicked(View v){
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }
    public void b2Clicked(View v){
        b2.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }
    public void b3Clicked(View v){
        b3.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

}




