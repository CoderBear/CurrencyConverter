package com.currcon.sbsapps.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("info", "Button pressed");

        EditText editText=(EditText)findViewById(R.id.editText);

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        String amountInDollars = String.format("%2f", amountInDollarsDouble);

        Log.i("info", editText.getText().toString());

//        editText.setText(amountInDollars);
        Toast.makeText(this,"£"+amountInPounds+" is $"+amountInDollars, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
