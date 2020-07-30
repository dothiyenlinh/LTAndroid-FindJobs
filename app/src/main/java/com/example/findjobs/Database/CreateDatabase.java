package com.example.findjobs.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateDatabase extends SQLiteOpenHelper {

    public static String TB_ADMIN = "ADMIN";
    public static String TB_COMPANY = "COMPANY";
    public static String TB_JOBSEEKER = "JOBSEEKER";
    public static String TB_EMPLOYMENTPROFILE = "EMPLOYMENTPROFILE";
    public static String TB_LISTWORK = "LISTWORK";
    public static String TB_COST = "COST";
    public static String TB_RESULT = "RESULT";
    public static String TB_POST = "POST";

    public static String TB_ADMIN_Idadmin = "Idadmin";
    public static String TB_ADMIN_Username = "Username";
    public static String TB_ADMIN_Password = "Password";
    public static String TB_ADMIN_Fullname = "Fullname";

    public static String TB_COMPANY_Idcom = "Idcom";
    public static String TB_COMPANY_Username = "Username";
    public static String TB_COMPANY_Password = "Password";
    public static String TB_COMPANY_Companyname = "Companyname";
    public static String TB_COMPANY_Address = "Address";
    public static String TB_COMPANY_Email = "Email";
    public static String TB_COMPANY_Phone = "Phone";
    public static String TB_COMPANY_Descripcom = "Descripcom";

    public static String TB_JOBSEEKER_Idjs = "Idcom";
    public static String TB_JOBSEEKER_Username = "Username";
    public static String TB_JOBSEEKER_Password = "Password";
    public static String TB_JOBSEEKER_Fullname = "Fullname";
    public static String TB_JOBSEEKER_Address = "Address";
    public static String TB_JOBSEEKER_Email = "Email";
    public static String TB_JOBSEEKER_Phone = "Phone";

    public static String TB_EMPLOYMENTPROFILE_Id = "Id";
    public static String TB_EMPLOYMENTPROFILE_Level = "Level";
    public static String TB_EMPLOYMENTPROFILE_Yeardofexperienc = "Yeardofexperienc";
    public static String TB_EMPLOYMENTPROFILE_Desirediob = "IdDesirediobd";
    public static String TB_EMPLOYMENTPROFILE_Salary = "Salary";
    public static String TB_EMPLOYMENTPROFILE_Date = "Date";
    public static String TB_EMPLOYMENTPROFILE_Idjs = "Idjs";

    public static String TB_LISTWORK_Idlw = "Idlw";
    public static String TB_LISTWORK_Workname = "Workname";
    public static String TB_LISTWORK_Idcom = "Idcom";
    public static String TB_LISTWORK_Salary = "Salary";
    public static String TB_LISTWORK_Describe = "Describe";

    public static String TB_COST_Idcost = "Idcost";
    public static String TB_COST_Idcom = "Idcom";
    public static String TB_COST_Date = "Date";
    public static String TB_COST_Status = "Status";
    public static String TB_COST_Money = "Money";


    public static String TB_RESULT_Idcom = "Idcom";
    public static String TB_RESULT_Idjs = "Idjs";
    public static String TB_RESULT_Date = "Date";

    public static String TB_POST_Idpost = "Idcom";
    public static String TB_POST_Idcom = "Idjs";
    public static String TB_POST_Workplace = "Workplace";
    public static String TB_POST_Jobposition = "Jobposition";
    public static String TB_POST_Contracttype = "Contracttype";
    public static String TB_POST_Decription = "Decription";
    public static String TB_POST_Salary = "Salary ";
    public static String TB_POST_Yearsofexperience = "Yearsofexperience";

    public CreateDatabase(Context context) {
        super(context, "FindJob.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbADMIN = "CREATE TABLE IF NOT EXISTS " + TB_ADMIN + " ( " + TB_ADMIN_Idadmin + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_ADMIN_Username + " TEXT, " + TB_ADMIN_Password + " TEXT, " + TB_ADMIN_Fullname + " TEXT )";

        String tbCOMPANY = "CREATE TABLE IF NOT EXISTS " + TB_COMPANY + " ( " + TB_COMPANY_Idcom + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_COMPANY_Username + " TEXT, " + TB_COMPANY_Password + " TEXT, " + TB_COMPANY_Companyname + " TEXT, " + TB_COMPANY_Address + " TEXT, "
                + TB_COMPANY_Email + " TEXT, " + TB_COMPANY_Phone + " TEXT," + TB_COMPANY_Descripcom + " TEXT)";
        db.execSQL("DROP TABLE IF EXISTS " + TB_JOBSEEKER +"");
        String tbJOBSEEKER = "CREATE TABLE IF NOT EXISTS " + TB_JOBSEEKER + " ( " + TB_JOBSEEKER_Idjs + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_JOBSEEKER_Username + " TEXT, " + TB_JOBSEEKER_Password + " TEXT, " + TB_JOBSEEKER_Fullname + " TEXT, " + TB_JOBSEEKER_Address + " TEXT, "
                + TB_JOBSEEKER_Email + " TEXT, " + TB_JOBSEEKER_Phone + " INTEGER)";

        String tbEMPLOYMENTPROFILE = "CREATE TABLE IF NOT EXISTS " + TB_EMPLOYMENTPROFILE + " (  " + TB_EMPLOYMENTPROFILE_Id + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_EMPLOYMENTPROFILE_Level + " TEXT, " + TB_EMPLOYMENTPROFILE_Yeardofexperienc + "  INTEGER, " + TB_EMPLOYMENTPROFILE_Desirediob + " TEXT, " + TB_EMPLOYMENTPROFILE_Salary + " TEXT, "
                + TB_EMPLOYMENTPROFILE_Date + " TEXT, " + TB_EMPLOYMENTPROFILE_Idjs + " INTEGER )";

        String tbLISTWORK = "CREATE TABLE IF NOT EXISTS " + TB_LISTWORK + " ( " + TB_LISTWORK_Idlw + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_LISTWORK_Workname + " TEXT, " + TB_LISTWORK_Salary + " TEXT, " + TB_LISTWORK_Describe + " TEXT, " +
                TB_LISTWORK_Idcom + " INTEGER )";

        String tbCOST = "CREATE TABLE IF NOT EXISTS " + TB_COST + " ( " + TB_COST_Idcost + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_COST_Date + " TEXT, " + TB_COST_Status + " TEXT, " + TB_COST_Money + " INTEGER, " + TB_COST_Idcom + " INTEGER  )";

//        String tbRESULT = "CREATE TABLE " + TB_RESULT + " (  " + TB_RESULT_Date + " TEXT, " +
////                "PRIMARY KEY ( " + TB_RESULT_Idcom + "," + TB_RESULT_Idjs + " ))";

        String tbPOST = "CREATE TABLE IF NOT EXISTS " + TB_POST + " (  " + TB_POST_Idcom + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + TB_POST_Idpost + " INTEGER, " + TB_POST_Contracttype + " TEXT, " + TB_POST_Jobposition + " TEXT, "
                + TB_POST_Decription + " TEXT," + TB_POST_Workplace + " TEXT," + TB_POST_Salary + " INTEGER, "
                + TB_POST_Yearsofexperience + " INTEGER)";

        db.execSQL(tbADMIN);
        db.execSQL(tbCOMPANY);
        db.execSQL(tbJOBSEEKER);
        db.execSQL(tbEMPLOYMENTPROFILE);
        db.execSQL(tbLISTWORK);
        db.execSQL(tbCOST);
//        db.execSQL(tbRESULT);
        db.execSQL(tbPOST);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public SQLiteDatabase open(){
        return this.getWritableDatabase();
    }
}
