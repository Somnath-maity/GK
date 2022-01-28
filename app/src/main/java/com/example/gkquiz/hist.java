package com.example.gkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hist extends AppCompatActivity {
    private String[] hquestions = {"Delhi was the first capital of India.",
            "Netaji Subhash Chandra bose was born in West Bengal.",
             "Indira Gandhi was labelled as IRON LADY",
            "Bhagat Singh was the youngest freedom fighter ",
            "Before the advent of east India company, the rural life was simple and self sufficient.",
            "The british wanted to smuggle and sell opium in Spain to earn profit." };
    private boolean[] hanswers = {false,false,true,false,true,false};
    private int hscore = 0;
    Button hyes;
    Button hno;
    TextView hquestion;
    private int hindex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist);
        hyes = findViewById(R.id.hyes);
        hno = findViewById(R.id.hno);
        hquestion = findViewById(R.id.hquestion);
        hquestion.setText(hquestions[hindex]);
        hyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hindex<=hquestions.length-1){
                    if (hanswers[hindex]){
                        hscore++;
                    }
                    hindex++;
                    if (hindex<=hquestions.length-1){
                        hquestion.setText(hquestions[hindex]);
                    }
                    else{
                        Toast.makeText(hist.this, "Your score is" + hscore, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(hist.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        hno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO AVOID CRASH as array goes out of bounds
                if (hindex<=hquestions.length-1){
                    if (!hanswers[hindex]){
                        hscore++;
                    }
                    hindex++;
                    if (hindex<=hquestions.length-1){
                        hquestion.setText(hquestions[hindex]);
                    }
                    else{
                        Toast.makeText(hist.this, "Your score is " + hscore, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(hist.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}