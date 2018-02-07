package com.caseta.roger.mymanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.net.*;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button button = (Button) findViewById(R.id.button_url);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = (EditText) findViewById(R.id.textfield_url);
                TextView output = (TextView) findViewById(R.id.textView_response);


                    RestClient httpClient = new RestClient();
                    String response = httpClient.Download(input.getText().toString());

                    output.setText(response);

            }
        });
    }


}
