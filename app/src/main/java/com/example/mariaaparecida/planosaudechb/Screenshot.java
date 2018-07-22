package com.example.mariaaparecida.planosaudechb;

import android.graphics.Bitmap;
import android.view.View;

/**
 * Created by Maria Aparecida on 13/05/2018.
 */

public class Screenshot {

    public static Bitmap takescreenshot(View v) {
        v.setDrawingCacheEnabled(true);
        v.buildDrawingCache(true);
        Bitmap b = Bitmap.createBitmap(v.getDrawingCache());
        return b;
    }

    public static
    Bitmap  takescreenshotOfRootView(View v){
        return takescreenshot(v.getRootView());
    }

}
