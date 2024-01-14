package it.uniba.dib.sms23248;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class RegistrazioneRichiedente extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button confirm_reg;
    EditText name,Surname,phone,date_birth,place_birth,password, email;

    ImageButton iscritti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione_richiedente);

        name=findViewById(R.id.nome);
        Surname=findViewById(R.id.cognome);
        password=findViewById(R.id.password);
        phone=findViewById(R.id.cell);
        date_birth=findViewById(R.id.dataNascita);
        place_birth=findViewById(R.id.luogoNascita);
        email=findViewById(R.id.email);
        Spinner genere;
        genere=findViewById(R.id.spinner_genere);

        confirm_reg=findViewById(R.id.confirm_registration1);


        confirm_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seleziona_genere=genere.getSelectedItem().toString();
                String birthDate = date_birth.getText().toString().trim();

                Map<String, Object> RichiedenteAsilo = new HashMap<>();
                if(!name.getText().toString().isEmpty() &&
                        !Surname.getText().toString().isEmpty() &&
                        !password.getText().toString().isEmpty()&&
                        !phone.getText().toString().isEmpty() &&
                        !place_birth.getText().toString().isEmpty() &&
                        !date_birth.getText().toString().trim().isEmpty()&&
                        !seleziona_genere.isEmpty() &&
                        !email.getText().toString().isEmpty()
                ) {

                    RichiedenteAsilo.put("Nome",name.getText().toString());
                    RichiedenteAsilo.put("Cognome",Surname.getText().toString());
                    RichiedenteAsilo.put("Cellulare",phone.getText().toString()); //PK
                    RichiedenteAsilo.put("DataNascita",birthDate);
                    RichiedenteAsilo.put("LuogoNascita",place_birth.getText().toString());
                    RichiedenteAsilo.put("Genere",seleziona_genere);
                    RichiedenteAsilo.put("Password",password.getText().toString());
                    RichiedenteAsilo.put("Email",email.getText().toString());

                    db.collection("RICHIEDENTI_ASILO").document("0002").set(RichiedenteAsilo);
                    Toast.makeText(RegistrazioneRichiedente.this, "Registrazione successo", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(RegistrazioneRichiedente.this, "Registrazione rifiutata", Toast.LENGTH_SHORT).show();}


            }

        });





;
    }


    }

