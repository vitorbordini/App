package com.example.joo.myapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by João on 15/10/2016.
 */
public class ListaLembretes extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_lembretes); // COMENTARIZADO
        String[] lembretes = new String[]{
                "Lembrete 1",
                "Lembrete 2",
                "Lembrete 3",
                "Lembrete 4",
                "Lembrete 5",
                "Lembrete 6"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, lembretes);// ANTES: l2 = getListView // (this, android.R.layout.simple_list_item_1, lembretes)
        getListView().setAdapter(adapter); // setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Intent intent;
        switch(position){
            case 0:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            case 1:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            case 2:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            case 3:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            case 4:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            case 5:
                //intent = new Intent(this, Recado.class); <--
                //startActivity(intent);
                break;
            default:
                finish();

        }
        //Object o = this.getListAdapter().getItem(position);
        //String item = o.toString();
        //Toast.makeText(this, item+" - "+position+" - "+id, Toast.LENGTH_LONG).show();
    }

    //public void add2(View view){}

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
                //Intent i1 = new Intent(this, MainActivity.class); <--
                //startActivity(i1); <--
                finish();
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
