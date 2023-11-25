package com.movieticketbooking.showz.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieticketbooking.showz.model.AdminInfo;
import com.movieticketbooking.showz.repository.AdminInfoRepository;

@Service
public class AdminInfoServiceImpl implements AdminInfoService{

    private final AdminInfoRepository adminInfoRepository;

    // @Autowired(BECAUSE THERE IS ONLY ONE CONSTRUCTOR IN CLASS)
    public AdminInfoServiceImpl(AdminInfoRepository adminInfoRepository) {
        this.adminInfoRepository = adminInfoRepository;
    }

    @Override
    public List<AdminInfo> findAllAdminInfo() {
        return adminInfoRepository.findAll();
    }

    @Override
    public AdminInfo findAdminInfoById(int movieId) {
        return adminInfoRepository.findById(movieId).orElse(null);
    }

    @Override
    public List<AdminInfo> findAdminInfoByMovieName(String movieName) {
        return adminInfoRepository.findByMovieName(movieName);
       
    }

    @Override
    public List<AdminInfo> findAdminInfoByDirector(String director) {
        return adminInfoRepository.findByDirector(director);
    }

    @Override
    public List<AdminInfo> findAdminInfoByActor(String actor) {
       return adminInfoRepository.findByActor(actor);
    }

    @Override
    public List<AdminInfo> findAdminInfoByActress(String actress) {
        return adminInfoRepository.findByActress(actress);
        
    }

    @Override
    public void deleteAdminInfoById(int movieId) {
        adminInfoRepository.deleteById(movieId);
    }

    @Override
    public AdminInfo saveOrUpdateAdminInfo(AdminInfo adminInfo) {
       return adminInfoRepository.save(adminInfo);
    }
    
}
