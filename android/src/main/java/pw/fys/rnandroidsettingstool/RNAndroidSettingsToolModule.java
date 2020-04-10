
package pw.fys.rnandroidsettingstool;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNAndroidSettingsToolModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private final String packageName;

  public RNAndroidSettingsToolModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    this.packageName = reactContext.getPackageName();
  }

  @Override
  public String getName() {
    return "RNAndroidSettingsTool";
  }

  @ReactMethod
  public void openNotification() {
      Intent intent = new Intent();
      if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
          intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
          intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
          intent.putExtra("app_package", packageName);
          intent.putExtra("app_uid", reactContext.getApplicationInfo().uid);
      } else {
          intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
          intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          intent.addCategory(Intent.CATEGORY_DEFAULT);
          intent.setData(Uri.fromParts("package", packageName, null));
      }
      reactContext.startActivityForResult(intent, 1, null);
  }

  @ReactMethod
  public void openAppDetails() {
      Intent intent = new Intent();
      intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivity(intent);
  }

  @ReactMethod
  public void openPackageDetails(String packageName) {
      Intent intent = new Intent();
      intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      intent.setData(Uri.fromParts("package", packageName, null));
      reactContext.startActivity(intent);
  }

}
