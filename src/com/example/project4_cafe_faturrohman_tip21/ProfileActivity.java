package com.example.project4_cafe_faturrohman_tip21;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileActivity extends Activity{
	Button bt,btMenu;
	EditText etNama,etNim,etKelas;
	
	@Override
	protected void onCreate(Bundle savedIstanceState){
		super.onCreate(savedIstanceState);
		setContentView(R.layout.activity_profile);
		
		bt = (Button)findViewById(R.id.bt);
		btMenu = (Button)findViewById(R.id.btMenu);
		etNama = (EditText)findViewById(R.id.etNama);
		etKelas = (EditText)findViewById(R.id.etKelas);
		etNim = (EditText)findViewById(R.id.etNim);
		
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				etNama.setText("Faturrohman");
				etKelas.setText("TIP.21.2");
				etNim.setText("1121100155");
			}
		});
		
		btMenu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent bukaMenu = new Intent(getApplicationContext(),MenuActivity.class);
				startActivity(bukaMenu);	
			}
		});
		
	}
	
	
}


