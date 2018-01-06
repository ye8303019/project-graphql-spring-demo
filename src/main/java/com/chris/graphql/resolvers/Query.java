package com.chris.graphql.resolvers;

import com.chris.graphql.dataloader.PatentDataLoader;
import com.chris.graphql.repository.PatentRepository;
import com.chris.graphql.types.Patent;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

import graphql.schema.DataFetchingEnvironment;

/**
 * Created by ye830 on 1/4/2018.
 */

@Component
public class Query implements GraphQLQueryResolver {

//    @Autowired
//    PatentRepository patentRepository;
//
//    // Return the result bean directly
//    public Patent patent(String patent_id, DataFetchingEnvironment env){
//        return patentRepository.getPatentByPatentId(patent_id);
//    }


    // Return the completable future
//    public CompletableFuture<Patent> patent(String patentId, DataFetchingEnvironment env){
//        return CompletableFuture.supplyAsync(() -> {
//            System.out.println("I am in Patent");
//            try{
//                Thread.sleep(5000);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            return patentRepository.getPatentByPatentId(patentId);
//        });
//    }

    // Get completable future by data loader
    @Autowired
    PatentDataLoader patentDataLoader;

    public CompletableFuture<Patent> patent(String patentId, DataFetchingEnvironment env) {
        return patentDataLoader.load(patentId);
    }
}
