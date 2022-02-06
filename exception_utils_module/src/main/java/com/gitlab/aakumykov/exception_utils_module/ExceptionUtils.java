package com.gitlab.aakumykov.exception_utils_module;

import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ExceptionUtils {

    private ExceptionUtils() {}

    @Deprecated
    public static String getErrorFromException(@NonNull Exception e) {

        return getErrorMessage(e);
    }

    public static String getErrorMessage(@Nullable Throwable throwable) {

        if (null == throwable)
            return "null";

        String errorMsg = throwable.getMessage();

        return (null == errorMsg || TextUtils.isEmpty(errorMsg.trim())) ?
                throwable.getClass().getName() :
                errorMsg;
    }

    public static void printException(@NonNull String tag, @NonNull Exception e) {
        String errorMsg = ExceptionUtils.getErrorFromException(e);
        Log.e(tag, errorMsg, e);
    }
}
