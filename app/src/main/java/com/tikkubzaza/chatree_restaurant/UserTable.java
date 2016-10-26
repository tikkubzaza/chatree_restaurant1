package com.tikkubzaza.chatree_restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pc on 19/10/2559.
 */
public class UserTable {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqliteDatabase, readSqLiteDatabase;

    public static final String USER_TABLE = "userTABLE";
    public static final String COLUMN_ID_USER = "_id";
    public static final String COLUMN_USER = "User";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_NAME = "Name";

    public UserTable(Context context){
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
