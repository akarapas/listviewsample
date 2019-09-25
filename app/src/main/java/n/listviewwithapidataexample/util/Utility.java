package n.listviewwithapidataexample.util;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Utility {

    public  void callPhone(Activity activity, String telNumber,int requestCode){
        if(ContextCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            String[] permissions = {Manifest.permission.CALL_PHONE,Manifest.permission.READ_CONTACTS};
            ActivityCompat.requestPermissions(activity,permissions,requestCode);
        }else{
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + telNumber));
            activity.startActivity(intent);
        }

    }
}
