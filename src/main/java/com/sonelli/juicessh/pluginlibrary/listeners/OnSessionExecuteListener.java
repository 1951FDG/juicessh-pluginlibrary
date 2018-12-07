package com.sonelli.juicessh.pluginlibrary.listeners;

import android.support.annotation.NonNull;

public interface OnSessionExecuteListener {
    void onCompleted(int returnCode);
    void onOutputLine(@NonNull String line);
    void onError(int reason, @NonNull String message);
}
