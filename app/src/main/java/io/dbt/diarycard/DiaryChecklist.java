package io.dbt.diarycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DiaryChecklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_checklist);

        // Set today's date at the top of the screen
        TextView dateTextView = (TextView) this.findViewById(R.id.DateTextView);

        Date date = Calendar.getInstance().getTime();
        dateTextView.setText(new SimpleDateFormat("EEE, d MMM yyyy", Locale.ENGLISH).format(date.getTime()));

    }
}
