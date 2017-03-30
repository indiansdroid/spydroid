package xyz.lokender.spyapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contacts extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);



        Intent intent=getIntent();
        String messageText = intent.getStringExtra("message");
        TextView messageView = (TextView) findViewById(R.id.contacts);
        messageView.setText(messageText);



        Button btn=(Button) findViewById(R.id.view);
        btn.setOnClickListener( this );

    }


    public void onClick(View v){
        TextView messageView = (TextView) findViewById(R.id.contacts);
        messageView.setText("messageText");

    }
}
