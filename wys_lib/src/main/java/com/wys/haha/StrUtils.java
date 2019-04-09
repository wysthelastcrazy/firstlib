package com.wys.haha;

/**
 * Created by yas on 2019/4/9
 * Describe:
 */
public class StrUtils {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
