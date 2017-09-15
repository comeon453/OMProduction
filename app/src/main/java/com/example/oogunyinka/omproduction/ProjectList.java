package com.example.oogunyinka.omproduction;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ProjectList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);


        FloatingActionButton addProjectFab = (FloatingActionButton) findViewById(R.id.add_project_fab);
        addProjectFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ProjectList.this, ProjectTextEditor.class);
                startActivity(intent);
            }
        });
    }
}


