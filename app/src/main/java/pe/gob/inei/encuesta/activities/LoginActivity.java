package pe.gob.inei.encuesta.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import pe.gob.inei.encuesta.R;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText txtUsuario;
    private TextInputEditText txtPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUsuario = (TextInputEditText) findViewById(R.id.txtUsuario);
        txtPassword = (TextInputEditText) findViewById(R.id.txtPassword);
        btnIngresar = (Button) findViewById(R.id.btnIngresar);

        SharedPreferences sharedPreferences = getSharedPreferences("Usuarios",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("usuario","inei");
        editor.putString("password","inei");
        editor.commit();

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferencias = getSharedPreferences("Usuarios", MODE_PRIVATE);

                String usuario = txtUsuario.getText().toString();
                String password = txtPassword.getText().toString();
                if(usuario.equals(preferencias.getString("usuario","")) && password.equals(preferencias.getString("password",""))){
                    Intent intent = new Intent(getApplicationContext(),MarcoActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "Usuario o Password Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
