package com.googlecode.download.maven.plugin.internal;

import com.googlecode.download.maven.plugin.internal.cache.filebackedindex.FileBackedIndex;
import org.apache.http.client.cache.HttpCacheStorage;
import org.apache.maven.plugin.logging.Log;

import java.nio.file.NotDirectoryException;
import java.nio.file.Path;

/**
 * Abstract factory for providing cache factories; currently the only implementation is one
 * based on {@link FileBackedIndex}.
 */
public interface CacheFactory {
    /**
     * Provides a {@link HttpCacheStorage} instance
     * @param cacheDir cache directory
     * @param log {@link Log} instance
     * @return returns a {@link HttpCacheStorage} instance compliant with the given cache implementation
     * @throws NotDirectoryException may be thrown in case the {@code cacheDir} is not a directory
     */
    HttpCacheStorage getHttpCacheStorage(Path cacheDir, Log log) throws NotDirectoryException;
}
