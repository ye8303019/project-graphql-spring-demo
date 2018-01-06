package com.chris.graphql.dataloader;

import org.dataloader.DataLoader;

/**
 * Created by ye830 on 1/5/2018.
 */
public interface IDataLoader {
    DataLoader getLoader();
    String getKey();
}
