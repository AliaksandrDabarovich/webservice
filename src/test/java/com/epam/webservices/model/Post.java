package com.epam.webservices.model;

import java.util.HashMap;
import java.util.Map;

public class Post {
    private int id;
    private String username;
    private String email;
    private Map<String, Object> adress = new HashMap<String, Object>();
    private String phone;
    private String website;
    private Map<String, Object> company = new HashMap<String, Object>();

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(Map<String, Object> adress) {
        this.adress = adress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setCompany(Map<String, Object> company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Map<String, Object> getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public Map<String, Object> getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", adress=" + adress +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}
