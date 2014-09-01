package com.banqtech.tsedendamba.sunshine;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.app.NavUtils;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.banqtech.tsedendamba.sunshine.data.WeatherContract;
import com.banqtech.tsedendamba.sunshine.data.WeatherContract.WeatherEntry;

public class DetailActivity extends ActionBarActivity {

    public static final String DATE_KEY = "forecast_date";
    private static final String LOCATION_KEY = "location";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new DetailFragment())
                    .commit();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();
        //if (id == R.id.action_settings) {
        //   startActivity(new Intent(this, SettingsActivity.class));
        //    return true;
        //} else if(id == R.id.homeAsUp) {
        //    Toast.makeText(this,"homeasup",Toast.LENGTH_SHORT).show();
        //    //finish();
        //} else if(id == R.id.home){
        //    Toast.makeText(this,"home",Toast.LENGTH_SHORT).show();
        //}
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}