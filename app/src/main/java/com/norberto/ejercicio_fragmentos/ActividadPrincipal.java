package com.norberto.ejercicio_fragmentos;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager frgnew=getSupportFragmentManager();
        FragmentTransaction frgtrnew=frgnew.beginTransaction();

        switch (item.getItemId()){

            case R.id.fragment1:
                Fragmento1 frg1= new Fragmento1();
                frgtrnew.replace(android.R.id.content,frg1);
                frgtrnew.commit();
                break;
            case R.id.fragment2:
                Fragmento2 frg2= new Fragmento2();
                frgtrnew.replace(android.R.id.content, frg2);
                frgtrnew.commit();
                break;
            case R.id.fragment3:
                Fragmento3 frg3= new Fragmento3();
                frgtrnew.replace(android.R.id.content,frg3);
                frgtrnew.commit();
                break;

        }



        return super.onOptionsItemSelected(item);
    }
}
