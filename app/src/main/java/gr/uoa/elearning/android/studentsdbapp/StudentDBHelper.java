package gr.uoa.elearning.android.studentsdbapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tserpes on 02/03/17.
 */

public class StudentDBHelper extends SQLiteOpenHelper {

    public StudentDBHelper(Context context) {
        super(context, StudentDbContract.DB_NAME, null, StudentDbContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(StudentDbContract.CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
