package com.bignerdranch.android.gettreasure;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Administrator on 2017/4/25/025.
 */

public class ImageBottom {
    private static final String TAG = "ImageBottom";
    private static final String IMG_FOLDER = "sample_img";
    private AssetManager mAssetManager;
    public ImageBottom(Context context) {
        mAssetManager = context.getAssets();
        loadImg();
    }
    private void loadImg() {
        String[] imgName;
        try{
            imgName = mAssetManager.list(IMG_FOLDER);
            Log.i(TAG, "loadImg: " + imgName.length);
        } catch (IOException e) {
            Log.e(TAG, "loadImg: no list", e);
            return;
        }
    }
}
