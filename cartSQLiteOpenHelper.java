package com.example.rrbagoon2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class cartSQLiteOpenHelper extends SQLiteOpenHelper {
	
	public static final int DATABASE_VERSION=1;
	public static final String DATABASE_FILE="cart.db";
	public static final String TABLE_NAME = "cart";
	
	public cartSQLiteOpenHelper(Context context) {
		super(context, DATABASE_FILE,null,DATABASE_VERSION);
	
	}

	@Override
	// 데이터베이스가 생성될 때 처리한다
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "create table " + TABLE_NAME + " ("
				+"num integer primary key autoincrement"
				+", rowid integer"
				+", prodname varchar"
				+", sortname varchar"
				+", price integer"
				+", ea integer"
				+", maxea integer"
				+", img varchar"
				+");";
		db.execSQL(sql);

	}

	@Override
	// 데이터베이스 버전이 업그레이드 되었을때
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		String sql = "drop table if exists" + TABLE_NAME + ";";
		db.execSQL(sql);
		onCreate(db);

	}

}
