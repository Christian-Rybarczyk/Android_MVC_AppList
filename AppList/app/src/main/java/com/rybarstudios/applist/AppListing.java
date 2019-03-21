package com.rybarstudios.applist;

public class AppListing {

    private int id;
    private String appName, appVersion, domainName, contactEmail, imageUrl;

    public AppListing(int id, String appName, String appVersion, String domainName, String contactEmail, String imageUrl) {
        this.id = id;
        this.appName = appName;
        this.appVersion = appVersion;
        this.domainName = domainName;
        this.contactEmail = contactEmail;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
