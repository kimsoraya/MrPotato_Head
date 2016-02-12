package com.example.kimschuiten.mrpotatohead;

import android.opengl.Visibility;
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
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

/*    CheckBox showArms;
    CheckBox showEars;
    CheckBox showEyebrows;
    CheckBox showEyes;
    CheckBox showGlasses;
    CheckBox showHat;
    CheckBox showMouth;
    CheckBox showMustache;
    CheckBox showNose;
    CheckBox showShoes;*/
    ImageView ImArms;
    ImageView ImEars;
    ImageView ImEyebrows;
    ImageView ImEyes;
    ImageView ImGlasses;
    ImageView ImHat;
    ImageView ImMouth;
    ImageView ImMustache;
    ImageView ImNose;
    ImageView ImShoes;

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
        /*showArms = (CheckBox) findViewById(R.id.checkBox1);
        showEars = (CheckBox) findViewById(R.id.checkBox2);
        showEyebrows = (CheckBox) findViewById(R.id.checkBox3);
        showEyes = (CheckBox) findViewById(R.id.checkBox4);
        showGlasses = (CheckBox) findViewById(R.id.checkBox5);
        showHat = (CheckBox) findViewById(R.id.checkBox6);
        showMouth = (CheckBox) findViewById(R.id.checkBox7);
        showMustache = (CheckBox) findViewById(R.id.checkBox8);
        showNose = (CheckBox) findViewById(R.id.checkBox9);
        showShoes = (CheckBox) findViewById(R.id.checkBox10);*/
        ImArms = (ImageView) findViewById(R.id.arms);
        ImEars = (ImageView) findViewById(R.id.ears);
        ImEyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImEyes = (ImageView) findViewById(R.id.eyes);
        ImGlasses = (ImageView) findViewById(R.id.glasses);
        ImHat = (ImageView) findViewById(R.id.hat);
        ImMouth = (ImageView) findViewById(R.id.mouth);
        ImMustache = (ImageView) findViewById(R.id.mustache);
        ImNose = (ImageView) findViewById(R.id.nose);
        ImShoes = (ImageView) findViewById(R.id.shoes);


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

    public void OnCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked)
                    // show arms
                    ImArms.setVisibility(View.VISIBLE);
                else
                    // Keep arms invisible
                    ImArms.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox2:
                if (checked)
                    // show Ears
                    ImEars.setVisibility(View.VISIBLE);
                else
                    // Remove ears
                    ImEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox3:
                if (checked)
                    ImEyebrows.setVisibility(View.VISIBLE);
                else
                    ImEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox4:
                if (checked)
                    ImEyes.setVisibility(View.VISIBLE);
                else
                    ImEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox5:
                if (checked)
                    ImGlasses.setVisibility(View.VISIBLE);
                else
                    ImGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox6:
                if (checked)
                    ImHat.setVisibility(View.VISIBLE);
                else
                    ImHat.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox7:
                if (checked)
                    ImMouth.setVisibility(View.VISIBLE);
                else
                    ImMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox8:
                if (checked)
                    ImMustache.setVisibility(View.VISIBLE);
                else
                    ImMustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox9:
                if (checked)
                    ImNose.setVisibility(View.VISIBLE);
                else
                    ImNose.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox10:
                if (checked)
                    ImShoes.setVisibility(View.VISIBLE);
                else
                    ImShoes.setVisibility(View.INVISIBLE);
                break;

        }
    }

}
