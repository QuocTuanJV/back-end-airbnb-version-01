package com.example.mydemo.services.impl;

import com.example.mydemo.repository.HomeRepository;
import com.example.mydemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeRepository homeRepository;
}
