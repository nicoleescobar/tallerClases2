package com.example.android.tallerclases2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class reportesCelulares extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes_celulares);

        lv = (ListView)findViewById(R.id.reportes);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.Reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(reportesCelulares.this, Reporte1.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(reportesCelulares.this, Reporte2.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(reportesCelulares.this, Reporte3.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }

}
