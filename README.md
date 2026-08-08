# SohamAI

Production-oriented Android foundation for **SohamAI**.

- Kotlin
- Jetpack Compose + Material 3
- Android Gradle Plugin 9.1.1
- Gradle 9.3.1 in GitHub Actions
- JDK 17
- Application ID: `com.aistudio.sohamai.app`

## GitHub Actions

The workflow at `.github/workflows/android-build.yml` runs on pushes to `main`, pull requests, or manual dispatch.

It:
1. Sets up JDK 17.
2. Sets up Gradle 9.3.1.
3. Runs unit tests.
4. Builds a debug APK.
5. Builds a release AAB.
6. Uploads both artifacts to the workflow run.

## Important

This repository deliberately contains **no API keys or private credentials**. The current app is a real UI/build foundation; it does not claim that a production AI backend is connected yet.

For a production AI assistant, connect the Android app to a secure backend. Do not put OpenAI/Gemini/provider secrets in the APK or GitHub source.

## Local build

A local machine needs JDK 17 and Gradle 9.3.1 (or a compatible Gradle installation). Then:

```bash
gradle test
gradle :app:assembleDebug
gradle :app:bundleRelease
```

## GitHub artifacts

After a successful Actions run, open the workflow run and download:

- `SohamAI-debug-APK`
- `SohamAI-release-AAB`

The release AAB produced by this starter project is not configured with a Play Console upload signing key. Add secure signing through GitHub Actions secrets/Android signing configuration before publishing to Google Play.
