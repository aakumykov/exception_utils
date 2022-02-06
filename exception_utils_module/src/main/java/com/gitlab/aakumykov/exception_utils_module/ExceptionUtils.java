package com.gitlab.aakumykov.exception_utils_module;

import android.text.TextUtils;

import androidx.annotation.Nullable;

public class ExceptionUtils {

    private ExceptionUtils() {}

    public static String getErrorMessage(@Nullable Throwable throwable) {

        if (null == throwable)
            return "null";

        String errorMsg = throwable.getMessage();

        return (null == errorMsg || TextUtils.isEmpty(errorMsg.trim())) ?
                throwable.getClass().getName() :
                errorMsg;
    }
}
