package com.tikkubzaza.chatree_restaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pc on 19/10/2559.
 */
public class OrderTable {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqliteDatabase, readSqLiteDatabase;

    public static final String ORDER_TABLE = "orderTABLE";
    public static final String COLUMN_ID_ORDER = "_id";
    public static final String COLUMN_OFFICER = "Officer";
    public static final String COLUMN_DESK = "desk";
    public static final String COLUMN_FOOD = "food";
    public static final String COLUMN_ITEM = "Item";

    public OrderTable(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqliteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }
    public long addOrder (String strOfficer, String strDesk, String strFood, String strItem){
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_OFFICER,strOfficer);
        objContentValues.put(COLUMN_DESK,strDesk);
        objContentValues.put(COLUMN_FOOD,strFood);
        objContentValues.put(COLUMN_ITEM,strItem);
        return readSqLiteDatabase.insert(ORDER_TABLE,null,objContentValues);
    }
}

