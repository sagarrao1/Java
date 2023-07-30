package com.naveen.SpringBootDemo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.naveen.SpringBootDemo.model.Alian;

public interface AlianRepo  extends JpaRepository<Alian, Integer>{

	List<Alian> findByAnameOrderByAidDesc(String aname);

	@Query("from Alian where aname=:name")
	List<Alian> find(@Param("name") String aname);

}
