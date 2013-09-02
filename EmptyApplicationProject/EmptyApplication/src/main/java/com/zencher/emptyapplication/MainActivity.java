package com.zencher.emptyapplication;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button genButton = (Button)findViewById(R.id.button);

        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputBase = (EditText) findViewById(R.id.inputBase);
                EditText inputSelection = (EditText) findViewById(R.id.inputSelection);
                Combination com = new Combination();
                BigInteger result = com.fractorial(40);
                Integer base = new Integer(inputBase.getText().toString());
                Integer selection = new Integer(inputSelection.getText().toString());
                Log.v("Combination", base.toString());
                Log.v("Combination", selection.toString());
                result = com.chooseMFromN(selection,base);
                BigInteger cost = result.multiply(new BigInteger("50"));
//        TextView text = (TextView )findViewById(R.id.textView);
//        text.setText(result);
//
                Log.v("Combination", cost.toString());
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
