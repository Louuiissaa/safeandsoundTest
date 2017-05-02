package com.safeandsound.app.safeandsoundtest.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.safeandsound.app.safeandsoundtest.R;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    private DatabaseReference mDatabase;

    private Button btnAddSensor;

    String type;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Add Sensor button
        btnAddSensor = (Button) findViewById(R.id.btn_addSensor);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();

        //Get Firebase Database instance
        mDatabase = FirebaseDatabase.getInstance().getReference();

        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }

        btnAddSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set components for view to get user input
                final LinearLayout ll = new LinearLayout(MainActivity.this);
                ll.setOrientation(LinearLayout.VERTICAL);
                ll.setPadding(50, 50, 50, 50);

                LayoutInflater lii = LayoutInflater.from(MainActivity.this);
                LinearLayout ll2 = (LinearLayout) lii.inflate(R.layout.addsensor, null);
                ll.addView(ll2);

                final Spinner spinner = (Spinner) ll2.findViewById(R.id.sensorTypeSpinner);

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String selectedType = spinner.getSelectedItem().toString();
                            if(selectedType.equals("Camera")){

                            }else if(selectedType.equals("DHT")) {
                                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                                LinearLayout ll2 = (LinearLayout) li.inflate(R.layout.sensor_dht, null);
                                ll.addView(ll2);
                            }else if(selectedType.equals("DS18B20")) {
                                //Set TextView sensor type
                                TextView tvSensorTopic = new TextView(MainActivity.this);
                                tvSensorTopic.setPadding(0, 30, 0, 0);
                                tvSensorTopic.setText(getApplicationContext().getResources().getString(R.string.sensorTopic));

                                //Set EditText Name
                                final EditText inputSensorTopic = new EditText(MainActivity.this);

                                ll.addView(tvSensorTopic);
                                ll.addView(inputSensorTopic);
                            }else if(selectedType.equals("BMP180")) {
                            }else if(selectedType.equals("MQ-?")) {
                            }else if(selectedType.equals("SRF")) {
                                //Set TextView sensor type
                                TextView tvPin1 = new TextView(MainActivity.this);
                                tvPin1.setText(getApplicationContext().getResources().getString(R.string.sensorPin1));

                                //Set EditText Name
                                final EditText inputPin1 = new EditText(MainActivity.this);
                                inputPin1.setInputType(InputType.TYPE_CLASS_NUMBER);

                                //Set TextView sensor type
                                TextView tvPin2 = new TextView(MainActivity.this);
                                tvPin2.setPadding(0, 30, 0, 0);
                                tvPin2.setText(getApplicationContext().getResources().getString(R.string.sensorPin2));
                                //Set EditText Name
                                final EditText inputPin2 = new EditText(MainActivity.this);
                                inputPin2.setInputType(InputType.TYPE_CLASS_NUMBER);
                            }else if(selectedType.equals("Magnetsensor")) {
                            }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Add a new sensor");
                dialog.setView(ll);
                dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                //type = spinner.getSelectedItem().toString();
                                //name = inputName.getText().toString();
                                addSensor(type, name);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                // Do nothing.
                            }
                        }).show();
            }
        });
    }

    protected void addSensor(String type, String name){
       //Sensor sensor = new Sensor(type, name);
       // mDatabase.child("sensors").child(sensorId).setValue(sensor);


    }
}
