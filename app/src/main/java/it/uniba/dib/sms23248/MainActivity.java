package it.uniba.dib.sms23248;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Button avanti_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        avanti_btn=findViewById(R.id.nextStep_btn) ;
        avanti_btn.setOnClickListener(v -> scegli_vista());

    }

    public void scegli_vista(){
        Intent intent= new Intent(this,IntroUsoAppActivity.class);
        startActivity(intent);

    }

}


