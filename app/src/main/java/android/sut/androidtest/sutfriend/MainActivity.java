package android.sut.androidtest.sutfriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // main method
    // Get Event frome click button
    public void clickSingUpMain(View View) {
        startActivity(new Intent(MainActivity.this,SingUpActivity.class));
    }
} // main class นี่คือ คลาสหลัก

