package e.lil.pp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    public void Ellos(View view) {
        Intent intent = new Intent(this, Datos.class);
        startActivity(intent);
    }

    public void Ellas(View view) {
        Intent intent = new Intent(this, Datos.class);
        startActivity(intent);
    }

    public void Mixto(View view) {
        Intent intent = new Intent(this, Datos.class);
        startActivity(intent);
    }
}
