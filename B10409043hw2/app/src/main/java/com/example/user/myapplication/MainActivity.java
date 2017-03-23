package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem Item){
        int itemThatWasClickedId = Item.getItemId();
        if (itemThatWasClickedId == R.id.toactivity2) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(Item);
    }


}
