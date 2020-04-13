package xyz.fancystuff.weatherlauncher;

import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/**
 *
 */
class LauncherActivity extends Activity {
     protected void onCreate(Bundle savedInstanceState) {
        onCreate(savedInstanceState);
        Intent intent = new Intent();
        Context mContext = this.getApplicationContext();
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.DynamicActivityTrampoline");
        intent.setData(Uri.parse("dynact://velour/weather/ProxyActivity"));
         mContext.startActivity(intent);
         this.finish();
    }
}