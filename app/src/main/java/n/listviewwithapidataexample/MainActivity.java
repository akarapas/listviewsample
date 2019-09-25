package n.listviewwithapidataexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import n.listviewwithapidataexample.adapter.StudentAdapter;
import n.listviewwithapidataexample.api.APIHelper;
import n.listviewwithapidataexample.model.StudentModel;

public class MainActivity extends AppCompatActivity {

    ListView lstStudent;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        getDataFromAPI();
    }

    private void bindView(){
        lstStudent = (ListView) findViewById(R.id.list_student);
    }

    private void getDataFromAPI(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        ArrayList<StudentModel> studentList = new APIHelper(
                "https://jsonstorage.net/api/items/0ec309f5-fd79-47cf-8be7-42192d73e4f0")
                .getStudentData();
        if(studentList != null){
            setAdapter(studentList);
        }

    }

    private void setAdapter(ArrayList<StudentModel> list){
        adapter = new StudentAdapter(this,list);
        lstStudent.setAdapter(adapter);
        lstStudent.deferNotifyDataSetChanged();
    }

}
