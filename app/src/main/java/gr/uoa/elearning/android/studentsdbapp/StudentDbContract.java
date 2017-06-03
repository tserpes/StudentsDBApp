package gr.uoa.elearning.android.studentsdbapp;

/**
 * Created by tserpes on 08/03/17.
 */

public class StudentDbContract {
    public static final String AUTHORITY = "students_db";
    public static final String PATH = "students";
    public static final String CONTENT_URI = "content://"+StudentDbContract.AUTHORITY+"/"+StudentDbContract.PATH+"/";

    public static final String DB_NAME = "STUDENTS_DB";
    public static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "STUDENTS";
    public static final String KEY_ID = "_ID";
    public static final String KEY_FNAME = "FIRST_NAME";
    public static final String KEY_LNAME = "LAST_NAME";
    public static final String KEY_EYEAR = "ENTRY_YEAR";
    public static final String CREATE_QUERY = "CREATE TABLE "+TABLE_NAME+" (" +
            KEY_ID+" INT PRIMARY KEY NOT NULL," +
            KEY_FNAME+" VARCHAR(20) NOT NULL," +
            KEY_LNAME+" VARCHAR(20) NOT NULL," +
            KEY_EYEAR+" INT NOT NULL" +
            ");";

    public StudentDbContract(){

    }
}
