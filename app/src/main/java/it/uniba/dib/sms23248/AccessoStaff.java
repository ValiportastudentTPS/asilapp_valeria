package it.uniba.dib.sms23248;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AccessoStaff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accesso_staff);

        EditText mailstaff, passStaff;
        Button confermaMembro;

        mailstaff=findViewById(R.id.email);
        passStaff=findViewById(R.id.password);
        confermaMembro=findViewById(R.id.btnConfirmStaff);

        confermaMembro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mailstaff.getText().toString().equals("nome.cognome@centro.it") && passStaff.getText().toString().equals("Password")) {
                    Toast.makeText(AccessoStaff.this, " autenticazione con successo", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AccessoStaff.this, "autenticazione fallita", Toast.LENGTH_SHORT).show();
                }
            }
        });


        ImageView addMemberstaff;

            addMemberstaff=findViewById(R.id.addUser);

            addMemberstaff.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    nuovoMembro();
                }
            });

        }

        public void nuovoMembro(){
            Intent intent= new Intent(this,RegistrazioneStaff.class);
            startActivity(intent);

        }
    }
