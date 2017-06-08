package pe.gob.inei.encuesta.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pe.gob.inei.encuesta.R;

public class MarcoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marco);
    }

    public void irAEncuesta(View view){
        Intent intent = new Intent(this,EncuestaActivity.class);
        startActivity(intent);
    }
}
