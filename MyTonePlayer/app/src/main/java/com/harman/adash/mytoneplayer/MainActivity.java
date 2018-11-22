package com.harman.adash.mytoneplayer;

import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button playRing,playAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playRing= (Button)findViewById(R.id.button_ringtone);
        playAlarm=(Button)findViewById(R.id.button_alarm);
        playRing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri ringuri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
                Ringtone ringtonesound = RingtoneManager.getRingtone(getApplicationContext(), ringuri);
                if (ringtonesound != null) {
                    ringtonesound.play();
                }
                Log.i("Audio Play API", "sample input from Play ring API");
            }
        });
        playAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri alrmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);

                Ringtone alarmsound = RingtoneManager.getRingtone(getApplicationContext(), alrmUri);

                if (alarmsound != null) {
                    alarmsound.play();
                }
            }
        });
    }

}
