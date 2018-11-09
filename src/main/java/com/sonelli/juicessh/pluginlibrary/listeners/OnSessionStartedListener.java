package com.sonelli.juicessh.pluginlibrary.listeners;

import android.support.annotation.NonNull;

public interface OnSessionStartedListener {
    void onSessionStarted(int sessionId, @NonNull String sessionKey);
    void onSessionCancelled();
}
