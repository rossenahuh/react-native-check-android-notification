package com.reactlibrary;

import androidx.core.app.NotificationManagerCompat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CheckAndroidNotificationModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public CheckAndroidNotificationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "CheckAndroidNotification";
    }

    private WritableMap internalCheckNotifications() {
        final ReactApplicationContext reactContext = getReactApplicationContext();
        final boolean enabled = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        final WritableMap map = Arguments.createMap();

        if (enabled) {
        map.putString("status", "granted");
        } else {
        map.putString("status", "denied");
        }
    }

    @ReactMethod
    public void checkNotifications(final Promise promise) {
        promise.resolve(internalCheckNotifications());
    }

    @ReactMethod
    public void requestNotifications(ReadableArray options, final Promise promise) {
        promise.resolve(internalCheckNotifications());
    }
}
