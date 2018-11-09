package com.sonelli.juicessh.pluginlibrary.listeners;

import android.support.annotation.NonNull;

public interface OnSuccessListener {
    void onSuccess();
    void onFailure(@NonNull String reason);
}
