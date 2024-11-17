package com.hacen.evenements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hacen.evenements.model.Image;

public interface ImageRepository extends JpaRepository<Image , Long> {
}
