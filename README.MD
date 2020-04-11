<div align="center">
  <h1>react-native-android-settings-tool</h1>
  <a href="#description">Description</a>
  <span>&nbsp;&nbsp;•&nbsp;&nbsp;</span>
  <a href="#installation">Installation</a>
  <span>&nbsp;&nbsp;•&nbsp;&nbsp;</span>
  <a href="#usage">Usage</a>
  <span>&nbsp;&nbsp;•&nbsp;&nbsp;</span>
  <a href="#expamles">Expamles</a>
  <span>&nbsp;&nbsp;•&nbsp;&nbsp;</span>
  <a href="#docs">Docs</a>
</div>

![NPM version](https://img.shields.io/npm/v/react-native-android-settings-tool?color=green) ![NPM version](https://img.shields.io/npm/l/react-native-android-settings-tool?color=green)

## Description

[React Native](https://facebook.github.io/react-native/) module to open settings screen in Android and more.

## Installation

1. `npm install react-native-android-settings-tool`
2. `react-native link react-native-android-settings-tool`

## Usage

Require the `react-native-android-settings-tool` module.

```ts
import RNAndroidSettings from "react-native-android-settings-tool";

RNAndroidSettings.ACTION_SETTINGS(); // Open the main settings screen.
```

## Expamles

Show notification settings:

```ts
import RNAndroidSettings from "react-native-android-settings-tool";

//In some cases, a matching Activity may not exist, so ensure you safeguard against this
try {
  // "null" is your app
  RNAndroidSettings.ACTION_APP_NOTIFICATION_SETTINGS(null); // Show notification settings for your app.
  // or other app (ex. Facebook)
  RNAndroidSettings.ACTION_APP_NOTIFICATION_SETTINGS("com.facebook.katana"); // Show notification settings for another package name "com.facebook.katana" NotificationChannel with id 123.
} catch (e) {
  // your code
}
```

Show notification channel settings:

```ts
import RNAndroidSettings from "react-native-android-settings-tool";

//In some cases, a matching Activity may not exist, so ensure you safeguard against this
try {
  // "null" is your app
  RNAndroidSettings.ACTION_CHANNEL_NOTIFICATION_SETTINGS(null, "123"); // Show notification settings for your app NotificationChannel with id 123.
  // or other app (ex. Instagram)
  RNAndroidSettings.ACTION_CHANNEL_NOTIFICATION_SETTINGS("com.instagram.android", "123"); // Show notification settings for another package name "com.instagram.android" NotificationChannel with id 123.
} catch (e) {
  // your code
}
```

Show application details screen:

```ts
import RNAndroidSettings from "react-native-android-settings-tool";

try {
  // "null" is your app
  RNAndroidSettings.ACTION_APPLICATION_DETAILS_SETTINGS(null); // Show screen of details about your application.
  // or other app (ex. Google Chrome)
  RNAndroidSettings.ACTION_APPLICATION_DETAILS_SETTINGS("com.android.chrome"); // Show screen details of about for another package name "com.android.chrome".
} catch (e) {
  // your code
}
```

## Docs

### Functions

| Functions                                                           | Description                                                                                             |                                                           Read more                                                           |
| :------------------------------------------------------------------ | :------------------------------------------------------------------------------------------------------ | :---------------------------------------------------------------------------------------------------------------------------: |
| `ACTION_SETTINGS();`                                                | Show system settings.                                                                                   |                   [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_SETTINGS)                   |
| `ACTION_APP_NOTIFICATION_SETTINGS(packageName);`                    | Show notification settings for a single app.                                                            |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_APP_NOTIFICATION_SETTINGS)           |
| `ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS(packageName);`             | Show notification bubble settings for a single app.                                                     |       [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS)       |
| `ACTION_APPLICATION_DETAILS_SETTINGS(packageName);`                 | Show screen of details about a particular application.                                                  |         [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_APPLICATION_DETAILS_SETTINGS)         |
| `ACTION_BATTERY_SAVER_SETTINGS();`                                  | Show battery saver settings.                                                                            |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_BATTERY_SAVER_SETTINGS)            |
| `ACTION_BLUETOOTH_SETTINGS();`                                      | Show settings to allow configuration of Bluetooth.                                                      |              [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_BLUETOOTH_SETTINGS)              |
| `ACTION_CAPTIONING_SETTINGS();`                                     | Show settings for video captioning.                                                                     |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_CAPTIONING_SETTINGS)              |
| `ACTION_CAST_SETTINGS();`                                           | Show settings to allow configuration of cast endpoints.                                                 |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_CAST_SETTINGS)                 |
| `ACTION_CHANNEL_NOTIFICATION_SETTINGS(packageName, chanelID);`      | Show notification settings for a single NotificationChannel.                                            |        [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_CHANNEL_NOTIFICATION_SETTINGS)         |
| `ACTION_DATA_ROAMING_SETTINGS();`                                   | Show settings for selection of 2G/3G.                                                                   |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_DATA_ROAMING_SETTINGS)             |
| `ACTION_DATE_SETTINGS();`                                           | Show settings to allow configuration of date and time.                                                  |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_DATE_SETTINGS)                 |
| `ACTION_DEVICE_INFO_SETTINGS();`                                    | Show general device information settings (serial number, software version, phone number, etc.).         |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_DEVICE_INFO_SETTINGS)             |
| `ACTION_DISPLAY_SETTINGS();`                                        | Show settings to allow configuration of display.                                                        |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_DISPLAY_SETTINGS)               |
| `ACTION_DREAM_SETTINGS();`                                          | Show Daydream settings.                                                                                 |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_DREAM_SETTINGS)                |
| `ACTION_FINGERPRINT_ENROLL();`                                      | Show settings to enroll fingerprints, and setup PIN/Pattern/Pass if necessary.                          |              [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_FINGERPRINT_ENROLL)              |
| `ACTION_HARD_KEYBOARD_SETTINGS();`                                  | Show settings to configure the hardware keyboard.                                                       |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_HARD_KEYBOARD_SETTINGS)            |
| `ACTION_HOME_SETTINGS();`                                           | Show Home selection settings.                                                                           |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_HOME_SETTINGS)                 |
| `ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS(packageName);` | Show screen for controlling background data restrictions for a your application.                        | [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS) |
| `ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS();`                    | Show screen for controlling which apps can ignore battery optimizations.                                |     [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS)     |
| `ACTION_INPUT_METHOD_SETTINGS();`                                   | Show settings to configure input methods, in particular allowing the user to enable input methods.      |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_INPUT_METHOD_SETTINGS)             |
| `ACTION_INPUT_METHOD_SUBTYPE_SETTINGS();`                           | Show settings to enable/disable input method subtypes.                                                  |        [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_INPUT_METHOD_SUBTYPE_SETTINGS)         |
| `ACTION_INTERNAL_STORAGE_SETTINGS();`                               | Show settings for internal storage.                                                                     |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_INTERNAL_STORAGE_SETTINGS)           |
| `ACTION_LOCALE_SETTINGS();`                                         | Show settings to allow configuration of locale.                                                         |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_LOCALE_SETTINGS)                |
| `ACTION_LOCATION_SOURCE_SETTINGS();`                                | Show settings to allow configuration of current location sources.                                       |           [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_LOCATION_SOURCE_SETTINGS)           |
| `ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS();`                        | Show settings to manage all applications.                                                               |       [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS)       |
| `ACTION_MANAGE_APPLICATIONS_SETTINGS();`                            | Show settings to manage installed applications.                                                         |         [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_APPLICATIONS_SETTINGS)         |
| `ACTION_MANAGE_DEFAULT_APPS_SETTINGS();`                            | Show Default apps settings.                                                                             |         [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_DEFAULT_APPS_SETTINGS)         |
| `ACTION_MANAGE_OVERLAY_PERMISSION(packageName);`                    | Show screen for controlling which apps can draw on top of other apps.                                   |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_OVERLAY_PERMISSION)           |
| `ACTION_MANAGE_UNKNOWN_APP_SOURCES(packageName);`                   | Show settings to allow configuration of trusted external sources.                                       |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_UNKNOWN_APP_SOURCES)          |
| `ACTION_MANAGE_WRITE_SETTINGS(packageName);`                        | Show screen for controlling which apps are allowed to write/modify system settings.                     |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MANAGE_WRITE_SETTINGS)             |
| `ACTION_MEMORY_CARD_SETTINGS();`                                    | Show settings for memory card storage.                                                                  |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_MEMORY_CARD_SETTINGS)             |
| `ACTION_NETWORK_OPERATOR_SETTINGS();`                               | Show settings for selecting the network operator.                                                       |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NETWORK_OPERATOR_SETTINGS)           |
| `ACTION_NFCSHARING_SETTINGS();`                                     | Show NFC Sharing settings. This shows UI that allows NDEF Push (Android Beam) to be turned on or off.   |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NFCSHARING_SETTINGS)              |
| `ACTION_NFC_PAYMENT_SETTINGS();`                                    | Show NFC Tap & Pay settings. This shows UI that allows the user to configure Tap&Pay settings.          |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NFC_PAYMENT_SETTINGS)             |
| `ACTION_NFC_SETTINGS();`                                            | Show NFC settings. This shows UI that allows NFC to be turned on or off.                                |                 [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NFC_SETTINGS)                 |
| `ACTION_NIGHT_DISPLAY_SETTINGS();`                                  | Show settings to allow configuration of Night display.                                                  |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NIGHT_DISPLAY_SETTINGS)            |
| `ACTION_NOTIFICATION_ASSISTANT_SETTINGS();`                         | Show Notification assistant settings.                                                                   |       [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NOTIFICATION_ASSISTANT_SETTINGS)        |
| `ACTION_NOTIFICATION_LISTENER_SETTINGS();`                          | Show Notification listener settings.                                                                    |        [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NOTIFICATION_LISTENER_SETTINGS)        |
| `ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS();`                     | Show Do Not Disturb access settings.                                                                    |     [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS)      |
| `ACTION_PRINT_SETTINGS();`                                          | Show the top level print settings.                                                                      |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_PRINT_SETTINGS)                |
| `ACTION_PRIVACY_SETTINGS();`                                        | Show settings to allow configuration of privacy options.                                                |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_PRIVACY_SETTINGS)               |
| `ACTION_QUICK_LAUNCH_SETTINGS();`                                   | Show settings to allow configuration of quick launch shortcuts.                                         |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_QUICK_LAUNCH_SETTINGS)             |
| `ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS(packageName);`         | Ask the user to allow an app to ignore battery optimizations.                                           |     [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)     |
| `ACTION_REQUEST_SET_AUTOFILL_SERVICE(packageName);`                 | Show screen that let user select its Autofill Service.                                                  |         [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_REQUEST_SET_AUTOFILL_SERVICE)         |
| `ACTION_SEARCH_SETTINGS();`                                         | Show settings for global search.                                                                        |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_SEARCH_SETTINGS)                |
| `ACTION_SECURITY_SETTINGS();`                                       | Show settings to allow configuration of security and location privacy.                                  |              [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_SECURITY_SETTINGS)               |
| `ACTION_SOUND_SETTINGS();`                                          | Show settings to allow configuration of sound and volume.                                               |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_SOUND_SETTINGS)                |
| `ACTION_SYNC_SETTINGS();`                                           | Show settings to allow configuration of sync settings.                                                  |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_SYNC_SETTINGS)                 |
| `ACTION_USAGE_ACCESS_SETTINGS();`                                   | Show settings to control access to usage information.                                                   |            [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_USAGE_ACCESS_SETTINGS)             |
| `ACTION_USER_DICTIONARY_SETTINGS();`                                | Show settings to manage the user input dictionary.                                                      |           [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_USER_DICTIONARY_SETTINGS)           |
| `ACTION_VOICE_INPUT_SETTINGS();`                                    | Show settings to configure input methods, in particular allowing the user to enable input methods.      |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_VOICE_INPUT_SETTINGS)             |
| `ACTION_VPN_SETTINGS();`                                            | Show settings to allow configuration of VPN.                                                            |                 [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_VPN_SETTINGS)                 |
| `ACTION_VR_LISTENER_SETTINGS();`                                    | Show VR listener settings.                                                                              |             [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_VR_LISTENER_SETTINGS)             |
| `ACTION_WEBVIEW_SETTINGS();`                                        | Allows user to select current webview implementation.                                                   |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_WEBVIEW_SETTINGS)               |
| `ACTION_WIFI_IP_SETTINGS();`                                        | Show settings to allow configuration of a static IP address for Wi-Fi.                                  |               [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_WIFI_IP_SETTINGS)               |
| `ACTION_WIFI_SETTINGS();`                                           | Show settings to allow configuration of Wi-Fi.                                                          |                [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_WIFI_SETTINGS)                 |
| `ACTION_WIRELESS_SETTINGS();`                                       | Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks. |              [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_WIRELESS_SETTINGS)               |
| `ACTION_ZEN_MODE_PRIORITY_SETTINGS();`                              | Show Zen Mode (aka Do Not Disturb) priority configuration settings.                                     |          [Link](https://developer.android.com/reference/android/provider/Settings#ACTION_ZEN_MODE_PRIORITY_SETTINGS)          |

### Parameters

| Name        | Type               | Description                                  |
| :---------- | :----------------- | :------------------------------------------- |
| packageName | `String` or `null` | ex. `"com.my.app"` <br/> `null` is your app. |
| chanelID    | `String`           | Notification chanel ID. <br/> ex. `"123"`    |
