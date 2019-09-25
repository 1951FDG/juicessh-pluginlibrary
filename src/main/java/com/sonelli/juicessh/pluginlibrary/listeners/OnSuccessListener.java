package com.sonelli.juicessh.pluginlibrary.listeners;

import androidx.annotation.NonNull;

public interface OnSuccessListener {
    void onSuccess();
    void onFailure(@NonNull String reason);
}
