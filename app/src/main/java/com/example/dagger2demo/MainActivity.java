package com.example.dagger2demo;

import android.os.Bundle;

import com.example.dagger2demo.dagger.cars.Car;
import com.example.dagger2demo.dagger.cars.CarComponent;
import com.example.dagger2demo.dagger.cars.DaggerCarComponent;
import com.example.dagger2demo.dagger.modules.DieselEngineModule;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import javax.inject.Inject;
public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity" ;
    @Inject Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = ((ExampleApp)getApplication()).getCarComponent();
        carComponent.inject(MainActivity.this);
       try {
           car1.drive();
           car2.drive();
       }
       catch (Exception e){
           Log.e(TAG, "onCreate: "+e.getLocalizedMessage());
       }

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}