package it.uniba.dib.sms23248;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AccessoRichiedente extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button confirm_log;
    EditText email, password;

    TextView addAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesso_richiedente);

        confirm_log = findViewById(R.id.loginButton);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        confirm_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> RichiedenteAsilo = new HashMap<>();
                if (!password.getText().toString().isEmpty()&&
                        !email.getText().toString().isEmpty() ) {

                    Toast.makeText(AccessoRichiedente.this, " autenticazione con successo", Toast.LENGTH_SHORT).show();
                }
                else { Toast.makeText(AccessoRichiedente.this, "autenticazione fallita", Toast.LENGTH_SHORT).show();}
            }
        });

        addAccount=findViewById(R.id.enter_signup);

        addAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrati();
            }
        });
    }

    public void registrati(){
        Intent intent= new Intent(this,RegistrazioneRichiedente.class);
        startActivity(intent);

    }
}