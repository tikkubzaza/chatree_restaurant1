package com.tikkubzaza.chatree_restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private UserTable objUserTABLE;
    private FoodTABLE objFoodTABLE;
    private OrderTable objOrderTABLE;
    private MySQLite mySQLite:

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //conntct sqlite
        connectedSQLite();
        //test add value
        testAddValue();

        //request sqlite
        mySQLite = new MySQLite(this);
    }


        private void testAddValue(){
            objUserTABLE.addnewUser("testUser","testPass","testName";)
            objFoodTABLE.addNewFood("testFood","testSource","testPrice")
            objOrderTABLE.ADDoRDER("testOfficer","testDesk"."testFood","testItem"):
        } //test addvalue
    private void connectedSQLite(){
        objUserTABLE = new UserTable(this);
        objFoodTABLE = new FoodTABLE(this);
        objOrderTABLE = new OrderTable(this);
    }
}
