package n.listviewwithapidataexample.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

import n.listviewwithapidataexample.model.StudentModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class APIHelper2 {


    OkHttpClient client = new OkHttpClient();
    String url = "";

    public APIHelper2(String url) {
        this.url = url;
    }

    public ArrayList<StudentModel> getStudentData(){
        Request request = new Request.Builder()
                .url(this.url)
                .build();

        try(Response response = client.newCall(request).execute()){
            String result = response.body().string();

            Gson gson = new Gson();
            Type collectionType = new TypeToken<ArrayList<StudentModel>>(){}.getType();
            return gson.fromJson(result,collectionType);

        }catch(Exception e){
            return null;
        }
    }
}
