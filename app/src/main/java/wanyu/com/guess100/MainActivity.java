package wanyu.com.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int r = ran.nextInt(99)+1;
    int min = 1;
    int max = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        EditText number = (EditText) findViewById(R.id.number);
        TextView secret = (TextView) findViewById(R.id.secret);
        TextView info = (TextView) findViewById(R.id.info);
        Button send = (Button) findViewById(R.id.send);
        int n = Integer.parseInt(number.getText().toString());


        while (n>r && n>min && n<max){
            Toast.makeText(MainActivity.this, min+"to"+r, Toast.LENGTH_LONG).show();
            TextView number100 = (TextView) findViewById(R.id.number);
            String s = String.valueOf(n);
            number100.setText(s);
            break;
        }
        while (n<r && n>min && n<max){
            Toast.makeText(MainActivity.this, n+"to"+r , Toast.LENGTH_SHORT).show();
            TextView number0 = (TextView) findViewById(R.id.number);
            String s = String.valueOf(n);
            number0.setText(s);
            break;
        }
    }
}
