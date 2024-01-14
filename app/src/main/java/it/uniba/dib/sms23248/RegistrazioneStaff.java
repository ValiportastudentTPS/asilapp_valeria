package it.uniba.dib.sms23248;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class RegistrazioneStaff extends AppCompatActivity {
    Button confirm_reg;
    EditText phone,center,password,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_staff);

        phone=findViewById(R.id.Cellulare);

        center=findViewById(R.id.centro);

        password=findViewById(R.id.password);

        email=findViewById(R.id.email);


        confirm_reg=findViewById(R.id.confirmreg_staff);

        confirm_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.getText().toString().equals("Password") &&
                        phone.getText().toString().equals("3270891207") &&
                        email.getText().toString().equals("nome.cognome@centro.it") &&
                        center.getText().toString().equals("1")) {
                    Toast.makeText(RegistrazioneStaff.this, "Registrazione completata", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(RegistrazioneStaff.this, "Registrazione rifiutata", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}