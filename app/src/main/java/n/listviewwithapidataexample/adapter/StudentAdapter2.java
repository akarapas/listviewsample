package n.listviewwithapidataexample.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import n.listviewwithapidataexample.R;
import n.listviewwithapidataexample.model.StudentModel;
import n.listviewwithapidataexample.util.Utility;

public class StudentAdapter2 extends BaseAdapter {
    Activity activity;
    ArrayList<StudentModel> studentList;

    public StudentAdapter2(Activity activity, ArrayList<StudentModel> studentList) {
        this.activity = activity;
        this.studentList = studentList;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listview_main2,parent,false);

        bindView(view,position);
        return view;
    }

    private void bindView(View view, int position){
        final StudentModel student =  this.studentList.get(position);
        TextView txtId = (TextView) view.findViewById(R.id.txt_id);
        TextView txtName = (TextView) view.findViewById(R.id.txt_name);
        TextView txtDept = (TextView) view.findViewById(R.id.txt_major);
        Button btnTel = (Button) view.findViewById(R.id.btn_tel);

        txtId.setText(student.id);
        txtName.setText(student.name);
        txtDept.setText(student.dept);
        btnTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                new Utility().callPhone(activity,student.telNo,1);
            }
        });
    }

}
