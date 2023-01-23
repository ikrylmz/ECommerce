package com.bilgeadam.ecommerce.service;


import com.bilgeadam.ecommerce.model.Deneme;
import com.bilgeadam.ecommerce.repo.DenemeRepo;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenemeService {

    @Autowired
    private DenemeRepo denemeRepo;


    public List<Deneme> getAllMoviesService() {

        return denemeRepo.getAllUsersRepository();
    }

}
