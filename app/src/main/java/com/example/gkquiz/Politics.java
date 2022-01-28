package com.example.gkquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Politics extends AppCompatActivity {
    private String[] pquestions = {"Constitutional law designates government power, indicating what the government can and cannot do.",
            "The principle of fundamental fairness specifies what individuals can and cannot do and the punishments for wrongdoing.",
            "An act of omission is an accident and cannot be considered criminal.",
            "Establishing criminal intent is easy when someone has been harmed.",
            "Habeas corpus is in place to prohibit the imposition of punishment without trial.",
            "The exclusionary rule states that illegally seized evidence is excluded from a prosecution.",
            "The right to counsel is covered by the Eighth Amendment." };
    private boolean[] panswers = {true,false,false,false,false,true,false};
    private int pscore = 0;
    Button pyes;
    Button pno;
    TextView pquestion;
    private int pindex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);
        pyes = findViewById(R.id.pyes);
        pno = findViewById(R.id.pno);
        pquestion = findViewById(R.id.pquestion);
        pquestion.setText(pquestions[pindex]);
        pyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pindex<=pquestions.length-1){
                    if (panswers[pindex]){
                        pscore++;
                    }
                    pindex++;
                    if (pindex<=pquestions.length-1){
                        pquestion.setText(pquestions[pindex]);
                    }
                    else{
                        Toast.makeText(Politics.this, "Your score is " + pscore + "/" +pquestions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Politics.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        pno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO AVOID CRASH as array goes out of bounds
                if (pindex<=pquestions.length-1){
                    if (!panswers[pindex]){
                        pscore++;
                    }
                    pindex++;
                    if (pindex<=pquestions.length-1){
                        pquestion.setText(pquestions[pindex]);
                    }
                    else{
                        Toast.makeText(Politics.this, "Your score is " + pscore + "/" +pquestions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Politics.this, "Restart The Application Again to Start the quiz ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}