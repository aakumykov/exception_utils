package com.gitlab.aakumykov.exception_utils_module;

public class Log {

    public static void e(String TAG, Throwable tr) {
        System.out.println(TAG + tr.getMessage());
    }
}
