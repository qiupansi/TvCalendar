package com.psqiu.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.psqiu.calendar.view.MonthView;
import com.psqiu.calendar.view.TvCalenderView;

//更多TV项目资源(如桌面，直播，教育，应用市场，文件管理器，设置，酒店应用等)，添加微信：qiupansi
//If you want more TV project resources,such as TvLauncher,TvLive,TvAppStore,TvSettings,TvFileManager,TvEducation,TvHotel,TvMusic,TvRemote and so on，Add me wechat：qiupansi
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvDate = (TextView) findViewById(R.id.tv_date);
        TvCalenderView calenderView = (TvCalenderView) findViewById(R.id.calenderView);
        calenderView.setOnDataSelectedListener(new MonthView.OnDateSeletedListener() {
            @Override
            public void onDateSelected(int year, int month, int day) {
                Toast.makeText(MainActivity.this,year+"-"+(month+1)+"-"+day,Toast.LENGTH_SHORT).show();
            }
        });

        calenderView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                DatePickerDialogUtil.showCustomDPV(MainActivity.this, tvDate);
                return false;
            }
        });
    }
}
