package com.example.plansito;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;


public class DBConnection extends SQLiteOpenHelper {
    final String CREATE_TASK_TABLE="CREATE TABLE tasks (id INTEGER PRIMARY KEY, name TEXT NOT NULL, description TEXT NOT NULL, due_date TEXT NOT NULL)";
    public static final String DB_FILE_NAME = "task_app.db" ;
    public static final int DB_VERSION = 1;

    public DBConnection(@Nullable Context context) {
        super(context, DB_FILE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TASK_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}

