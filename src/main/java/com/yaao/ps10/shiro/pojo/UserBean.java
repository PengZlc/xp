package com.yaao.ps10.shiro.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserBean implements Serializable {
    private String id;
    private String name;
    private String password;
    private Set<RoleBean> roles = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleBean> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleBean> roles) {
        this.roles = roles;
    }
}
