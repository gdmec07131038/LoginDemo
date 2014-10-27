package cn.edu.gdmec;
import cn.edu.gdmec.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {
	EditText myEt1,myEt2;
	Button  myBtn2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		myEt1=(EditText) findViewById(R.id.editText1);
		myEt2=(EditText) findViewById(R.id.editText2);
		myBtn2=(Button) findViewById(R.id.button2);
		myBtn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Uri data=Uri.parse("tel:");
				Intent result=new Intent(null,data);
				result.putExtra("para", myEt1.getText().toString());
				result.putExtra("para", myEt2.getText().toString());
				Toast.makeText(SecondActivity.this, myEt1.getText().toString(), 3000);
				Toast.makeText(SecondActivity.this, myEt2.getText().toString(), 3000);
				setResult(RESULT_OK, result);
				finish();
			}
			
		});
	}

}
