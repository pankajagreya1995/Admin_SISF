package com.agreyasoft.admin_sisf.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.agreyasoft.admin_sisf.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Home_Admin extends AppCompatActivity{
    BottomNavigationView navView;
    NavController navController;
    public static Home_Admin home_admin_Activity;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__admin);
        home_admin_Activity=this;

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Admin.this,Schedule.class));
            }
        });
        TextView btn_tutor=findViewById(R.id.tutor_list_btn);
        btn_tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_Admin.this,Tutor_list.class));
            }
        });
        navView = findViewById(R.id.nav_view_admin);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        try{     AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home_admin, R.id.navigation_student_admin, R.id.navigation_batch_admin, R.id.navigation_subject_admin, R.id.navigation_fee_managment_admin)
                .build();
            navController = Navigation.findNavController(Home_Admin.this, R.id.nav_host_fragment_admin);
            NavigationUI.setupActionBarWithNavController(Home_Admin.this, navController, appBarConfiguration);
            NavigationUI.setupWithNavController(navView, navController);
         }catch (Exception e){
            Toast.makeText(home_admin_Activity, e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();}

    }


}
