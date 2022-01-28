package com.example.gkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class geo extends AppCompatActivity {
private String[] gquestions = {"Latitude is measured east and west of the prime meridian.",
        "A cape is a point of land extending into a body of water",
        "The Antarctic Circle is located south of the equator",
        ". A star on a map usually denotes a national capital.",
        ". Lines of longitude are measured north and south of the equator.",
        "When you cross the prime meridian the date becomes either one day earlier or one day later.",
        ". Earth's oceans are the Pacific, Atlantic, Indian, and Arctic.",
        ". An area of land extending into a body of water and almost surrounded by water is a peninsula.",
        "The Tropic of Cancer is located in the northen hemisphere" };
private boolean[] answers = {false,true,true,false,false,false,true,false,true ,true};
private int score = 0;
Button yes;
Button no;
TextView gquestion;
private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        yes = findViewById(R.id.gyes);
        no = findViewById(R.id.gno);
        gquestion = findViewById(R.id.gquestion);
        gquestion.setText(gquestions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index<=gquestions.length-1){
                    if (answers[index]){
                        score++;
                    }
                    index++;
                    if (index<=gquestions.length-1){
                        gquestion.setText(gquestions[index]);
                    }
                    else{
                        Toast.makeText(geo.this, "Your score is" + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(geo.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //TO AVOID CRASH as array goes out of bounds
                if (index<=gquestions.length-1){
                    if (!answers[index]){
                        score++;
                    }
                    index++;
                    if (index<=gquestions.length-1){
                        gquestion.setText(gquestions[index]);
                    }
                    else{
                        Toast.makeText(geo.this, "Your score is" + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(geo.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}