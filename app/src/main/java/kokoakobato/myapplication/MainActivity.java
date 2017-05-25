package kokoakobato.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void KikakuButtonClick (View v){
        Intent i = new Intent(MainActivity.this,KikakuActivity.class);
        startActivity(i);
    }
    public void StageButtonClick (View v){
        Intent i = new Intent(MainActivity.this,KikakuActivity.class);
        startActivity(i);
    }

    public void SettingButtonClick (View v){
        Intent i = new Intent(MainActivity.this,SettingsActivity.class);
        startActivity(i);
    }


}
