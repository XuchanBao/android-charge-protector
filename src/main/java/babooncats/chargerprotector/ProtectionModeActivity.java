package babooncats.chargerprotector;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ProtectionModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protection_mode);

        Intent intent = getIntent();
    }

    @Override
    public void onResume() {
        super.onResume();


    }

    public void endProtection(View view) {
        this.finish();
    }



}
