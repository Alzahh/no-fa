package com.example.no_fa.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/no_fa/modules/Network;", "", "dao", "Lcom/example/no_fa/dao/TotpDao;", "(Lcom/example/no_fa/dao/TotpDao;)V", "base_url", "", "doGet", "uploadPasswords", "", "passwords", "Ljava/util/ArrayList;", "Lcom/example/no_fa/modules/Password;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class Network {
    private final com.example.no_fa.dao.TotpDao dao = null;
    private final java.lang.String base_url = "http://localhost:2104";
    
    public Network(@org.jetbrains.annotations.NotNull()
    com.example.no_fa.dao.TotpDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String doGet() {
        return null;
    }
    
    public final void uploadPasswords(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.no_fa.modules.Password> passwords) {
    }
}