package com.udacity.firebase.shoppinglistplusplus;


/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /* Initialize Firebase */
        // Don't need the following line for the new API. remove this.
        //Firebase.setAndroidContext(this);
    }

}