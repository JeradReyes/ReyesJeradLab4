package jerad.reyes.com.reyesjeradlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITE", "onResume() has executed");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "4ITE", "onStart() has executed");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITE","onPause() has executed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITE","onStop() has executed");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "4ITE", "onDestroy() has executed");
    }

    public void ToastMessage1(View view){
        Toast.makeText( this,  "4ITE is the best", Toast.LENGTH_SHORT).show();
    }
    public void SnackBarMessage1(View view){
        Snackbar.make(view, "4ITE is the best", Snackbar.LENGTH_LONG).show();
    }
}
