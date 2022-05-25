package sg.edu.rp.c346.id21024611.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView moduleCode;
    TextView moduleName;
    TextView semester;
    TextView academicYear;
    TextView moduleCredit;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleCode = findViewById(R.id.moduleCode);
        moduleName = findViewById(R.id.moduleName);
        semester = findViewById(R.id.semester);
        moduleCredit = findViewById(R.id.moduleCredit);
        academicYear = findViewById(R.id.academicYear);
        venue = findViewById(R.id.venue);

        Intent intentReceived=getIntent();

        String moduleSelected=intentReceived.getStringExtra("module");
        if (moduleSelected.trim().equalsIgnoreCase("C206")){

            moduleCode.setText("Module Code" + ":" + intentReceived.getStringExtra("module"));
            moduleName.setText("Module Name" + ":" + intentReceived.getStringExtra("name"));
            academicYear.setText("Academic Year" + ":" + intentReceived.getStringExtra("year"));
            semester.setText("Semester" + ":" + intentReceived.getStringExtra("semester"));
            moduleCredit.setText("Module Credit" + ":" + intentReceived.getStringExtra("credit"));
            venue.setText("Venue" + ":" + intentReceived.getStringExtra("venue"));

    }
        else if (moduleSelected.trim().equalsIgnoreCase("C235")){

            moduleCode.setText("Module Code" + ":" + intentReceived.getStringExtra("module"));
            moduleName.setText("Module Name" + ":" + intentReceived.getStringExtra("name"));
            academicYear.setText("Academic Year" + ":" + intentReceived.getStringExtra("year"));
            semester.setText("Semester" + ":" + intentReceived.getStringExtra("semester"));
            moduleCredit.setText("Module Credit" + ":" + intentReceived.getStringExtra("credit"));
            venue.setText("Venue" + ":" + intentReceived.getStringExtra("venue"));

        }
        else if (moduleSelected.trim().equalsIgnoreCase("C346")) {

            moduleCode.setText("Module Code" + ":" + intentReceived.getStringExtra("module"));
            moduleName.setText("Module Name" + ":" + intentReceived.getStringExtra("name"));
            academicYear.setText("Academic Year" + ":" + intentReceived.getStringExtra("year"));
            semester.setText("Semester" + ":" + intentReceived.getStringExtra("semester"));
            moduleCredit.setText("Module Credit" + ":" + intentReceived.getStringExtra("credit"));
            venue.setText("Venue" + ":" + intentReceived.getStringExtra("venue"));
        }
        else if (moduleSelected.trim().equalsIgnoreCase("C203")) {

            moduleCode.setText("Module Code" + ":" + intentReceived.getStringExtra("module"));
            moduleName.setText("Module Name" + ":" + intentReceived.getStringExtra("name"));
            academicYear.setText("Academic Year" + ":" + intentReceived.getStringExtra("year"));
            semester.setText("Semester" + ":" + intentReceived.getStringExtra("semester"));
            moduleCredit.setText("Module Credit" + ":" + intentReceived.getStringExtra("credit"));
            venue.setText("Venue" + ":" + intentReceived.getStringExtra("venue"));

        }
        else if (moduleSelected.trim().equalsIgnoreCase("C218")) {

            moduleCode.setText("Module Code" + ":" + intentReceived.getStringExtra("module"));
            moduleName.setText("Module Name" + ":" + intentReceived.getStringExtra("name"));
            academicYear.setText("Academic Year" + ":" + intentReceived.getStringExtra("year"));
            semester.setText("Semester" + ":" + intentReceived.getStringExtra("semester"));
            moduleCredit.setText("Module Credit" + ":" + intentReceived.getStringExtra("credit"));
            venue.setText("Venue" + ":" + intentReceived.getStringExtra("venue"));

        }
        }}