package com.example.no_fa.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u0007H\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/no_fa/activities/ScannerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lme/dm7/barcodescanner/zbar/ZBarScannerView$ResultHandler;", "()V", "zBarScannerView", "Lme/dm7/barcodescanner/zbar/ZBarScannerView;", "handleResult", "", "result", "Lme/dm7/barcodescanner/zbar/Result;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "parseAndSave", "", "url", "", "app_debug"})
public final class ScannerActivity extends androidx.appcompat.app.AppCompatActivity implements me.dm7.barcodescanner.zbar.ZBarScannerView.ResultHandler {
    private me.dm7.barcodescanner.zbar.ZBarScannerView zBarScannerView;
    
    public ScannerActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.Nullable()
    me.dm7.barcodescanner.zbar.Result result) {
    }
    
    private final boolean parseAndSave(java.lang.String url) {
        return false;
    }
}