import { NativeModules } from "react-native";

const { CheckAndroidNotification } = NativeModules;

export function checkNotifications(): Promise<String> {
  return CheckAndroidNotification.checkNotifications();
}

export default CheckAndroidNotification;
