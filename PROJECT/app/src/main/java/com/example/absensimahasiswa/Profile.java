package com.example.absensimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {
    private String getNIM, getNama;
    private EditText NIM, Nama;
    private String getUserID;
    Button btnSave;

    private FirebaseAuth auth;
    private FirebaseDatabase database;
    private DatabaseReference getReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);
        NIM = findViewById(R.id.editText5);
        Nama = findViewById(R.id.editText4);
        btnSave = findViewById(R.id.button8);
        database = FirebaseDatabase.getInstance();

        auth = FirebaseAuth.getInstance();
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* mDatabaseReference = database.getReference().child("Nama");
                mDatabaseReference.setValue("Thariq");
                startActivity(new Intent(Profile.this, HomeActivity.class));
                */


                getNIM = NIM.toString();
                getNama = Nama.toString();
                getReference = database.getReference(); // Mendapatkan Data Referensi dari Database
                getReference.child("Profile").child(getUserID).child("Mata Kuliah")
                        .setValue(getNIM, getNama);
                Toast.makeText(Profile.this, "Update Profil Berhasil", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Profile.this, HomeActivity.class));

                /*
                if{
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(MainActivity.this,"SignUp Unsuccessful, Please Try Again",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(MainActivity.this,HomeActivity.class));
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(MainActivity.this,"Error Occurred!",Toast.LENGTH_SHORT).show();

                }*/
            }
        });
    }
}
