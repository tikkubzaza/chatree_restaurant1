package com.tikkubzaza.chatree_restaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pc on 19/10/2559.
 */
public class FoodTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqliteDatabase, readSqLiteDatabase;

    public static final String FOOD_TABLE = "FoodTABLE";
    public static final String COLUMN_ID_FOOD = "_id";
    public static final String COLUMN_FOOD = "Food";
    public static final String COLUMN_SOURCE = "Source";
    public static final String COLUMN_PRICE = "Price";

        public FoodTABLE(Context context){
            objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
            writeSqliteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
            readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
        }
    public long addNewFood(String strFood,String strSource, String strPrice){
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_FOOD,strFood);
        objContentValues.put(COLUMN_SOURCE,strSource);
        objContentValues.put(COLUMN_PRICE,strPrice);
        return readSqLiteDatabase.insert(FOOD_TABLE,null,objContentValues);
    } //add newfood
}
