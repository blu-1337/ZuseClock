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


}


