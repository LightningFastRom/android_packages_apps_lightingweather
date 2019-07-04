package xyz.fancystuff.weatherlauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class LauncherActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try {
			Intent intent = new Intent(); 
			intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.velour.DynamicActivityTrampoline");
			intent.setData(Uri.parse("dynact://velour/weather/ProxyActivity"));
			startActivity(intent);
		} catch (Exception e) {
			Toast.makeText(this, getString(R.string.no_google_weather), Toast.LENGTH_LONG).show();
		}
		finish();
    }
}