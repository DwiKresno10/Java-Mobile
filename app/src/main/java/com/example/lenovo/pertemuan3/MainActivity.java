package com.example.lenovo.pertemuan3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNama , editNim ;
    TextView editHasil;
    Button button;
    CheckBox cb;

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        editNama = (EditText) findViewById(R.id.editNama);
        editNim = (EditText) findViewById(R.id.editNim);
        editHasil = (TextView) findViewById(R.id.textTampil);
        button = (Button) findViewById(R.id.buttonProses);
        cb = (CheckBox) findViewById(R.id.checkBox);
        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
    }
    protected void onClick(View view){
        String nama, nim, status=null;
        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        if(cb.isChecked()){
            status="J O N E S";
        }else{
            status="L E H  U G A";
        }
        editHasil.setText(nama+" "+nim+" "+status);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.blue: if (checked) {
                relativeLayout.setBackgroundColor(Color.BLUE);
            } break;
            case R.id.red: if (checked){
                relativeLayout.setBackgroundColor(Color.RED);
            } break;
            case R.id.green: if (checked){
                relativeLayout.setBackgroundColor(Color.GREEN);
            } break;
            case R.id.yellow: if (checked){
                relativeLayout.setBackgroundColor(Color.YELLOW);
            } break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = cb.isChecked();
        if (checked)
            cb.setText("Masih Jomblo");
        else
            cb.setText("Sudah Punya");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
