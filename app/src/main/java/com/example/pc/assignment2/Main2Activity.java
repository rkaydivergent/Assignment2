package com.example.pc.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public	static	final	String	EXTRA_REPLY= "com.example.pc..assignment2.extra.REPLY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void btnClick(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();

        Intent replyIntent	=	new	Intent(this, MainActivity.class);
        replyIntent.putExtra(EXTRA_REPLY,	buttonText);
        setResult(RESULT_OK,	replyIntent);
        finish();
    }
}
