package com.codegym.service.Blog;

import com.codegym.model.Blog;
import com.codegym.service.IGeneralService;

public interface IBlogService extends IGeneralService<Blog> {
    Iterable<Blog> findAllByTitleContaining(String keyword);
}
