package pe.gob.inei.encuesta.activities;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import pe.gob.inei.encuesta.R;
import pe.gob.inei.encuesta.fragments.capitulo300.C300F1Fragment;
import pe.gob.inei.encuesta.fragments.capitulo300.C300F2Fragment;

public class EncuestaActivity extends AppCompatActivity {
    C300F1Fragment c300F1Fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        fragmentManager = getSupportFragmentManager();

        c300F1Fragment = new C300F1Fragment();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.contenedor, c300F1Fragment);
        fragmentTransaction.commit();
    }
}
