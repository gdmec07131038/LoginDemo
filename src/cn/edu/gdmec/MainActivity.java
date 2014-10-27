package cn.edu.gdmec;

import cn.edu.gdmec.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTv1,myTv2;
	Button myBtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTv1=(TextView) findViewById(R.id.textView1);
       myTv2=(TextView) findViewById(R.id.textView2);
        myBtn1=(Button) findViewById(R.id.button1);
        myBtn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIt=new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(myIt,1);
			}
        	
        });
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode==1){
			if (resultCode==RESULT_OK){
				String msg= data.getExtras().getString("para");
				myTv1.setText(msg);
				myTv2.setText(msg);
			}
			
		}
	}



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
