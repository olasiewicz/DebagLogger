package wojtek_libs_example.library.com.errorlib;

import android.util.Log;

/**
 * Created by wool on 2018-03-05.
 */

public class ErrorLog {
    
    public static String TAG = ErrorLog.class.getName();
    
    public static void e(String message) {
        Log.e(TAG, message);
    }
}
