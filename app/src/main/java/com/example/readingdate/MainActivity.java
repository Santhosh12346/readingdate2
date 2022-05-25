package com.example.readingdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.etName);
        Employee venkat = new Employee("santhosh",123,true);
        venkat.setEname("Santhosh");
        Student santhosh = new Student("Santhosh",123,true);
    }





    public void handleClick(View viewClicked) {
        switch (viewClicked.getId()){
            case R.id.btnsubmit:
                startHome();
            case R.id.btndial:
                Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9618021804"));
                startActivity(dialIntent);
            case R.id.btnalarm:
                createAlarm("almarm set",12,1);

        }

    }
    public void startHome(){
        String name = nameEditText.getText().toString();
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        Intent hIntent = new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("harmankey",name);
        startActivity(hIntent);
    }
    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}