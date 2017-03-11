package tuilmenau.androidclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //######### example: make imageview (in)visible
        ImageView hour00 = (ImageView) findViewById(R.id.imageView1);
        hour00.setVisibility(View.VISIBLE);
        ImageView hour10 = (ImageView) findViewById(R.id.imageView2);
        hour10.setVisibility(View.VISIBLE);

        //######### test: read system time (hour + minutes)############

        //new Time(System.currentTimeMillis()).getHours();
        //Calendar calendar = calendar.getInstance();
        //long timenow = System.currentTimeMillis();
        int current_hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);//int current_hour = calendar.get(GregorianCalendar.HOUR_OF_DAY);
        int current_minutes = Calendar.getInstance().get(Calendar.MINUTE);

        TextView current_time = (TextView) findViewById(R.id.textView1);
        current_time.setText(hour1(current_hour) + "     " + hour2(current_hour) + "                        " + minute1(current_minutes) + "     " + minute2(current_minutes));

        TextView time_now = (TextView) findViewById(R.id.textView2);
        time_now.setText("hi");

    }

    public int hour1(int current_hour) {
        return (int) ((current_hour / Math.pow(10, 1)) % 10);
    }

    public int hour2(int current_hour) {
        return (int) ((current_hour / Math.pow(10, 2)) % 10);
    }

    public int minute1(int current_minutes) {
        return (int) ((current_minutes / Math.pow(10, 1)) % 10);
    }

    public int minute2(int current_minutes) {
        return (int) ((current_minutes / Math.pow(10, 2)) % 10);
    }


        /*CalculateTime(2, 0, 5, 3);

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Log.i("tag", "A kiss every 5 seconds");
                this.hour10.setVisibility(View.VISIBLE);

            }
        }, 0, 5000);

        new Timer2().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Log.i("tag", "A kiss every 5 seconds");
                this.hour10.setVisibility(View.INVISIBLE);

            }
        }, 0, 2500);
    }

    protected void CalculateTime(int hour1, int hour2, int minute1, int minute2) {
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

        matrix[0][3] = minute2 % 2;*/


}


