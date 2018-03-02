package wojtek_libs_example.library.com.debugloglibrary;

import android.util.Log;

/**
 * Created by wool on 2018-03-02.
 */

public class DebugLog {

    public static String TAG = DebugLog.class.getName();
    
    public static void d(String message) {
        Log.d(TAG, message);
    }
    
    
}
