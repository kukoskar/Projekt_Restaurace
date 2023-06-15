package com.engeto.attributes;

public class Image {

    private String url;

    public Image(String url) {
        this.url = url;
    }

    public Image() {
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
