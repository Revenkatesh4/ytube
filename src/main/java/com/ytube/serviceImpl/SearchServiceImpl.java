package com.ytube.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ytube.dao.SearchDao;
import com.ytube.entity.SearchEntity;
import com.ytube.service.SearchService;

public class SearchServiceImpl implements SearchService {
	
	@Autowired
	SearchDao sDao;
	
	@Override
	public List<SearchEntity> viewVideos() {
		return sDao.findAll();
	}

	@Override
	public Optional<SearchEntity> listVideosById(int id) {
		// TODO Auto-generated method stub
		return sDao.findById(id);
	}

	@Override
	public List<SearchEntity> listVideosByName(String name) {
		String s=name.toLowerCase();
		if(s.matches("[a-z]")) {
			
			List<SearchEntity> list = sDao.findAll();
			List<SearchEntity> list1 = new ArrayList<>();
			for(SearchEntity t : list)
			{
				if(t.getDescription().equals(s))
				{
					list1.add(t);
				}
			}
			return list1;
			
		}
		return null;
	}


	
}
