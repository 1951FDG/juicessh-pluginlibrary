package com.sonelli.juicessh.pluginlibrary.listeners;

import androidx.annotation.NonNull;

public interface OnSessionStartedListener {
    void onSessionStarted(int sessionId, @NonNull String sessionKey);
    void onSessionCancelled();
}
