package com.ytube.service;

import java.util.List;
import java.util.Optional;

import com.ytube.entity.SearchEntity;

public interface SearchService {
	
	public List<SearchEntity> viewVideos();
	public Optional<SearchEntity> listVideosById(int id);
	public List<SearchEntity> listVideosByName(String name);

}
