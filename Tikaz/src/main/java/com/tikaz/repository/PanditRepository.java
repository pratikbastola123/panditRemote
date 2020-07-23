package com.tikaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tikaz.entity.PanditProfile;


public interface PanditRepository extends JpaRepository<PanditProfile, Long> {
	
	@Query("SELECT h FROM PanditProfile h WHERE h.id=?1")
	public PanditProfile findOne(Long id);
	
	@Query("SELECT h FROM PanditProfile h WHERE h.fName=?1")
	public PanditProfile findbyName(String name);
	
}