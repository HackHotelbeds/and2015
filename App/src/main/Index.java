package com.myapps.roadtrips.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class Index extends Activity {

	TextView format=null;
	TextView contents=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);

		format=(TextView)findViewById(R.id.format);
		contents=(TextView)findViewById(R.id.contents);
	}

	public void doScan(View v) {
		(new IntentIntegrator(this)).initiateScan();
	}

	public void onActivityResult(int request, int result, Intent i) {
		IntentResult scan=IntentIntegrator.parseActivityResult(request,
				result,
				i);

		if (scan!=null) {
			format.setText(scan.getFormatName());
			contents.setText(scan.getContents());
			this.startActivityChange();
		}
	}

	private void startActivityChange () {
		Intent intent = new Intent(this.getApplicationContext(), MainActivity.class);
		startActivity(intent);
	}

	@Override
	public void onSaveInstanceState(Bundle state) {
		state.putString("format", format.getText().toString());
		state.putString("contents", contents.getText().toString());
	}

	@Override
	public void onRestoreInstanceState(Bundle state) {
		format.setText(state.getString("format"));
		contents.setText(state.getString("contents"));
	}
}
