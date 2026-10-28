# NT42-project
Personal project for NT42 prenatal care app

## Navigation preview

Run the app and tap **Preview app** on the welcome screen. The bottom bar
contains Profile, Reminders, Chat, Tips, and Trivia. Each tab opens a placeholder
screen; authentication and feature data are not connected. The selected tab uses
the darker burgundy background from the navigation reference.

Back returns to Profile from another tab, then exits the preview. **Exit preview**
also returns to the welcome screen. The selected tab survives activity recreation.

Compose previews are available in `MainNavigationScreen.kt`, including a bar with
Reminders selected to match the reference image.

Validation commands (requires an Android SDK and Gradle dependency access):

```sh
./gradlew :app:assembleDebug :app:lintDebug
./gradlew :app:connectedDebugAndroidTest
```

To show the Android app on an iPhone, record a walkthrough in the Android
emulator and transfer an iPhone-compatible video. An APK cannot be installed on
iOS; an interactive Safari demo would require a separate web interface.
