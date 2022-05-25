package sg.edu.rp.c346.id21024611.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC206;
    TextView tvC235;
    TextView tvC346;
    TextView tvC203;
    TextView tvC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC206 = findViewById(R.id.tvC206);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);
        tvC203 = findViewById(R.id.tvC203);
        tvC218 = findViewById(R.id.tvC218);

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C206");
                intent.putExtra("name", "Software Development Process ");
                intent.putExtra("year", "2022");
                intent.putExtra("semester", "Sem 1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E66K");
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C235");
                intent.putExtra("name", "IT Security and Management ");
                intent.putExtra("year", "2022");
                intent.putExtra("semester", "Sem 1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E66G");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346");
                intent.putExtra("name", "Mobile App Development ");
                intent.putExtra("year", "2022");
                intent.putExtra("semester", "Sem 1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203");
                intent.putExtra("name", "Web Appln Development in php ");
                intent.putExtra("year", "2022");
                intent.putExtra("semester", "Sem 1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "W65H");
                startActivity(intent);
            }
        });
        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C218");
                intent.putExtra("name", "UI/UX Design for Apps ");
                intent.putExtra("year", "2022");
                intent.putExtra("semester", "Sem 1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E66B");
                startActivity(intent);
            }
        });
    }
}