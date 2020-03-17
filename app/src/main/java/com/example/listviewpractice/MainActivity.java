package com.example.listviewpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] data={
            "20161707",
            "20161713",
            "20171591",
            "20171592",
            "20171616",
            "20171627",
            "20171641",
            "20171649",
            "20171650",
            "20171653",
            "20171654",
            "20171655",
            "20171656",
            "20171659",
            "20171664",
            "20171666",
            "20171667",
            "20171668",
            "20171669",
            "20171670",
            "20171679",
            "20171688",
            "20171697",
            "20171705",
            "20171707",
            "20171714",
            "20171717",
            "20171731",
            "20171742",
            "20175064",
            "20175980",
            "20175990"};

    private List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudent();//初始化天气数据

        final Intent intent=new Intent();
        intent.setClass(this,ShowActivity.class);
        final Bundle bundle=new Bundle();

        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.item, studentList);
        final ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        //为ListView添加点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student =(Student) parent.getItemAtPosition(position);
                bundle.putString("cquId",student.getCquId());
                bundle.putInt("imageId",student.getImageId());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }



    private void initStudent(){

        for(int i=0;i<data.length;i++){
            Student stu=new Student(R.drawable.emoji_kids_01+i,data[i]);
            studentList.add(stu);
        }


        /*
        Student i_01=new Student(R.drawable.emoji_kids_01,data[0]);
        studentList.add(i_01);
        Student i_02=new Student(R.drawable.emoji_kids_02,data[1]);
        studentList.add(i_02);
        Student i_03=new Student(R.drawable.emoji_kids_03,data[2]);
        studentList.add(i_03);
        Student i_04=new Student(R.drawable.emoji_kids_04,data[3]);
        studentList.add(i_04);
        Student i_05=new Student(R.drawable.emoji_kids_05,data[4]);
        studentList.add(i_05);
        Student i_06=new Student(R.drawable.emoji_kids_06,data[5]);
        studentList.add(i_06);
        Student i_07=new Student(R.drawable.emoji_kids_07,data[6]);
        studentList.add(i_07);
        Student i_08=new Student(R.drawable.emoji_kids_08,data[7]);
        studentList.add(i_08);
        Student i_09=new Student(R.drawable.emoji_kids_09,data[8]);
        studentList.add(i_09);
        Student i_10=new Student(R.drawable.emoji_kids_10,data[9]);
        studentList.add(i_10);
        Student i_11=new Student(R.drawable.emoji_kids_11,data[10]);
        studentList.add(i_11);
        Student i_12=new Student(R.drawable.emoji_kids_12,data[11]);
        studentList.add(i_12);
        Student i_13=new Student(R.drawable.emoji_kids_13,data[12]);
        studentList.add(i_13);
        Student i_14=new Student(R.drawable.emoji_kids_14,data[13]);
        studentList.add(i_14);
        Student i_15=new Student(R.drawable.emoji_kids_15,data[14]);
        studentList.add(i_15);
        Student i_16=new Student(R.drawable.emoji_kids_16,data[15]);
        studentList.add(i_16);
        Student i_17=new Student(R.drawable.emoji_kids_17,data[16]);
        studentList.add(i_17);
        Student i_18=new Student(R.drawable.emoji_kids_18,data[17]);
        studentList.add(i_18);
        Student i_19=new Student(R.drawable.emoji_kids_19,data[18]);
        studentList.add(i_19);
        Student i_20=new Student(R.drawable.emoji_kids_20,data[19]);
        studentList.add(i_20);
        Student i_21=new Student(R.drawable.emoji_kids_21,data[20]);
        studentList.add(i_21);
        Student i_22=new Student(R.drawable.emoji_kids_22,data[21]);
        studentList.add(i_22);
        Student i_23=new Student(R.drawable.emoji_kids_23,data[22]);
        studentList.add(i_23);
        Student i_24=new Student(R.drawable.emoji_kids_24,data[23]);
        studentList.add(i_24);
        Student i_25=new Student(R.drawable.emoji_kids_25,data[24]);
        studentList.add(i_25);
        Student i_26=new Student(R.drawable.emoji_kids_26,data[25]);
        studentList.add(i_26);
        Student i_27=new Student(R.drawable.emoji_kids_27,data[26]);
        studentList.add(i_27);
        Student i_28=new Student(R.drawable.emoji_kids_28,data[27]);
        studentList.add(i_28);
        Student i_29=new Student(R.drawable.emoji_kids_29,data[28]);
        studentList.add(i_29);
        Student i_30=new Student(R.drawable.emoji_kids_30,data[29]);
        studentList.add(i_30);
        Student i_31=new Student(R.drawable.emoji_kids_31,data[30]);
        studentList.add(i_31);
        Student i_32=new Student(R.drawable.emoji_kids_32,data[31]);
        studentList.add(i_32);

*/

    }
}
