package com.example.no_fa.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/no_fa/api/HealthCheckRequest;", "", "healthCheck", "Lretrofit2/Call;", "Lcom/example/no_fa/api/HealthCheckResponse;", "app_debug"})
public abstract interface HealthCheckRequest {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = ".")
    public abstract retrofit2.Call<com.example.no_fa.api.HealthCheckResponse> healthCheck();
}