package com.chris.graphql;

import com.chris.graphql.dataloader.IDataLoader;

import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

import graphql.execution.instrumentation.ChainedInstrumentation;
import graphql.execution.instrumentation.Instrumentation;
import graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation;

/**
 * Created by ye830 on 1/4/2018.
 */
@SpringBootApplication(
        scanBasePackages = "com.chris.graphql"
)
public class GraphqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class, args);
    }

    @Bean
    public Instrumentation instrumentation(List<IDataLoader> dataLoaders){
        DataLoaderRegistry dataLoaderRegistry = new DataLoaderRegistry();
        if(!CollectionUtils.isEmpty(dataLoaders)){
            dataLoaders.stream().forEach( loader -> dataLoaderRegistry.register(loader.getKey(), loader.getLoader()));
        }
        DataLoaderDispatcherInstrumentation dataLoaderDispatcherInstrumentation = new DataLoaderDispatcherInstrumentation(dataLoaderRegistry);
        List<Instrumentation> chainInstrumentation = new ArrayList<>();
        chainInstrumentation.add(dataLoaderDispatcherInstrumentation);

        return new ChainedInstrumentation(chainInstrumentation);
    }
}
