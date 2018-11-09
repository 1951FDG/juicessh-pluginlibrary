package com.sonelli.juicessh.pluginlibrary.listeners;

import android.support.annotation.NonNull;

public interface OnCommandSuccessListener {
    void onSuccess();
    void onCommandFailure(@NonNull String reason);
    void onSessionFailure(@NonNull String reason);
}
