package com.tericcabrel.authorization.models.mongo;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "password_resets")
public class ResetPassword extends BaseModel {
    @DBRef
    private User user;

    private String token;

    private long expireAt;

    public User getUser() {
        return user;
    }

    public ResetPassword setUser(User user) {
        this.user = user;
        return this;
    }

    public String getToken() {
        return token;
    }

    public ResetPassword setToken(String token) {
        this.token = token;
        return this;
    }

    public long getExpireAt() {
        return expireAt;
    }

    public ResetPassword setExpireAt(long expireAt) {
        this.expireAt = expireAt;
        return this;
    }
}
