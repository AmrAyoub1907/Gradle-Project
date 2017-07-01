package com.udacity.gradle.testing;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.mock.MockContext;
import android.util.Log;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static junit.framework.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class InstrumentedTest {
    private static final String TAG = "NonEmptyString";
    @Test
    public void checkNonString(){
        String result = null;
        Context mcontext = getTargetContext();
        //Context mcontext = getcontext();
        try {
            result = new EndpointsAsyncTask().execute(mcontext).get();
            Log.d(TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "non_empty_String");
        assertNotNull(result);
        // Context of the app under test.
    }
}