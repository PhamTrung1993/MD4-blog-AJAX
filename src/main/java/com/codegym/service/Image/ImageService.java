package com.codegym.service.Image;

import com.codegym.model.Blog;
import com.codegym.model.Image;
import com.codegym.repository.IImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImageService implements IImageService{
    @Autowired
    private IImageRepository imageRepository;

    @Override
    public Iterable<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Iterable<Image> findAll(int page, int size) {
        return null;
    }

    @Override
    public Optional<Image> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Image> findAllByBlog(Blog blog) {
        return imageRepository.findAllByBlog(blog);
    }
}
