package com.zencher.helloapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private final Combination combination = new Combination();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int value1 = combination.factorial(5);
//        int value2 = combination.factorial(3);
//        int value3 = combination.factorial(2);

        int result = combination.chooseRFromN(6,49);
        Log.v("console",result*50+"");

        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("click", "clicked");
                EditText rInput = (EditText) findViewById(R.id.editText);
                int valueR = Integer.valueOf(rInput.getText().toString());
                EditText nInput = (EditText) findViewById(R.id.editText2);
                int valueN = Integer.valueOf(nInput.getText().toString());

                int combinations = combination.chooseRFromN(valueR,valueN);

                TextView resultView = (TextView) findViewById(R.id.textView5);
                Integer cost = 50*combinations;
                resultView.setText(cost.toString());


//                TextView text = (TextView)findViewById(R.id.textView);
//                text.setText("Changed");

//                Button button = (Button) findViewById(R.id.button);
//                TextView resultText = new TextView(MainActivity.this);
//
//                RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//                params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
//                params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
//                params.addRule(RelativeLayout.BELOW, button.getId() );
//
//                RelativeLayout layoutView = (RelativeLayout) findViewById(R.id.container);
//                resultText.setLayoutParams(params);
//                layoutView.addView(resultText);
//
//                resultText.setText("New Text");


            }
        });
    }
//    private int factorial(int n) {
//        return combination.factorial(n);
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
