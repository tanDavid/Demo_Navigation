package sg.edu.rp.webservices.demonavigation;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    ActionBar ab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }
}
