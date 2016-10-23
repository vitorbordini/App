package com.example.joo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.RelativeLayout;
import android.app.ListActivity;

public class MainActivity extends ListActivity { // ListActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.content_main);
        String[] pacientes = new String[] {
                "Paciente 1",
                "Paciente 2",
                "Paciente 3",
                "Paciente 4"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, pacientes);//getListView() //(this, android.R.layout.simple_list_item_1, pacientes)
        getListView().setAdapter(adapter); //setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent intent;
        switch(position){
            case 0:
                //intent = new Intent(this, PerfilPaciente.class);// <--
                //startActivity(intent);// <--
                break;
            case 1:
                //intent = new Intent(this, PerfilPaciente.class);// <--
                //startActivity(intent);// <--
                break;
            case 2:
                //intent = new Intent(this, PerfilPaciente.class);// <--
                //startActivity(intent);// <--
                break;
            case 3:
                //intent = new Intent(this, PerfilPaciente.class);// <--
                //startActivity(intent);// <--
                break;
            default:
                finish();
        }
        //Object o = this.getListAdapter().getItem(position);
        //String item = o.toString();
        //Toast.makeText(this, item+" - "+position+" - "+id, Toast.LENGTH_LONG).show();
    }

    //public void add(View view){}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent i1;
        switch(item.getItemId()){
            case R.id.menu_per:
                if(item.isChecked()) {
                    item.setChecked(false);
                }
                else {
                    item.setChecked(true);
                }
                // ADD CÓDIGO DE INTENT PERFIL MÈDICO
                //i1 = new Intent(this, PerfilMedico.class); <--
                //startActivity(i1); <--
                return true;
            case R.id.menu_pat:
                if(item.isChecked()) {
                    item.setChecked(false);
                }
                else {
                    item.setChecked(true);
                }
                // ADD CÓDIGO DE INTENT PACIENTES
                //i1 = new Intent(this, Activity_patientList.class); <--
                //startActivity(i1); <--
                return true;
            case R.id.menu_sa:
                if(item.isChecked()) {
                    item.setChecked(false);
                }
                else {
                    item.setChecked(true);
                }
                finish(); //<--
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
