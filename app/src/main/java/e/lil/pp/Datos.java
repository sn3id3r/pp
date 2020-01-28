package e.lil.pp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Datos extends AppCompatActivity {

    private EditText name, phone, quantity, reception, delivery, receptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        name = (EditText) findViewById(R.id.nombre);
        phone = (EditText) findViewById(R.id.telefono);
        quantity = (EditText) findViewById(R.id.cantidad);
        reception = (EditText) findViewById(R.id.recepcion);
        delivery = (EditText) findViewById(R.id.entrega);
        receptor = (EditText) findViewById(R.id.receptor);
    }


    public void enviar(View view) {
        String nombre = name.getText().toString();
        String celular = phone.getText().toString();
        String cantidad = quantity.getText().toString();
        String recepcion = reception.getText().toString();
        String entrega = delivery.getText().toString();
        String recibe = receptor.getText().toString();

        if(TextUtils.isEmpty(nombre)){
            Toast.makeText(this, "Por favor ingrese su nombre", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(celular)){
            Toast.makeText(this, "Por favor ingrese su celular", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(cantidad)){
            Toast.makeText(this, "Por favor ingrese la cantidad de pares de zapatos", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(recepcion)){
            Toast.makeText(this, "Por favor ingrese la dirección de recepción", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(entrega)){
            Toast.makeText(this, "Por favor ingrese la dirección de entrega", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(recibe)){
            Toast.makeText(this, "Por favor ingrese el nombre de la persona que recibe", Toast.LENGTH_SHORT).show();
            return;
        }




    }
}
