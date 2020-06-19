package com.example.absensimahasiswa;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout,profile,matkulA,matkulB,matkulC,matkulD,Help;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLogout = findViewById(R.id.logout);
        profile = findViewById(R.id.button6);
        matkulA = findViewById(R.id.buttonA);
        matkulB = findViewById(R.id.buttonB);
        matkulC = findViewById(R.id.buttonC);
        matkulD = findViewById(R.id.buttonD);
        Help = findViewById(R.id.button10);


        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToProfile = new Intent(HomeActivity.this, Profile.class);
                startActivity(intToProfile);
            }
        });
        matkulA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToA = new Intent(HomeActivity.this, A.class);
                startActivity(intToA);
            }
        });
        matkulB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToB = new Intent(HomeActivity.this, B.class);
                startActivity(intToB);
            }
        });
        matkulC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToC = new Intent(HomeActivity.this, C.class);
                startActivity(intToC);
            }
        });
        matkulD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToD = new Intent(HomeActivity.this, D.class);
                startActivity(intToD);
            }
        });
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToHelp = new Intent(HomeActivity.this, Help.class);
                startActivity(intToHelp);
            }
        });

    }
}
