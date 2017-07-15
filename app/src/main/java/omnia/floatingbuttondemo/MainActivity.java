package omnia.floatingbuttondemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        FragmentTransaction ft=getFragmentManager().beginTransaction();
        ft.replace(R.id.main,new NewFragment());
        ft.commit();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(getLayoutInflater().inflate(R.layout.custom_dialog,null));
                Dialog dialog=builder.show();
            }
        });
    }
}
