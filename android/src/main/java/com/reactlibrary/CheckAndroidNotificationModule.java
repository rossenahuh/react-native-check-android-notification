package com.reactlibrary;

import android.support.v4.app.NotificationManagerCompat;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;

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
}
