package com.example.oogunyinka.omproduction;

import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by oogunyinka on 15/09/2017.
 */

public class ProjectData {
    private String mJobNumber, mAccountHander, mProduction, mSample, mPersonalNotes;
    private DatePicker mDate;
    private Spinner mStatusSpinner;

    public ProjectData(String jobNumber, String accountHander, String production, String sample, String personalNotes){
        mJobNumber = jobNumber;
        mAccountHander = accountHander;
        mProduction = production;
        mSample = sample;
        mPersonalNotes = personalNotes;
    }

    public String getJobNumber(){
        return mJobNumber;
    }

    public String getAccountHandler(){
        return mAccountHander;
    }

    public String getProduction(){
        return mProduction;
    }

    public String getSample(){
        return mSample;
    }

    public String getPersonalNotes(){
        return mPersonalNotes;
    }




}
