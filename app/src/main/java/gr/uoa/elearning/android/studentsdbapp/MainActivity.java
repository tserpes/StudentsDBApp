package gr.uoa.elearning.android.studentsdbapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        StudentDBHelper helper = new StudentDBHelper(this);
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(StudentDBHelper.KEY_ID,12345);
        values.put(StudentDBHelper.KEY_FNAME,"John");
        values.put(StudentDBHelper.KEY_LNAME,"Doe");
        values.put(StudentDBHelper.KEY_EYEAR,2017);
        database.insert(StudentDBHelper.TABLE_NAME,null,values);
        database.close();
        database = helper.getReadableDatabase();
        String[] columns = {StudentDBHelper.KEY_FNAME,StudentDBHelper.KEY_LNAME};
        String selection = StudentDBHelper.KEY_ID+"=? AND "+StudentDBHelper.KEY_EYEAR+"=?";
        String[] selectionArgs = {"12345","2017"};
        Cursor cursor = database.query(StudentDBHelper.TABLE_NAME,columns,selection,selectionArgs,null,null,null);
        if (cursor.moveToFirst()){
            do{
                Toast.makeText(this,cursor.getString(1),Toast.LENGTH_LONG).show();
            }while(cursor.moveToNext());
        }*/

    }
}
