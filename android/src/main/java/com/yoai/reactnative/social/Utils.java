package com.yoai.reactnative.social;

import android.util.Log;

public class Utils {

  public static final boolean DEBUG = true;

  public static void info(String tag, String msg) {
    if(DEBUG) {
      Log.i(tag, msg);
    }
  }
}