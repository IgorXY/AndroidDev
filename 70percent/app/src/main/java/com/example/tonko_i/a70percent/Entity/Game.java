package com.example.tonko_i.a70percent.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by User on 16.04.2017.
 */

public class Game implements Serializable {
    private int id;
    private Date start_date;
    private Date end_date;
    private  int stage_amount;
    private ArrayList<Task> taskList;
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getStage_amount() {
        return stage_amount;
    }

    public void setStage_amount(int stage_amount) {
        this.stage_amount = stage_amount;
    }





}
