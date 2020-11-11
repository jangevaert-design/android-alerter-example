package edu.cnm.deepdive.alerterexample;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlerter(View v) {
        Alerter.create(this)
            .setTitle("Alert Title")
            .setText("Alert Text")
            .setIcon(R.drawable.ic_baseline_notifications_active_24)
            .setBackgroundColorRes(R.color.colorAccent)
            .setDuration(5_000)
            .enableSwipeToDismiss()
            .enableProgress(true)
            .setProgressColorRes(R.color.colorPrimary)
            .show();
    }
}