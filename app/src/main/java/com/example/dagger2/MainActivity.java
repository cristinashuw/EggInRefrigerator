package com.example.dagger2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String eggs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EggsApplication) getApplication())
                .getAppComponent()
                .inject(this);

        TextView eggsView = findViewById(R.id.eggs);
        eggsView.setText("Cooked the " + eggs);
    }
}
