package davidfdez.appp2ifinal.activity;

/**
 * Created by David on 12/05/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class AdminSQLiteOpenHelper  extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table User (id text Primary Key, password text,language text)");
        db.execSQL("create table Mesure (idMesure text Primary Key, FOREIGN KEY(idUser) REFERENCES User(id), CO2messure INTEGER, Luminosite INTEGER, latitude Double, longitude double, Temperature INTEGER, DateTime DATETIME");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
