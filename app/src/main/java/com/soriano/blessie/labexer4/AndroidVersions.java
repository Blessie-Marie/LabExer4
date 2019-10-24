package com.soriano.blessie.labexer4;

public class AndroidVersions {
    int logo;

    public AndroidVersions(int logo, String name, String version, String apiLevel, String releaseDate, String message) {
        this.logo = logo;
        this.name = name;
        this.version = version;
        this.apiLevel = apiLevel;
        this.releaseDate = releaseDate;
        this.message = message;
    }

    String name, version, apiLevel, releaseDate, message;

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getApiLevel() {
        return apiLevel;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

//    public String getMessage() {
//        return message;
//    }



}

