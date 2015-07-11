package com.example.laboratorios.practicadropdown;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class DropDownActivity extends ActionBarActivity {

    Spinner sp1, sp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

        sp1 = (Spinner) findViewById(R.id.spinner1);
        sp2 = (Spinner) findViewById(R.id.spinner2);

        sp1.setOnItemSelectedListener(spListener);
    }

    AdapterView.OnItemSelectedListener spListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String currentValue = sp1.getItemAtPosition(position).toString();
            List<String> l = new ArrayList<String>();

            switch (currentValue) {
                case "DF":
                    l.add("Miguel Hidalgo");
                    l.add("Coyoacan");
                    break;
                case "PUEBLA":
                    l.add("Puebla");
                    l.add("Cholula");
                    break;
                case "MEXICO":
                    l.add("Ecatepec");
                    l.add("Toluca");
                    break;
                case "VERACRUZ":
                    l.add("Veracruz");
                    l.add("Cordoba");
                    break;
                case "NAYARIT":
                    l.add("Nayarit");
                    l.add("Acaponeta");
                    break;
                case "NUEVO LEON":
                    l.add("Monterrey");
                    l.add("Apodaca");
                    break;
                default:
                    l.add("Sin registro");
                    break;
            }
            ArrayAdapter<String> aa = new ArrayAdapter<String>(DropDownActivity.this , android.R.layout.simple_spinner_item, l);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp2.setAdapter(aa);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}
