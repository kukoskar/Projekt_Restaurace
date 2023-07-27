package com.engeto.restaurant;

public class ImageUrl {

    private String url;

    public ImageUrl(String url) {
        this.url = url;
    }

    public ImageUrl() {
    }

    public String getUrl() {
      return url;
    }

    public void setUrl(String url)  {
        if (url.isEmpty()) {
            setUrl("blank");
        }
        this.url = url;
    }


    @Override
    public String toString() {
        return " URL " + url;
    }

}
