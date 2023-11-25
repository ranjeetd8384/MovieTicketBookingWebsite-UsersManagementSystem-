package com.movieticketbooking.showz.service;

import java.util.List;

import com.movieticketbooking.showz.model.AdminInfo;

public interface AdminInfoService {
    List<AdminInfo> findAllAdminInfo();
    AdminInfo findAdminInfoById(int movieId);
    List<AdminInfo> findAdminInfoByMovieName(String movieName);
    List<AdminInfo> findAdminInfoByDirector(String director);
    List<AdminInfo> findAdminInfoByActor(String actor);
    List<AdminInfo> findAdminInfoByActress(String actress);
    void deleteAdminInfoById(int movieId);
    AdminInfo saveOrUpdateAdminInfo(AdminInfo adminInfo);
}
