package n.listviewwithapidataexample.model;

import com.google.gson.annotations.SerializedName;

public class StudentModel {
    @SerializedName("ac_pictureurl")
    public String pictureUrl;
    @SerializedName("ac_id")
    public String id;
    @SerializedName("ac_name")
    public String name;
    @SerializedName("ac_tel")
    public String telNo;
    @SerializedName("ac_dept")
    public String dept;

    public StudentModel(String pictureUrl, String id, String name, String telNo, String dept) {
        this.pictureUrl = pictureUrl;
        this.id = id;
        this.name = name;
        this.telNo = telNo;
        this.dept = dept;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelNo() {
        return telNo;
    }

    public String getDept() {
        return dept;
    }
}
