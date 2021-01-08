package com.example.dagger2demo;

import android.os.Bundle;

import com.example.dagger2demo.dagger.cars.Car;
import com.example.dagger2demo.dagger.cars.ActivityComponent;
import com.example.dagger2demo.dagger.cars.DaggerActivityComponent;
import com.example.dagger2demo.dagger.cars.Driver;
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
    @Inject Driver driver1,driver2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = DaggerActivityComponent.builder()
                .horsePower(125)
                .engineCapacity(1200)
                .appComponent(((ExampleApp)getApplication()).getActivityComponent())
                .build();
        activityComponent.inject(MainActivity.this);
       try {
           car1.drive();
           car2.drive();
           System.out.println("Car1:"+car1);
           System.out.println("Car2:"+car2);

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