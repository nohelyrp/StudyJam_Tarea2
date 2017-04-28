package com.example.erzse.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView screen;
    String captura1 = "",captura2;
    int oper;
    boolean pun = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView)findViewById(R.id.screen);
        captura1=screen.getText().toString();
        screen.setText("");
    }

    public void numero (View view){
        captura1=screen.getText().toString();
        Button b= (Button)view;
        captura1+=b.getText();
        screen.setText(captura1);
    }

    public void punto (View view){
        if (pun == false)
        {
            captura1 = screen.getText().toString();
            screen.setText(captura1+".");
            pun=true;
        }
    }

    public void suma (View view){
        if ((screen.getText().toString()!="")){

            captura1 = screen.getText().toString();
            oper = 1;
            captura2 = captura1;
            screen.setText("");
        }
    }

    public void resta (View view){
        if ((screen.getText().toString()!="")){

            captura1 = screen.getText().toString();
            oper = 2;
            captura2 = captura1;
            screen.setText("");
        }
    }

    public void multiplicacion (View view){
        if ((screen.getText().toString()!="")){

            captura1 = screen.getText().toString();
            oper = 3;
            captura2 = captura1;
            screen.setText("");
        }
    }

    public void division (View view){
        if ((screen.getText().toString()!="")){

            captura1 = screen.getText().toString();
            oper = 4;
            captura2 = captura1;
            screen.setText("");
        }
    }

    public void porcentaje (View view){
        if ((screen.getText().toString()!="")){

            captura1 = screen.getText().toString();
            oper = 5;
            captura2 = captura1;
            screen.setText("");
        }
    }

    public void igual(View view){

        if (captura2 !=""&& screen.getText().toString()==""){
            screen.setText(""+captura2);
        }
        if (screen.getText().toString()!=""&&captura2!=""){
            double nume1, nume2, resul;
            nume1 = Double.parseDouble(captura2);
            nume2 = Double.parseDouble(screen.getText().toString());
            if (oper == 1){
                resul = nume1 + nume2;
                screen.setText("" + resul);
            }
            if (oper == 2){
                resul = nume1 - nume2;
                screen.setText("" + resul);
            }
            if (oper == 3){
                resul = nume1 * nume2;
                screen.setText("" + resul);
            }
            if (oper == 4){
                resul = nume1 / nume2;
                screen.setText("" + resul);
            }
            if (oper == 5){
                resul = nume1 * nume2 /100;
                screen.setText("" + resul);
            }
        }
    }
    public void  borrar1(View view){
        if (screen.getText().toString()!=""){
            screen.setText(screen.getText().toString().substring(0,screen.getText().length()-1));
        }
    }
    public void  btodo (View view){
        pun=false;
        screen.setText("");
        captura2="";
        captura1="";
    }
}
