package sg.edu.rp.c346.id21037164.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnConfirm;
    RadioButton smoke;
    RadioButton nonsmoke;
    EditText fname;
    EditText lname;
    EditText number;
    EditText size;
    Button reset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp =findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnConfirm = findViewById(R.id.btnConfirm);
        smoke = findViewById(R.id.table_smoke);
        nonsmoke = findViewById(R.id.notable_smoke);
        fname = findViewById(R.id.first_name);
        lname = findViewById(R.id.last_name);
        number = findViewById(R.id.phone_number);
        size = findViewById(R.id.total_size);
        reset = findViewById(R.id.btnreset);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (fname.getText().toString().length() > 0 && lname.getText().toString().length() > 0) {
                        if (size.getText().toString().length() > 0) {
                            if (number.getText().toString().length() > 0  && number.getText().toString().length() == 8) {
                                if (nonsmoke.isChecked()) {
                                    int month = dp.getMonth() + 1;
                                    Toast.makeText(MainActivity.this, fname.getText() + " " + lname.getText() + " With the phone Number of: " + number.getText() + " made a registration on " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear() + " at the time of " + tp.getCurrentHour() + ":" + tp.getCurrentMinute() + " on the table with non-smokers with " + size.getText() + " people.", Toast.LENGTH_LONG).show();
                                } else if (smoke.isChecked()) {
                                    int month = dp.getMonth() + 1;
                                    Toast.makeText(MainActivity.this, fname.getText() + " " + lname.getText() + " With the phone Number of: " + number.getText() + " made a registration on " + dp.getDayOfMonth() + "/" + month + "/" + dp.getYear() + " at the time of " + tp.getCurrentHour() + ":" + tp.getCurrentMinute() + " on the table with smokers with " + size.getText() + " people.", Toast.LENGTH_LONG).show();


                                }

                            } else {

                                Toast.makeText(MainActivity.this, "Please enter a valid phone number ( 8 digits )", Toast.LENGTH_LONG).show();
                            }

                        } else {

                            Toast.makeText(MainActivity.this, "Please enter your details", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        Toast.makeText(MainActivity.this, "Please enter your details", Toast.LENGTH_LONG).show();
                    }
                }

            }
        }







            );reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);


                dp.updateDate(2020,5,01);
                ;}});}}