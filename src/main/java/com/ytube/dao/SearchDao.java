package com.ytube.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ytube.entity.SearchEntity;

@Repository("searchdao")
public interface SearchDao extends JpaRepository<SearchEntity, Integer> {

}

