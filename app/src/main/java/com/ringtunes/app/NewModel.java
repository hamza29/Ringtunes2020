package com.ringtunes.app;

class NewModel {
    String title;
    String path;
    int resource;

    public NewModel(String title, String path, int resource) {
        this.title = title;
        this.path = path;
        this.resource = resource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
