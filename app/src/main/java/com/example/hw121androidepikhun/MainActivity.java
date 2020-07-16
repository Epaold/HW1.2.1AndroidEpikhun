package com.example.hw121androidepikhun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();

    }

    private void Init() {
        Button buttonok = findViewById(R.id.button_ok);



        buttonok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textresult = findViewById(R.id.textresult);
                EditText textName = findViewById(R.id.textName);
                EditText textemail =findViewById(R.id.textEmail);
                String name= textName.getText().toString();
                String email= textemail.getText().toString();
                textresult.setText("Подписка на рассылку успешно оформлена для пользователя " + name  + " на электронный адрес "+  email);
            }
        });

    }

public void btnClClicked(View view){
    TextView textresult = findViewById(R.id.textresult);
    textresult.setText("");

}


}
