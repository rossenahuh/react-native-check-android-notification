import { NativeModules } from "react-native";

const { CheckAndroidNotification } = NativeModules;

export function checkNotifications(): Promise<String> {
  console.log(CheckAndroidNotification);
  return CheckAndroidNotification.checkNotifications();
}

export default CheckAndroidNotification;
