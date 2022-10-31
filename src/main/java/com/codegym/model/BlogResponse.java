package com.codegym.model;

import java.util.List;

public class BlogResponse {
    private Blog blog;
    private List<Image> images;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
