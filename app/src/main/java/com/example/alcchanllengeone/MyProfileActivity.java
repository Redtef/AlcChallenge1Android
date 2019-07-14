package com.example.alcchanllengeone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeDisplayContent();
    }

    private void initializeDisplayContent() {
        getSupportActionBar().setTitle("My Profile");
        ImageView profileImage = findViewById(R.id.myProfileImage);
        TextView profileName = findViewById(R.id.myProfileName);
        TextView profileTrack= findViewById(R.id.myProfileTrack);
        TextView profileCountry = findViewById(R.id.myProfileCountry);
        TextView profileEmail = findViewById(R.id.myProfileEmail);
        TextView profilePhoneNumber = findViewById(R.id.myProfilePhoneNumber);
        TextView profileSlackUsername = findViewById(R.id.myProfileSlackUsername);

        profileImage.setImageResource(R.drawable.picture);
        profileName.setText("Hamza Takouit");
        profileTrack.setText("Android");
        profileCountry.setText("Morocco");
        profileEmail.setText("hamzatakouit@gmail.com");
        profilePhoneNumber.setText("+212677352220");
        profileSlackUsername.setText("@HamzaT");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
