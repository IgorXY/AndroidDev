package com.example.tonko_i.a70percent;
import android.view.View;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.TimeUnit;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tonko_i.a70percent.Entity.*;
import com.example.tonko_i.a70percent.R;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Game curGame;

    private ArrayList<Task> GetTaskList(int gameID){
        //TODO: get task list from server
        Task task = new Task();
        task.setId(1);
        task.setDescription("Туда, не знаю куда");
        task.setLatitude(27.345435);
        task.setLongitude(52.344534);

        ArrayList<Task> taskList = new ArrayList<Task>();
        taskList.add(task);

        return taskList;
    }

    private Game GetCurrentGame(){
        //TODO: get game from server
        Game game = new Game();
        game.setId(1);

        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-18"));
        game.setStage_amount(1);

        game.setTaskList(GetTaskList((game.getId())));

        return game;
    }

    private void InitializeActivity(){
        curGame = GetCurrentGame();

        TextView textView = (TextView) findViewById(R.id.startDateTextView);
        textView.setText(textView.getText() + " " +curGame.getStart_date().toString());
        textView = (TextView) findViewById(R.id.endDateTextView);
        textView.setText(textView.getText() + "   " +curGame.getEnd_date().toString());
        textView = (TextView) findViewById(R.id.StageAmountTextView);
        textView.setText(textView.getText() + " " +curGame.getStage_amount());

        Date date = new Date();
        Button button = (Button) findViewById(R.id.StartGameButton);
        if ((date.after(curGame.getStart_date()) || date.equals(curGame.getStart_date())) && date.before(curGame.getEnd_date())){
            button.setEnabled(true);
        }
        else
            button.setEnabled(false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializeActivity();
    }

    public void GameActivityButtonClick(View view){
        GameProgress gameProgress = new GameProgress();
        gameProgress.setGame(curGame);
        gameProgress.setStage(1);

        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("GameProgress", gameProgress);
        startActivity(intent);
    }
}

