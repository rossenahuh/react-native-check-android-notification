# react-native-check-android-notification

## Getting started

`$ npm install react-native-check-android-notification --save`

### Mostly automatic installation

`$ react-native link react-native-check-android-notification`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-check-android-notification` and add `CheckAndroidNotification.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libCheckAndroidNotification.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.CheckAndroidNotificationPackage;` to the imports at the top of the file
  - Add `new CheckAndroidNotificationPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-check-android-notification'
  	project(':react-native-check-android-notification').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-check-android-notification/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-check-android-notification')
  	```


## Usage
```javascript
import CheckAndroidNotification from 'react-native-check-android-notification';

// TODO: What to do with the module?
CheckAndroidNotification;
```
