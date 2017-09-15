package com.example.oogunyinka.omproduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import static com.example.oogunyinka.omproduction.R.menu.editor_menu;

/**
 * Created by oogunyinka on 14/09/2017.
 */

public class ProjectTextEditor extends AppCompatActivity{

    ArrayList<ProjectData> projects = new ArrayList<ProjectData>();

    private EditText mJobNumber, mAccountHander, mProduction, mSample, mPersonalNotes;
    private DatePicker mDate;
    private Spinner mStatusSpinner;



    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.project_text_editor);



        //read from all relevant views
        mJobNumber = (EditText) findViewById(R.id.job_number);
        mAccountHander = (EditText) findViewById(R.id.account_handler);
        mProduction = (EditText) findViewById(R.id.production_member);
        mSample = (EditText) findViewById(R.id.sample);
        mPersonalNotes = (EditText) findViewById(R.id.personal_notes);
        mDate = (DatePicker) findViewById(R.id.date);
        mStatusSpinner = (Spinner) findViewById(R.id.status_spinner);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(editor_menu, menu);

        return true;



    }


    private void saveJob(){
        String jobNumber = mJobNumber.getText().toString().trim();
        String accountHandler = mAccountHander.getText().toString().trim();
        String production = mProduction.getText().toString().trim();
        String sample = mSample.getText().toString().trim();
        String personalNotes = mPersonalNotes.getText().toString().trim();

         projects.add(new ProjectData(jobNumber, accountHandler, production, sample, personalNotes));
        ProjectAdapter adapter = new ProjectAdapter(this, projects);
        ListView listview = (ListView) findViewById(R.id.projectList);
        listview.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // User clicked on a menu option in the app bar overflow menu
        switch (item.getItemId()) {
            // Respond to a click on the "Save" menu option
            case R.id.save_action:
                saveJob();
                finish();
                return true;
            // Respond to a click on the "Delete" menu option
            case R.id.delete_action:
                return true;
            // Respond to a click on the "Up" arrow button in the app bar
            case android.R.id.home:
                // Navigate back to parent activity (CatalogActivity)
             //   onNavigateBackButton();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
