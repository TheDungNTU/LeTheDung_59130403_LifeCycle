package vn.edu.thedung.lethedung_59130403_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LifeCycle","onCreate is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onCreate is called", Toast.LENGTH_SHORT);
        toast.show();

        SimpleDateFormat spf = new SimpleDateFormat("hh:mm:ss");
        String strDate = spf.format(new Date());

        TextView t = findViewById(R.id.txtDate);

        t.setText(strDate);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onStart is called", Toast.LENGTH_SHORT);
        toast.show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onRestart is called", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onResume is called", Toast.LENGTH_SHORT);
        toast.show();

        SimpleDateFormat spf = new SimpleDateFormat("hh:mm:ss");
        String strDate = spf.format(new Date());

        TextView t = findViewById(R.id.txtDate);

        t.setText(strDate);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onPause is called", Toast.LENGTH_SHORT);
        toast.show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onStop is called", Toast.LENGTH_SHORT);
        toast.show();

    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy is called");

        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy is called", Toast.LENGTH_SHORT);
        toast.show();

    }
}

