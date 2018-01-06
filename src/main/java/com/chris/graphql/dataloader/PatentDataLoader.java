package com.chris.graphql.dataloader;

import com.chris.graphql.repository.PatentRepository;
import com.chris.graphql.types.Patent;

import org.dataloader.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * Created by ye830 on 1/5/2018.
 */
@Component
public class PatentDataLoader implements IDataLoader{

    @Autowired
    PatentRepository patentRepository;

    private DataLoader<String,Patent> loader;

    public PatentDataLoader(){
        loader = new DataLoader(keys -> CompletableFuture.supplyAsync(() -> patentRepository.getPatentByPatentIds(keys)));
    }

    @Override
    public DataLoader<String,Patent> getLoader() {
        return loader;
    }

    @Override
    public String getKey(){
        return "patent";
    }

    public CompletableFuture<Patent> load(String patentId){
        return loader.load(patentId);
    }
}
