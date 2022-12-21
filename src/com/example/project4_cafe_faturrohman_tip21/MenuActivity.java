package com.example.project4_cafe_faturrohman_tip21;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends Activity {
	CheckBox cbNasiAyamOriginal,cbNasiAyamCrispy,cbKentang,cbSoft,cbAir;
	RadioButton rbTunai,rbKredit;
	Button bTpesan;
	RadioGroup rgPembayaran;
	TextView TextView1,tvTotal,tvStatus,tvTotalBayar,tvAyamGorengOriginal,tvAyamCrispy,tvKentang,tvSoftDrink,tvAirMineral;
	private boolean checked;
	
	private int dao = 0;
	private int dair=0;
	private int dkentang=0;
	private int dsoft=0;
	private int dayamcrispy=0;
	private int dtotal;
	private String stotal;
	private int dtotalbayar;
	private String stotalbayar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		TextView1=(TextView)findViewById(R.id.textView1);
		cbNasiAyamOriginal = (CheckBox)findViewById(R.id.cbNasiAyamOriginal);
		cbNasiAyamCrispy = (CheckBox)findViewById(R.id.cbNasiAyamCrispy);
		cbKentang = (CheckBox)findViewById(R.id.cbKentang);
		cbSoft = (CheckBox)findViewById(R.id.cbSoft);
		cbAir = (CheckBox)findViewById(R.id.cbAir);
		tvAyamGorengOriginal = (TextView)findViewById(R.id.tvAyamGorengOriginal);
		tvAyamCrispy = (TextView)findViewById(R.id.tvAyamCrispy);
		tvKentang = (TextView)findViewById(R.id.tvKentang);
		tvSoftDrink = (TextView)findViewById(R.id.tvSoftDrink);
		tvAirMineral = (TextView)findViewById(R.id.tvAirMineral);
		rbKredit = (RadioButton)findViewById(R.id.rbKredit);
		rbTunai= (RadioButton)findViewById(R.id.rbTunai);
		bTpesan = (Button)findViewById(R.id.bTpesan);
		tvTotal = (TextView)findViewById(R.id.tvTotal);
		tvStatus= (TextView)findViewById(R.id.tvStatus);
		tvTotalBayar = (TextView)findViewById(R.id.tvTotalBayar);	
		rgPembayaran = (RadioGroup)findViewById(R.id.rgPembayaran);
		
		
		cbNasiAyamOriginal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				KlikCekBox(arg0);
			}
		});
		
		cbKentang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				KlikCekBox(arg0);
			}
		});
		
		cbSoft.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				KlikCekBox(arg0);
			}
		});
		
		cbAir.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				KlikCekBox(arg0);
			}
		});
		cbNasiAyamCrispy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				KlikCekBox(arg0);
			}
		});
	}

	public void KlikCekBox(View v) {
		// TODO Auto-generated method stub
		checked = ((CheckBox)v).isChecked();
		switch (v.getId()) {
		case R.id.cbNasiAyamOriginal:
			if (checked) {
				tvAyamGorengOriginal.setText("15000");
				dao =Integer.parseInt(tvAyamGorengOriginal.getText().toString());
		
			}else {
				tvAyamGorengOriginal.setText("0");
				dao = 0;
			}
			break;
		case R.id.cbAir:
			if (checked){
				tvAirMineral.setText("3000");
				dair=Integer.parseInt(tvAirMineral.getText().toString());
				
			}else {
				tvAirMineral.setText("0");
				dair = 0;
			}
			break;
		case R.id.cbKentang:
			if(checked){
				tvKentang.setText("10000");
				dkentang = Integer.parseInt(tvKentang.getText().toString());
			}else {
				tvKentang.setText("0");
				dkentang=0;
			}
			break;
		case R.id.cbSoft:
			if (checked){
				tvSoftDrink.setText("5000");
				dsoft = Integer.parseInt(tvSoftDrink.getText().toString());
			}else{
				tvSoftDrink.setText("0");
				dsoft=0;
			}
			break;
		case R.id.cbNasiAyamCrispy:
			if(checked){
				tvAyamCrispy.setText("12000");
				dayamcrispy = Integer.parseInt(tvAyamCrispy.getText().toString());
			}else{
				tvAyamCrispy.setText("0");
				dayamcrispy=0;
			}
			break;
		default:
			break;
		}
		
		rgPembayaran.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				
				switch (arg1) {
				case R.id.rbTunai:
					tvStatus.setText(rbTunai.getText());
					Toast.makeText(getApplicationContext(),"Tunai",Toast.LENGTH_SHORT).show();
					break;
				case R.id.rbKredit:
					tvStatus.setText(rbKredit.getText());
					Toast.makeText(getApplicationContext(), "Kredit", Toast.LENGTH_SHORT).show();
					break;
				default:
					break;
				}
			}
		}); 
		
		dtotal=dao+dair+dayamcrispy+dkentang+dsoft; 
		stotal=String.valueOf(dtotal);
		tvTotal.setText(stotal);
		dtotalbayar=dtotal - (dtotal*10/100); 
		stotalbayar=String.valueOf(dtotalbayar);
		
		bTpesan.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(rbKredit.isChecked()){
					tvTotalBayar.setText("Rp. "+(stotalbayar));
				}else {
					tvTotalBayar.setText("Rp. "+(stotal));
				}
			
			}

		});
		
		
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

