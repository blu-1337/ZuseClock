package tuilmenau.androidclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;


public class MainActivity extends AppCompatActivity {


@Override
protected void onCreate(Bundle savedInstanceState) {


    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hour00 = (ImageView) findViewById(R.id.imageView1);
        hour00.setVisibility(View.VISIBLE);
        ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
        hour10.setVisibility(View.VISIBLE);

        CalculateTime(2,0,5,3);

        new Timer().scheduleAtFixedRate(new TimerTask(){
                @Override
                public void run(){
                        Log.i("tag", "A kiss every 5 seconds");
                        this.hour10.setVisibility(View.VISIBLE);

                }
        }, 0,5000);

        new Timer2().scheduleAtFixedRate(new TimerTask(){
                @Override
                public void run(){
                  Log.i("tag", "A kiss every 5 seconds");
                         this.hour10.setVisibility(View.INVISIBLE);

        }
        }, 0,2500);
}

    protected void CalculateTime(int hour1, int hour2, int minute1, int minute2){
        int matrix[][] = {};

        //first column
            matrix[3][0] = hour1 % 2;
            hour1 /= 2;

            matrix[2][0] = hour1 % 2;
            hour1 /= 2;

            matrix[1][0] = hour1 % 2;
            hour1 /= 2;

            matrix[0][0] = hour1 % 2;


        //second column
            matrix[3][1] = hour1 % 2;
            hour2 /= 2;

            matrix[2][1] = hour1 % 2;
            hour2 /= 2;

            matrix[1][1] = hour1 % 2;
            hour2 /= 2;

            matrix[0][1] = hour1 % 2;

        //third column
            matrix[3][2] = hour1 % 2;
            minute1 /= 2;

            matrix[2][2] = hour1 % 2;
            minute1 /= 2;

            matrix[1][2] = hour1 % 2;
            minute1 /= 2;

            matrix[0][2] = hour1 % 2;

        //fourth column
            matrix[3][3] = hour1 % 2;
            minute2 /= 2;

            matrix[2][3] = hour1 % 2;
            minute2 /= 2;

            matrix[1][3] = hour1 % 2;
            minute2 /= 2;

            matrix[0][3] = hour1 % 2;

    }

}


