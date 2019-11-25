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
	// �����ͺ��̽��� ������ �� ó���Ѵ�
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
	// �����ͺ��̽� ������ ���׷��̵� �Ǿ�����
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		String sql = "drop table if exists" + TABLE_NAME + ";";
		db.execSQL(sql);
		onCreate(db);

	}

}
