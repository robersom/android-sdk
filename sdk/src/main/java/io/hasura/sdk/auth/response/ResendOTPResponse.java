package io.hasura.sdk.auth.response;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class ResendOTPResponse {

    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }
}