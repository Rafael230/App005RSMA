package mx.edu.cetis108.cetis108_app005r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button ola;
     Button hola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Tema(View v){
        Intent ola =  new Intent(this, Main2Activity.class);
        startActivity(ola);
    }
    public void NuevoTema (View v) {
        Intent hola = new Intent(this, Main3Activity.class);
        startActivity(hola);
    }
}
