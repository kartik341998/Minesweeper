package com.example.kartik.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout rootLayout;

    public int SIZE = 5;
    public ArrayList<LinearLayout> rows = new ArrayList<>();
    public tbutton[][] board = new tbutton[SIZE][SIZE];
    Random r=new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.rootLayout);

        setupBoard();
    }
    public void setupBoard() {

        rows = new ArrayList<>();
        board = new tbutton[SIZE][SIZE];
        rootLayout.removeAllViews();

        for (int i = 0; i < SIZE; i++) {

            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            LinearLayout.LayoutParams layoutParams =
                    new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 0, 1);
            linearLayout.setLayoutParams(layoutParams);

            rootLayout.addView(linearLayout);
            rows.add(linearLayout);
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tbutton button = new tbutton(this);
                LinearLayout.LayoutParams layoutParams =
                        new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
                button.setLayoutParams(layoutParams);
                button.setOnClickListener(this);
                LinearLayout row = rows.get(i);
                row.addView(button);
                board[i][j] = button;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.resetItem){
            setupBoard();
        }else if(id == R.id.e){
            SIZE = 5;
            setupBoard();
        }
        else if(id == R.id.m){
            SIZE = 8;
            setupBoard();
        }
        else if(id == R.id.d){
            SIZE = 10;
            setupBoard();
        }


        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View view) {
        setMines();

    }
    public void setMines()
    {
        for(int i=0;i<SIZE;i++)
        { for(int j=0;j<SIZE;j++)
        {

        }

        }
    }
}

