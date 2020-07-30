package com.example.findjobs.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.findjobs.DTO.JobSeekerDTO;
import com.example.findjobs.Database.CreateDatabase;

public class JobSeekerDAO {
    static SQLiteDatabase database;
    public   JobSeekerDAO( Context context)
    {
        CreateDatabase createDatabaser = new CreateDatabase(context);
        database = createDatabaser.open();
    }

    public long ThemNhanVien(JobSeekerDTO jobSeekerDTO) {
        ContentValues contentValues = new ContentValues();
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Idjs, jobSeekerDTO.getTB_JOBSEEKER_Idjs());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Fullname, jobSeekerDTO.getTB_JOBSEEKER_Fullname());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Address, jobSeekerDTO.getTB_JOBSEEKER_Address());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Username, jobSeekerDTO.getTB_JOBSEEKER_Username());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Password, jobSeekerDTO.getTB_JOBSEEKER_Password());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Email, jobSeekerDTO.getTB_JOBSEEKER_Email());
//        contentValues.put(CreateDatabase.TB_JOBSEEKER_Phone, jobSeekerDTO.getTB_JOBSEEKER_Phone());
        contentValues.put(CreateDatabase.TB_JOBSEEKER_Username, jobSeekerDTO.getUsername());
        contentValues.put(CreateDatabase.TB_JOBSEEKER_Password, jobSeekerDTO.getPassword());
        contentValues.put(CreateDatabase.TB_JOBSEEKER_Email, jobSeekerDTO.getEmail());
        contentValues.put(CreateDatabase.TB_JOBSEEKER_Phone, jobSeekerDTO.getPhone());
//        database.execSQL("DROP TABLE IF EXISTS " + CreateDatabase.TB_JOBSEEKER +"");
//        String tbJOBSEEKER = "CREATE TABLE IF NOT EXISTS " + CreateDatabase.TB_JOBSEEKER + " ( " + CreateDatabase.TB_JOBSEEKER_Idjs + " INTEGER PRIMARY KEY AUTOINCREMENT, "
//                + CreateDatabase.TB_JOBSEEKER_Username + " TEXT, " + CreateDatabase.TB_JOBSEEKER_Password + " TEXT, " + CreateDatabase.TB_JOBSEEKER_Fullname + " TEXT, " + CreateDatabase.TB_JOBSEEKER_Address + " TEXT, "
//                + CreateDatabase.TB_JOBSEEKER_Email + " TEXT, " + CreateDatabase.TB_JOBSEEKER_Phone + " INTEGER)";
//        database.execSQL(tbJOBSEEKER);
        long kiemtra = database.insert(CreateDatabase.TB_JOBSEEKER, null, contentValues);
        return kiemtra;
    }

    public static boolean Kiemtradangnhap(String tendangnhap, String matkhau) {
        String truyvan = "SELECT * FROM " + CreateDatabase.TB_JOBSEEKER + "";
//                " WHERE " + CreateDatabase.TB_JOBSEEKER_Username + " = '" + tendangnhap
//                + "' AND " + CreateDatabase.TB_JOBSEEKER_Password + " = '" + matkhau + "'";


        Cursor cursor = (Cursor)database.rawQuery(truyvan,null);
        if (cursor.getCount() != 0) {
            return true;
        } else {
            return false;
        }
    }

}
