package com.example.oogunyinka.omproduction;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by oogunyinka on 15/09/2017.
 */

public class ProjectAdapter extends ArrayAdapter<ProjectData> {
    public ProjectAdapter( Context context, List<ProjectData> projectData) {
        super(context, 0, projectData);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.project_list_item, parent, false);
        }

     ProjectData currentProject =    getItem(position);

        TextView jobNumberView = (TextView) listItemView.findViewById(R.id.job_number_view) ;
        jobNumberView.setText(currentProject.getJobNumber());

        TextView accountHandlerView = (TextView) listItemView.findViewById(R.id.account_handler_view) ;
        accountHandlerView.setText(currentProject.getAccountHandler());



        return convertView;
    }


}
