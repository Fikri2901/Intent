package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameInput = findViewById(R.id.input_username);

    }

    public void handleExplicitIntent(View view) {
        Intent intent =  new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleImplicitIntent(View view) {
        Intent itn = new Intent(this, ImplicitIntentActivity.class);
        startActivity(itn);
    }

    public void handleBundleIntent(View view) {
        Intent itn = new Intent( this, BundleActivity.class);
        startActivity(itn);
    }

    public void handleParcebleIntent(View view) {
        Intent itn = new Intent(this , ParcelableActivity.class);
        startActivity(itn);
    }
}
