package com.example.tonko_i.a70percent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.TimeUnit;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.tonko_i.a70percent.Entity.*;
import com.example.tonko_i.a70percent.R;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Game> gameList;

    private ArrayList<Task> GetTaskList(int gameID){
        //TODO: get task list from server
        ArrayList<Task> taskList = new ArrayList<Task>();
        Task task = new Task();

        task.setId(1);
        task.setDescription("Туда, не знаю куда");
        task.setLatitude(27.345435);
        task.setLongitude(52.344534);
        taskList.add(task);



        task = new Task();
        task.setId(2);
        task.setDescription("Сюда");
        task.setLatitude(27.345435);
        task.setLongitude(52.344534);
        taskList.add(task);

        task = new Task();
        task.setId(3);
        task.setDescription("В никуда");
        task.setLatitude(27.345435);
        task.setLongitude(52.344534);
        taskList.add(task);
        return taskList;
    }

    private ArrayList<Game> GetGameList(){
        //TODO: get game list from server

        ArrayList<Game> gameList = new ArrayList<Game>();
        Game game = new Game();
        game.setId(1);

        game.setTitle("Minsk1");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(1);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);

        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);

        //////////////////////////

        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk2");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);
        game = new Game();
        game.setId(2);

        game.setTitle("Minsk3");
        game.setStart_date( java.sql.Date.valueOf("2017-04-16"));
        game.setEnd_date(java.sql.Date.valueOf("2017-04-20"));
        game.setStage_amount(5);

        game.setTaskList(GetTaskList((game.getId())));

        gameList.add(game);

        return gameList;
    }

    private void InitializeActivity(){
        gameList = GetGameList();

      /*  TextView textView = (TextView) findViewById(R.id.startDateTextView);
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
            button.setEnabled(false);*/
        RelativeLayout rl = new RelativeLayout(this);
        ScrollView scroll = new ScrollView(this);
        HorizontalScrollView hscroll = new HorizontalScrollView(this);
        TableLayout table = new TableLayout(this);

       table.setStretchAllColumns(true);
       // table.setShrinkAllColumns(true);
        Date date = new Date();
        final Intent intent = new Intent(this, GameActivity.class);
        for (final Game game: gameList) {
            TableRow row = new TableRow(this);
            row.setPadding(50, 50, 50, 5);

            TextView title = new TextView(this);
            title.setText(game.getTitle());

            TextView start = new TextView(this);
            start.setText(game.getStart_date().toString());

            TextView end = new TextView(this);
            end.setText(game.getEnd_date().toString());

            Button button = new Button(this);
            button.setText("Начать");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    GameProgress gameProgress = new GameProgress();
                    gameProgress.setGame(game);
                    gameProgress.setStage(1);


                    intent.putExtra("GameProgress", gameProgress);
                    startActivity(intent);
                }
            });
         //   button.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
            if ((date.after(game.getStart_date()) || date.equals(game.getStart_date())) && date.before(game.getEnd_date())){
                button.setEnabled(true);
            }
            else
                button.setEnabled(false);

            row.addView(title);
            row.addView(start);
            row.addView(end);
            row.addView(button);

            table.addView(row);


        }
        hscroll.addView(table);
        scroll.addView(hscroll);
        rl.addView(scroll);
        setContentView(rl);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        InitializeActivity();
    }

    public void GameActivityButtonClick(View view){

    }
}

