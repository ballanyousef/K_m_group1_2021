package yb.it.k_m_group1_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void option1_click(View view) {
        Toast.makeText(this, "option1", Toast.LENGTH_SHORT).show();

        Intent i=new Intent(this,ActivityOption1.class);
        i.putExtra("email","ballan_yousef");
        startActivity(i);

    }

    public void option2_click(View view) {
        Toast.makeText(this, "option2", Toast.LENGTH_SHORT).show();
    }

    public void option3_click(View view) {
        Toast.makeText(this, "option3", Toast.LENGTH_SHORT).show();
    }

    public void option4_click(View view) {
        Toast.makeText(this, "option4", Toast.LENGTH_SHORT).show();
    }
}