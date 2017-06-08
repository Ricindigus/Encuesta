package pe.gob.inei.encuesta.fragments.capitulo300;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.gob.inei.encuesta.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class C300F1Fragment extends Fragment {


    public C300F1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_c300_f1, container, false);
        return view;
    }

}
