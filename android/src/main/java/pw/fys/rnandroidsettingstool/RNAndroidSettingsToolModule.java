
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
  private final Intent intent;

  public RNAndroidSettingsToolModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    this.intent = new Intent();
  }

  @Override
  public String getName() {
    return "RNAndroidSettingsTool";
  }

  private void startActivityForResult() {
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    reactContext.startActivityForResult(intent, 1, null);
  }

  private static boolean isNullOrEmpty(String str) {
    if (str != null && !str.isEmpty())
      return false;
    return true;
  }

  private void putExtraPackageStartActivityForResult(String packageName) {
    String _packageName = packageName;
    if (isNullOrEmpty(packageName)) {
      _packageName = reactContext.getPackageName();
    }
    intent.putExtra("android.provider.extra.APP_PACKAGE", _packageName);
    intent.putExtra("app_package", _packageName);
    startActivityForResult();
  }

  private void setDataPackageStartActivityForResult(String packageName) {
    String _packageName = packageName;
    if (isNullOrEmpty(packageName)) {
      _packageName = reactContext.getPackageName();
    }
    intent.setData(Uri.fromParts("package", _packageName, null));
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_SETTINGS() {
    intent.setAction("android.settings.SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_APP_NOTIFICATION_SETTINGS(String packageName) {
    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
    putExtraPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS(String packageName) {
    intent.setAction("android.settings.APP_NOTIFICATION_BUBBLE_SETTINGS");
    putExtraPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_APPLICATION_DETAILS_SETTINGS(String packageName) {
    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_BATTERY_SAVER_SETTINGS() {
    intent.setAction("android.settings.BATTERY_SAVER_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_BLUETOOTH_SETTINGS() {
    intent.setAction("android.settings.BLUETOOTH_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_CAPTIONING_SETTINGS() {
    intent.setAction("android.settings.CAPTIONING_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_CAST_SETTINGS() {
    intent.setAction("android.settings.CAST_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_CHANNEL_NOTIFICATION_SETTINGS(String packageName, String chanelID) {
    intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
    intent.putExtra("android.provider.extra.CHANNEL_ID", chanelID);
    putExtraPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_DATA_ROAMING_SETTINGS() {
    intent.setAction("android.settings.DATA_ROAMING_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_DATE_SETTINGS() {
    intent.setAction("android.settings.DATE_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_DEVICE_INFO_SETTINGS() {
    intent.setAction("android.settings.DEVICE_INFO_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_DISPLAY_SETTINGS() {
    intent.setAction("android.settings.DISPLAY_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_DREAM_SETTINGS() {
    intent.setAction("android.settings.DREAM_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_FINGERPRINT_ENROLL() {
    intent.setAction("android.settings.FINGERPRINT_ENROLL");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_HARD_KEYBOARD_SETTINGS() {
    intent.setAction("android.settings.HARD_KEYBOARD_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_HOME_SETTINGS() {
    intent.setAction("android.settings.HOME_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS(String packageName) {
    intent.setAction("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS() {
    intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_INPUT_METHOD_SETTINGS() {
    intent.setAction("android.settings.INPUT_METHOD_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_INPUT_METHOD_SUBTYPE_SETTINGS() {
    intent.setAction("android.settings.INPUT_METHOD_SUBTYPE_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_INTERNAL_STORAGE_SETTINGS() {
    intent.setAction("android.settings.INTERNAL_STORAGE_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_LOCALE_SETTINGS() {
    intent.setAction("android.settings.LOCALE_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_LOCATION_SOURCE_SETTINGS() {
    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS() {
    intent.setAction("android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_MANAGE_APPLICATIONS_SETTINGS() {
    intent.setAction("android.settings.MANAGE_APPLICATIONS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_MANAGE_DEFAULT_APPS_SETTINGS() {
    intent.setAction("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_MANAGE_OVERLAY_PERMISSION(String packageName) {
    intent.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_MANAGE_UNKNOWN_APP_SOURCES(String packageName) {
    intent.setAction("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_MANAGE_WRITE_SETTINGS(String packageName) {
    intent.setAction("android.settings.action.MANAGE_WRITE_SETTINGS");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_MEMORY_CARD_SETTINGS() {
    intent.setAction("android.settings.MEMORY_CARD_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NETWORK_OPERATOR_SETTINGS() {
    intent.setAction("android.settings.NETWORK_OPERATOR_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NFCSHARING_SETTINGS() {
    intent.setAction("android.settings.NFCSHARING_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NFC_PAYMENT_SETTINGS() {
    intent.setAction("android.settings.NFC_PAYMENT_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NFC_SETTINGS() {
    intent.setAction("android.settings.NFC_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NIGHT_DISPLAY_SETTINGS() {
    intent.setAction("android.settings.NIGHT_DISPLAY_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_ASSISTANT_SETTINGS() {
    intent.setAction("android.settings.NOTIFICATION_ASSISTANT_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_LISTENER_SETTINGS() {
    intent.setAction("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS() {
    intent.setAction("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_PRINT_SETTINGS() {
    intent.setAction("android.settings.ACTION_PRINT_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_PRIVACY_SETTINGS() {
    intent.setAction("android.settings.PRIVACY_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_QUICK_LAUNCH_SETTINGS() {
    intent.setAction("android.settings.QUICK_LAUNCH_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS(String packageName) {
    String _packageName = packageName;
    if (isNullOrEmpty(packageName)) {
      _packageName = reactContext.getPackageName();
    }

    PowerManager pm = (PowerManager) reactContext.getSystemService(reactContext.POWER_SERVICE);
    if (pm.isIgnoringBatteryOptimizations(_packageName)) {
      intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
      startActivityForResult();
    } else {
      intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
      setDataPackageStartActivityForResult(_packageName);
    }
  }

  @ReactMethod
  public void ACTION_REQUEST_SET_AUTOFILL_SERVICE(String packageName) {
    intent.setAction("android.settings.REQUEST_SET_AUTOFILL_SERVICE");
    setDataPackageStartActivityForResult(packageName);
  }

  @ReactMethod
  public void ACTION_SEARCH_SETTINGS() {
    intent.setAction("android.search.action.SEARCH_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_SECURITY_SETTINGS() {
    intent.setAction("android.settings.SECURITY_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_SOUND_SETTINGS() {
    intent.setAction("android.settings.SOUND_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_SYNC_SETTINGS() {
    intent.setAction("android.settings.SYNC_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_USAGE_ACCESS_SETTINGS() {
    intent.setAction("android.settings.USAGE_ACCESS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_USER_DICTIONARY_SETTINGS() {
    intent.setAction("android.settings.USER_DICTIONARY_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_VOICE_INPUT_SETTINGS() {
    intent.setAction("android.settings.VOICE_INPUT_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_VPN_SETTINGS() {
    intent.setAction("android.settings.VPN_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_VR_LISTENER_SETTINGS() {
    intent.setAction("android.settings.VR_LISTENER_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_WEBVIEW_SETTINGS() {
    intent.setAction("android.settings.WEBVIEW_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_WIFI_IP_SETTINGS() {
    intent.setAction("android.settings.WIFI_IP_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_WIFI_SETTINGS() {
    intent.setAction("android.settings.WIFI_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_WIRELESS_SETTINGS() {
    intent.setAction("android.settings.WIRELESS_SETTINGS");
    startActivityForResult();
  }

  @ReactMethod
  public void ACTION_ZEN_MODE_PRIORITY_SETTINGS() {
    intent.setAction("android.settings.ZEN_MODE_PRIORITY_SETTINGS");
    startActivityForResult();
  }

}
