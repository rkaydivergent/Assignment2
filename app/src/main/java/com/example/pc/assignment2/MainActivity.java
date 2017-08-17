package com.example.pc.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public	static	final	int	TEXT_REQUEST	=	1;
    TextView txt1, txt2, txt3,txt4,txt5,txt6,txt7,txt8,txt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= (TextView)findViewById(R.id.txt1) ;
        txt2= (TextView)findViewById(R.id.txt2) ;
        txt3= (TextView)findViewById(R.id.txt3) ;
        txt4= (TextView)findViewById(R.id.txt4) ;
        txt5= (TextView)findViewById(R.id.txt5) ;
        txt6= (TextView)findViewById(R.id.txt6) ;
        txt7= (TextView)findViewById(R.id.txt7) ;
        txt8= (TextView)findViewById(R.id.txt8) ;
        txt9= (TextView)findViewById(R.id.txt9) ;

        if (savedInstanceState != null) {
            String mySavedV1 = savedInstanceState.getString("mySavedValue1");
            txt1.setText(mySavedV1);
            String mySavedV2 = savedInstanceState.getString("mySavedValue2");
            txt2.setText(mySavedV2);
            String mySavedV3 = savedInstanceState.getString("mySavedValue3");
            txt3.setText(mySavedV3);
            String mySavedV4 = savedInstanceState.getString("mySavedValue4");
            txt4.setText(mySavedV4);
            String mySavedV5 = savedInstanceState.getString("mySavedValue5");
            txt5.setText(mySavedV5);
            String mySavedV6 = savedInstanceState.getString("mySavedValue6");
            txt6.setText(mySavedV6);
            String mySavedV7 = savedInstanceState.getString("mySavedValue7");
            txt7.setText(mySavedV7);
            String mySavedV8 = savedInstanceState.getString("mySavedValue8");
            txt8.setText(mySavedV8);
            String mySavedV9 = savedInstanceState.getString("mySavedValue9");
            txt9.setText(mySavedV9);
        }
    }

    public void selectItems (View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if	(requestCode	==	TEXT_REQUEST)	{
            if	(resultCode	==	RESULT_OK)	{
                String	reply	=
                        data.getStringExtra(Main2Activity.EXTRA_REPLY);
                if (txt1.getText().toString().equals("")){txt1.setText(reply);}
                else if (txt2.getText().toString().equals("")){txt2.setText(reply);}
                else if (txt3.getText().toString().equals("")){txt3.setText(reply);}
                else if (txt4.getText().toString().equals("")){txt4.setText(reply);}
                else if (txt5.getText().toString().equals("")){txt5.setText(reply);}
                else if (txt6.getText().toString().equals("")){txt6.setText(reply);}
                else if (txt7.getText().toString().equals("")){txt7.setText(reply);}
                else if (txt8.getText().toString().equals("")){txt8.setText(reply);}
                else if (txt9.getText().toString().equals("")){txt9.setText(reply);}
              else{
                    Toast.makeText(this, "Your List is full", Toast.LENGTH_SHORT).show();}
            }
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mySavedValue1", txt1.getText().toString());
        outState.putString("mySavedValue2", txt2.getText().toString());
        outState.putString("mySavedValue3", txt3.getText().toString());
        outState.putString("mySavedValue4", txt4.getText().toString());
        outState.putString("mySavedValue5", txt5.getText().toString());
        outState.putString("mySavedValue6", txt6.getText().toString());
        outState.putString("mySavedValue7", txt7.getText().toString());
        outState.putString("mySavedValue8", txt8.getText().toString());
        outState.putString("mySavedValue9", txt9.getText().toString());
    }
}