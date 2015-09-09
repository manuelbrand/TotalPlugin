package com.wazzurb.invite;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.FacebookSdk;
import com.facebook.share.model.AppInviteContent;
import com.facebook.share.widget.AppInviteDialog;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

// TODO: PLUGIN SHOULD HANDLE: pause(), resume() and msg passing ( and possibly onReset() )


public class InvitePlugin extends CordovaPlugin {

    private String previewImagePath = "http://wzzrb.nl/appinvite/1.png"; // 1-2-3-4.png
    private String AppDownloadUrl = "https://fb.me/400072263520020";
    private Activity activity;

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        activity = cordova.getActivity();

    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        System.out.println("execute initiated");
        CordovaArgs cordovaArgs = new CordovaArgs(args);

        if (action.equals("invite")) {
            if (AppInviteDialog.canShow()) {
                System.out.println("invite launched");
                AppInviteContent content = new AppInviteContent.Builder()
                        .setApplinkUrl(AppDownloadUrl)
                        .setPreviewImageUrl(previewImagePath)
                        .build();
                AppInviteDialog.show(activity, content);
            }
            return true;
        }

        return false;
    }

}
