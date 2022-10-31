package com.codegym.service.Image;

import com.codegym.model.Blog;
import com.codegym.model.Image;
import com.codegym.service.IGeneralService;

import java.util.List;

public interface IImageService extends IGeneralService<Image> {
    List<Image> findAllByBlog(Blog blog);
}
