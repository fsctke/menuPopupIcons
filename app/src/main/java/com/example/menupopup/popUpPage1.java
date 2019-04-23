package com.example.menupopup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class popUpPage1 extends AppCompatActivity {
Toolbar myToolBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_page1);

        //change styles.xml theme to NoActionBar, create a toolbar in visual mode link it to the code below in onCreate override
        myToolBar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolBar);
    }

    //rightclick res folder>new>android resource file>menu
    //add this code in mainactivity class after closing onCreate override
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item1) {
            Toast.makeText(this, "item1 clicked", Toast.LENGTH_SHORT).show();
            //right click java folder->new>activity>empty Activity
            Intent myIntent = new Intent(getApplicationContext(), popUpPage1.class);
            startActivity(myIntent);

        } else if (id == R.id.item2) {

            Toast.makeText(this, "item2 clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.item3) {

            Toast.makeText(this, "item3 clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }



}
