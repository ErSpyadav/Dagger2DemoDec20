package com.example.dagger2demo;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.example.dagger2demo.dagger.cars.ActivityComponent;
import com.example.dagger2demo.dagger.cars.Car;
import com.example.dagger2demo.dagger.cars.Driver;
import com.example.dagger2demo.dagger.modules.DieselEngineModule;
import com.example.dagger2demo.mvvm.MainViewModel;
import androidx.appcompat.app.AppCompatActivity;


import android.util.Log;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity" ;
    @Inject Car car1,car2;
    @Inject Driver driver1,driver2;
//    @Inject
//    MainViewModel  mainViewModel;

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent activityComponent = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(1200));
        activityComponent.inject(MainActivity.this);
        try {
            car1.drive();
            car2.drive();
            System.out.println("Car1:" + car1);
            System.out.println("Car2:" + car2);

        } catch (Exception e) {
            Log.e(TAG, "onCreate: " + e.getLocalizedMessage());
        }


    }
}