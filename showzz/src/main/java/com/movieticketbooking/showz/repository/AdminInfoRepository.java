package com.movieticketbooking.showz.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movieticketbooking.showz.model.AdminInfo;

public interface AdminInfoRepository extends JpaRepository<AdminInfo, Integer> {

    List<AdminInfo> findByMovieName(String movieName);

    List<AdminInfo> findByDirector(String director);

    List<AdminInfo> findByActor(String actor);

    List<AdminInfo> findByActress(String actress);

}
