package com.indiworks.capstonereality;

import android.app.Application;
import android.util.Log;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.analytics.AnalyticsEvent;
import com.amplifyframework.analytics.pinpoint.AWSPinpointAnalyticsPlugin;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;

public class MyAmplifyApp extends Application {
    AnalyticsEvent event = AnalyticsEvent.builder()
            .name("PasswordReset")
            .addProperty("Channel", "SMS")
            .addProperty("Successful", true)
            .addProperty("ProcessDuration", 792)
            .addProperty("UserAge", 120.3)
            .build();


    public void onCreate() {
        super.onCreate();

        try {
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(new AWSPinpointAnalyticsPlugin(this));
            Amplify.configure(getApplicationContext());
            Log.i("MyAmplifyApp", "Initialized Amplify");
        } catch (AmplifyException error) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error);
        }
        Amplify.Analytics.recordEvent(event);
    }
}
