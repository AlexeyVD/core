## Building with JitPack
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

```gradle
dependencies {
    implementation 'com.github.AlexeyVD:core:0.0.2'
}
