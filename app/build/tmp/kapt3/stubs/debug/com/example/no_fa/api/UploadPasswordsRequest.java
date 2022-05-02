package com.example.no_fa.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0018\b\u0001\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/no_fa/api/UploadPasswordsRequest;", "", "uploadPasswords", "Lretrofit2/Call;", "Lcom/example/no_fa/api/UploadPasswordsResponse;", "body", "Ljava/util/ArrayList;", "Lcom/example/no_fa/modules/Password;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface UploadPasswordsRequest {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = ".")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract retrofit2.Call<com.example.no_fa.api.UploadPasswordsResponse> uploadPasswords(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.ArrayList<com.example.no_fa.modules.Password> body);
}