package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtnumero;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnumero = (EditText) findViewById(R.id.editText2);
        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int pago = 40;
                double total;
                int numero = Integer.parseInt(txtnumero.getText().toString());
                if (numero == 0 || numero <= 60 ) {
                    Toast.makeText(getApplicationContext(), "Hola" , Toast.LENGTH_LONG).show();
                    if (numero <= 40)
                    {
                        total=numero*pago;
                        Toast.makeText(getApplicationContext(), "El total es:" +total, Toast.LENGTH_LONG).show();
                    }
                    else {
                        if (numero >= 40 && numero < 50){

                            total=(numero-40)*80+1600;
                            Toast.makeText(getApplicationContext(), "El total es:" +total, Toast.LENGTH_LONG).show();
                        }
                        else {
                            if (numero >= 50 && numero < 60)
                            {
                                total=(numero-50)*120+2400;
                                Toast.makeText(getApplicationContext(), "El total es:" +total, Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Ingrese un número válido" , Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
