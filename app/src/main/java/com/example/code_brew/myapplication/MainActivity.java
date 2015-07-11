package com.example.code_brew.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import webservice.api.RestClient;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @InjectView(R.id.txtName)
    TextView name;
    @InjectView(R.id.btnClick)
    Button click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

        click.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();

        switch (v.getId()) {

            case R.id.btnClick:
                getFields();
        }
    }

    private void getFields() {


        RestClient.get().getWeather("California", new Callback<WeatherResponce>() {
            @Override
            public void success(WeatherResponce weatherResponce, Response response) {
                // success!


                Log.i("App", weatherResponce.getBase());

                name.setText(weatherResponce.getBase());


                Log.i("App", "" + weatherResponce.getMain().getDescription());


                Log.i("App", "" + weatherResponce.getCod());
                // you get the point...
            }

            @Override
            public void failure(RetrofitError error) {

                Log.e("Error", error + "");
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
