/*
 * @author irumvanselme - irumvanselme@outlook.com
 * Copyright (c) 2022.
 */

package com.okavaa.anselme;

public class Registerer {

    private String username;

    private String fullNames;

    public Registerer(String username, String fullNames) {
        this.username = username;
        this.fullNames = fullNames;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }
}
