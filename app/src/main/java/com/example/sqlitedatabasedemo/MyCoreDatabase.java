package com.example.sqlitedatabasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyCoreDatabase extends SQLiteOpenHelper {

    static final private String DB_NAME = "Education";
    static final private String DB_TABLE = "students";
    static final private int DB_VER = 1;

    Context ctx;
    SQLiteDatabase myDb;

    public MyCoreDatabase(Context ct) {
        super(ct, DB_NAME, null, DB_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
