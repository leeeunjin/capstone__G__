package com.example.rrbagoon2;

import java.util.HashMap;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class mallCart extends Activity {
	
	public String TAG = "";
	public String encoding = "UTF-8";
	public HashMap <String,String> hm = new HashMap<String,String> ();
	HashMap<String,String> hmCart = new HashMap<String, String> ();
	util cmsutil = new util();
	Activity act = this;
	Intent actIntent;
	Activity actNext;
	ContentResolver cr;
	public static final String uriString = "content://com.example.rrbagoon2/cart";
	public static final Uri CONTENT_URI = Uri.parse(uriString);
	String rowid;
	int ea;
	String mode;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mall_cart);
		top top = new top(this);
		top.init();
		
		actIntent = this.getIntent();
		rowid = cmsutil.null2empty(actIntent.getStirngExtra("rowid"));
		ea = actIntent.getIntExtra("ea",0);
		mode = cmsutil.null2empty(actIntent.getStirngExtra("mode"));
		
		cmsutil.act = this;
		TAG = this.getLocalClassName();
		cr = this.getContentResolver();
		
		cartIn();
		btnTrunOn();
		
	}
	
	public void getXMLDATAList() {
		if (!"".equals(rowid) && ea>0) {} else return;
		
		String theUrl = "http://www.owllab.com/android/mall_detail.php";
		Log.i(TAG, theUrl);
		
		
	}
}
