package com.googlecode.download.maven.plugin.internal.cache;

import com.googlecode.download.maven.plugin.internal.CacheFactory;
import org.apache.http.client.cache.HttpCacheStorage;
import org.apache.http.client.cache.ResourceFactory;
import org.apache.maven.plugin.logging.Log;

import javax.inject.Named;
import javax.inject.Singleton;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;

/**
 * File backed index cache factory implementation
 */
@Singleton
@Named("fileBackedIndex")
public final class FileBackedIndexCacheFactory implements CacheFactory {
    @Override
    public ResourceFactory getResourceFactory(Path cacheDir) {
        return new FileIndexResourceFactory(cacheDir);
    }

    @Override
    public HttpCacheStorage getHttpCacheStorage(Path cacheDir, Log log) throws NotDirectoryException {
        return new FileBackedIndex(cacheDir, log);
    }
}