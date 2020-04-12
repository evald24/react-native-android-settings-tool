declare module "react-native-android-settings-tool" {
  /**
   * Show system settings.
   */
  function ACTION_SETTINGS(): void;

  /**
   * Show notification settings for a single app.
   *
   * `null` is your app
   * ```
   *  ACTION_APP_NOTIFICATION_SETTINGS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_APP_NOTIFICATION_SETTINGS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_APP_NOTIFICATION_SETTINGS(packageName: string | null): void;

  /**
   * Show notification bubble settings for a single app.
   *
   * `null` is your app
   * ```
   *  ACTION_APP_NOTIFICATION_SETTINGS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_APP_NOTIFICATION_SETTINGS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_APP_NOTIFICATION_BUBBLE_SETTINGS(packageName: string | null): void;

  /**
   * Show screen of details about a particular application.
   *
   * `null` is your app
   * ```
   *  ACTION_APPLICATION_DETAILS_SETTINGS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_APPLICATION_DETAILS_SETTINGS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_APPLICATION_DETAILS_SETTINGS(packageName: string | null): void;

  /**
   * Show battery saver settings.
   */
  function ACTION_BATTERY_SAVER_SETTINGS(): void;

  /**
   * Show settings to allow configuration of Bluetooth.
   */
  function ACTION_BLUETOOTH_SETTINGS(): void;

  /**
   * Show settings for video captioning.
   */
  function ACTION_CAPTIONING_SETTINGS(): void;

  /**
   * Show settings to allow configuration of cast endpoints.
   */
  function ACTION_CAST_SETTINGS(): void;

  /**
   * Show notification settings for a single NotificationChannel.
   *
   * `null` is your app, `"123"` is notification channel ID
   * ```
   *  ACTION_CHANNEL_NOTIFICATION_SETTINGS(null, "123");
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_CHANNEL_NOTIFICATION_SETTINGS("com.instagram.android", "123");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   * @param  { string } chanelID "123"
   */
  function ACTION_CHANNEL_NOTIFICATION_SETTINGS(packageName: string | null, chanelID: string): void;

  /**
   * Show settings for selection of 2G/3G.
   */
  function ACTION_DATA_ROAMING_SETTINGS(): void;

  /**
   * Show settings to allow configuration of date and time.
   */
  function ACTION_DATE_SETTINGS(): void;

  /**
   * Show general device information settings (serial number, software version, phone number, etc.).
   */
  function ACTION_DEVICE_INFO_SETTINGS(): void;

  /**
   * Show settings to allow configuration of display.
   */
  function ACTION_DISPLAY_SETTINGS(): void;

  /**
   * Show Daydream settings.
   */
  function ACTION_DREAM_SETTINGS(): void;

  /**
   * Show settings to enroll fingerprints, and setup PIN/Pattern/Pass if necessary.
   */
  function ACTION_FINGERPRINT_ENROLL(): void;

  /**
   * Show settings to configure the hardware keyboard.
   */
  function ACTION_HARD_KEYBOARD_SETTINGS(): void;

  /**
   * Show Home selection settings.
   */
  function ACTION_HOME_SETTINGS(): void;

  /**
   * Show screen for controlling background data restrictions for a particular application.
   *
   * `null` is your app
   * ```
   *  ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS(packageName: string | null): void;

  /**
   * Show screen for controlling which apps can ignore battery optimizations.
   */
  function ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS(): void;

  /**
   * Show settings to configure input methods, in particular allowing the user to enable input methods.
   */
  function ACTION_INPUT_METHOD_SETTINGS(): void;

  /**
   * Show settings to enable/disable input method subtypes.
   */
  function ACTION_INPUT_METHOD_SUBTYPE_SETTINGS(): void;

  /**
   * Show settings for internal storage.
   */
  function ACTION_INTERNAL_STORAGE_SETTINGS(): void;

  /**
   * Show settings to allow configuration of locale.
   */
  function ACTION_LOCALE_SETTINGS(): void;

  /**
   * Show settings to allow configuration of current location sources.
   */
  function ACTION_LOCATION_SOURCE_SETTINGS(): void;

  /**
   * Show settings to manage all applications.
   */
  function ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS(): void;

  /**
   * Show settings to manage installed applications.
   */
  function ACTION_MANAGE_APPLICATIONS_SETTINGS(): void;

  /**
   * Show Default apps settings.
   */
  function ACTION_MANAGE_DEFAULT_APPS_SETTINGS(): void;

  /**
   * Show screen for controlling which apps can draw on top of other apps.
   *
   * `null` is your app
   * ```
   *  ACTION_MANAGE_OVERLAY_PERMISSION(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_MANAGE_OVERLAY_PERMISSION("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_MANAGE_OVERLAY_PERMISSION(packageName: string | null): void;

  /**
   * Show settings to allow configuration of trusted external sources.
   *
   * `null` is your app
   * ```
   *  ACTION_MANAGE_UNKNOWN_APP_SOURCES(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_MANAGE_UNKNOWN_APP_SOURCES("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_MANAGE_UNKNOWN_APP_SOURCES(packageName: string | null): void;

  /**
   * Show screen for controlling which apps are allowed to write/modify system settings.
   *
   * `null` is your app
   * ```
   *  ACTION_MANAGE_WRITE_SETTINGS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_MANAGE_WRITE_SETTINGS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_MANAGE_WRITE_SETTINGS(packageName: string | null): void;

  /**
   * Show settings for memory card storage.
   */
  function ACTION_MEMORY_CARD_SETTINGS(): void;

  /**
   * Show settings for selecting the network operator.
   */
  function ACTION_NETWORK_OPERATOR_SETTINGS(): void;

  /**
   * Show NFC Sharing settings. This shows UI that allows NDEF Push (Android Beam) to be turned on or off.
   */
  function ACTION_NFCSHARING_SETTINGS(): void;

  /**
   * Show NFC Tap & Pay settings. This shows UI that allows the user to configure Tap&Pay settings.
   */
  function ACTION_NFC_PAYMENT_SETTINGS(): void;

  /**
   * Show NFC settings. This shows UI that allows NFC to be turned on or off.
   */
  function ACTION_NFC_SETTINGS(): void;

  /**
   * Show settings to allow configuration of Night display.
   */
  function ACTION_NIGHT_DISPLAY_SETTINGS(): void;

  /**
   * Show Notification assistant settings.
   */
  function ACTION_NOTIFICATION_ASSISTANT_SETTINGS(): void;

  /**
   * Show Notification listener settings.
   */
  function ACTION_NOTIFICATION_LISTENER_SETTINGS(): void;

  /**
   * Show Do Not Disturb access settings.
   */
  function ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS(): void;

  /**
   * Show the top level print settings.
   */
  function ACTION_PRINT_SETTINGS(): void;

  /**
   * Show settings to allow configuration of privacy options.
   */
  function ACTION_PRIVACY_SETTINGS(): void;

  /**
   * Show settings to allow configuration of quick launch shortcuts.
   */
  function ACTION_QUICK_LAUNCH_SETTINGS(): void;

  /**
   * Ask the user to allow an app to ignore battery optimizations.
   *
   * `null` is your app
   * ```
   *  ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS(packageName: string | null): void;

  /**
   * Show screen that let user select its Autofill Service.
   *
   * `null` is your app
   * ```
   *  ACTION_REQUEST_SET_AUTOFILL_SERVICE(null);
   * ```
   * or other app (ex. `"com.instagram.android"` is Instagram app)
   * ```
   *  ACTION_REQUEST_SET_AUTOFILL_SERVICE("com.instagram.android");
   * ```
   * @param  { (string | null) } packageName "com.my.app"
   */
  function ACTION_REQUEST_SET_AUTOFILL_SERVICE(packageName: string | null): void;

  /**
   * Show settings for global search.
   */
  function ACTION_SEARCH_SETTINGS(): void;

  /**
   * Show settings to allow configuration of security and location privacy.
   */
  function ACTION_SECURITY_SETTINGS(): void;

  /**
   * Show settings to allow configuration of sound and volume.
   */
  function ACTION_SOUND_SETTINGS(): void;

  /**
   * Show settings to allow configuration of sync settings.
   */
  function ACTION_SYNC_SETTINGS(): void;

  /**
   * Show settings to control access to usage information.
   */
  function ACTION_USAGE_ACCESS_SETTINGS(): void;

  /**
   * Show settings to manage the user input dictionary.
   */
  function ACTION_USER_DICTIONARY_SETTINGS(): void;

  /**
   * Show settings to configure input methods, in particular allowing the user to enable input methods.
   */
  function ACTION_VOICE_INPUT_SETTINGS(): void;

  /**
   * Show settings to allow configuration of VPN.
   */
  function ACTION_VPN_SETTINGS(): void;

  /**
   * Show VR listener settings.
   */
  function ACTION_VR_LISTENER_SETTINGS(): void;

  /**
   * Allows user to select current webview implementation.
   */
  function ACTION_WEBVIEW_SETTINGS(): void;

  /**
   * Show settings to allow configuration of a static IP address for Wi-Fi.
   */
  function ACTION_WIFI_IP_SETTINGS(): void;

  /**
   * Show settings to allow configuration of Wi-Fi.
   */
  function ACTION_WIFI_SETTINGS(): void;

  /**
   * Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks.
   */
  function ACTION_WIRELESS_SETTINGS(): void;

  /**
   * Show Zen Mode (aka Do Not Disturb) priority configuration settings.
   */
  function ACTION_ZEN_MODE_PRIORITY_SETTINGS(): void;
}
