package com.chris.graphql.resolvers;

import com.chris.graphql.repository.AssigneeRepository;
import com.chris.graphql.repository.InventorRepository;
import com.chris.graphql.types.Assignee;
import com.chris.graphql.types.Inventor;
import com.chris.graphql.types.Patent;
import com.coxautodev.graphql.tools.GraphQLResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * Created by ye830 on 1/4/2018.
 */
@Component
public class PatentResolver implements GraphQLResolver<Patent> {
    @Autowired
    AssigneeRepository assigneeRepository;

    @Autowired
    InventorRepository inventorRepository;

//    public Assignee assignee(Patent patent, DataFetchingEnvironment env) {
//        System.out.println("I am in assignee ");
////        try {
////            Thread.sleep(3000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        return assigneeRepository.getAssigneeByPatentId(patent.getId());
//    }
//
//    public List<Inventor> inventor(Patent patent, DataFetchingEnvironment env) {
//        System.out.println("I am in inventor ");
////        try {
////            Thread.sleep(4000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        return inventorRepository.getInventorByPatentId(patent.getId());
//    }

    public CompletableFuture<Assignee> assignee(Patent patent, DataFetchingEnvironment env) {

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("I am in assignee ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return assigneeRepository.getAssigneeByPatentId(patent.getId());
        });
    }

    public CompletableFuture<List<Inventor>> inventor(Patent patent, DataFetchingEnvironment env) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("I am in inventor ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return inventorRepository.getInventorByPatentId(patent.getId());
        });
    }
}
