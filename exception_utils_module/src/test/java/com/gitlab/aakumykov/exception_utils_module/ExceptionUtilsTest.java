package com.gitlab.aakumykov.exception_utils_module;

import static org.junit.Assert.assertEquals;

import com.gitlab.aakumykov.exception_utils_module.p1.ExceptionUtils;

import org.junit.Before;
import org.junit.Test;

public class ExceptionUtilsTest {

    private static final String ERROR_MSG = "Сообщение об ошибке";
    private static final String TAG = ExceptionUtilsTest.class.getSimpleName();

    private Exception mException;
    private Throwable mThrowable;


    @Before
    public void setUp() throws Exception {
        mException = new Exception(ERROR_MSG);
        mThrowable = new Throwable(ERROR_MSG);
    }

    @Test
    public void getErrorFromException() {
        String text = ExceptionUtils.getErrorFromException(mException);
        assertEquals(ERROR_MSG, text);
    }

    @Test
    public void getErrorMessage_fromException() {
        String text = ExceptionUtils.getErrorMessage(mException);
        assertEquals(ERROR_MSG, text);
    }

    @Test
    public void getErrorMessage_fromThrowable() {
        String text = ExceptionUtils.getErrorMessage(mThrowable);
        assertEquals(ERROR_MSG, text);
    }
}