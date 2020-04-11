
package pw.fys.rnandroidsettingstool;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.os.PowerManager;

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
  public void ACTION_SETTINGS() {
    Intent intent = new Intent();
    intent.setAction("android.settings.SETTINGS");
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivityForResult(intent, 1, null);
  }

  @ReactMethod
  public void ACTION_APP_NOTIFICATION_SETTINGS() {
    try {
      Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
        intent.putExtra("app_package", packageName);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_APPLICATION_DETAILS_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS");
      intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
      intent.putExtra("app_package", packageName);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_APPLICATION_DETAILS_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_APPLICATION_DETAILS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_BATTERY_SAVER_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.BATTERY_SAVER_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_BLUETOOTH_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.BLUETOOTH_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_CAPTIONING_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.CAPTIONING_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_CAST_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.CAST_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_CHANNEL_NOTIFICATION_SETTINGS(Integer chanelID) {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
      intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
      intent.putExtra("android.provider.extra.CHANNEL_ID", chanelID);
      intent.putExtra("app_package", packageName);
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_APP_NOTIFICATION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_DATA_ROAMING_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.DATA_ROAMING_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_DATE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.DATE_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
      }
  }

  @ReactMethod
  public void ACTION_DEVICE_INFO_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.DEVICE_INFO_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_DISPLAY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.DISPLAY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_DREAM_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.DREAM_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_FINGERPRINT_ENROLL() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.FINGERPRINT_ENROLL");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_HARD_KEYBOARD_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.HARD_KEYBOARD_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_HOME_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.HOME_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_INPUT_METHOD_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.INPUT_METHOD_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_INPUT_METHOD_SUBTYPE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.INPUT_METHOD_SUBTYPE_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_INTERNAL_STORAGE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.INTERNAL_STORAGE_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_LOCALE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.LOCALE_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_LOCATION_SOURCE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_APPLICATIONS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.MANAGE_APPLICATIONS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_DEFAULT_APPS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_OVERLAY_PERMISSION() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_UNKNOWN_APP_SOURCES() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MANAGE_WRITE_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.action.MANAGE_WRITE_SETTINGS");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_MEMORY_CARD_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.MEMORY_CARD_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NETWORK_OPERATOR_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NETWORK_OPERATOR_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NFCSHARING_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NFCSHARING_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NFC_PAYMENT_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NFC_PAYMENT_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NFC_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NFC_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NIGHT_DISPLAY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NIGHT_DISPLAY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_ASSISTANT_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NOTIFICATION_ASSISTANT_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_LISTENER_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_PRINT_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.ACTION_PRINT_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_PRIVACY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.PRIVACY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_QUICK_LAUNCH_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.QUICK_LAUNCH_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS() {
    Intent intent = new Intent();
    PowerManager pm = (PowerManager) getSystemService(POWER_SERVICE);
    if (pm.isIgnoringBatteryOptimizations(packageName))
        intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
    else {
        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.fromParts("package", packageName, null));
    }
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    reactContext.startActivityForResult(intent, 1, null);
  }

  @ReactMethod
  public void ACTION_REQUEST_SET_AUTOFILL_SERVICE() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.REQUEST_SET_AUTOFILL_SERVICE");
      intent.setData(Uri.fromParts("package", packageName, null));
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_SEARCH_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.search.action.SEARCH_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_SECURITY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.SECURITY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_SOUND_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.SOUND_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_SYNC_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.SYNC_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_USAGE_ACCESS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.USAGE_ACCESS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_USER_DICTIONARY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.USER_DICTIONARY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_VOICE_INPUT_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.VOICE_INPUT_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_VPN_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.VPN_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_VR_LISTENER_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.VR_LISTENER_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_WEBVIEW_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.WEBVIEW_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_WIFI_IP_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.WIFI_IP_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_WIFI_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.WIFI_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_WIRELESS_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.WIRELESS_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

  @ReactMethod
  public void ACTION_ZEN_MODE_PRIORITY_SETTINGS() {
    try {
      Intent intent = new Intent();
      intent.setAction("android.settings.ZEN_MODE_PRIORITY_SETTINGS");
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
      reactContext.startActivityForResult(intent, 1, null);
    } catch (Exception e) {
      ACTION_SETTINGS();
    }
  }

}
