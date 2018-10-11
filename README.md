# LatihanMVP
Calculator Example With MVP. This app is an easy example of MVP.

---
## Screenshot

![1](https://raw.githubusercontent.com/farrasdoko/LatihanMVP/master/Screenshot/1.png) ![2](https://raw.githubusercontent.com/farrasdoko/LatihanMVP/master/Screenshot/2.png)
![3](https://raw.githubusercontent.com/farrasdoko/LatihanMVP/master/Screenshot/3.png) ![4](https://raw.githubusercontent.com/farrasdoko/LatihanMVP/master/Screenshot/4.png)
![3](https://raw.githubusercontent.com/farrasdoko/LatihanMVP/master/Screenshot/5.png)

---
## Gradle

apply plugin: 'com.android.application'

android {

    compileSdkVersion 28
    defaultConfig {
        applicationId "com.farrasabiyyu12.latihanmvp"
        minSdkVersion 15
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {

    implementation fileTree(include: ['*.jar'], dir: 'libs')
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    implementation 'com.android.support:design:28.0.0'
    
}

---

## Contact

* Instagram : [farrasdoko](https://instagram.com/farrasdoko)
* facebook : [farrasdoko](https://facebook.com/farras.abiyyu.31)
* Email : farras.abiyyu.doko@gmail.com
