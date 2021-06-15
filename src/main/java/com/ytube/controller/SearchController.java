package com.ytube.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ytube.entity.SearchEntity;
import com.ytube.service.SearchService;

@RestController
@RequestMapping("/videos")
public class SearchController {
	
	@Autowired
	SearchService searchservice;

	@GetMapping("/getVideos")
	public List<SearchEntity> viewVideos(){
		return searchservice.viewVideos();
	}
	
	@GetMapping("/getVideos{id}")
	public Optional<SearchEntity> getVideosById(@PathVariable(value="id") int id)
	{
		return searchservice.listVideosById(id);
		
	}
	
	@GetMapping("/getVideos{name}")
	public List<SearchEntity> getVideosByName(@PathVariable(value="name") String name)
	{
		return searchservice.listVideosByName(name);
		
	}

}
