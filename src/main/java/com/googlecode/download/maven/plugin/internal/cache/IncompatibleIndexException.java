package com.googlecode.download.maven.plugin.internal.cache;

import com.googlecode.download.maven.plugin.internal.cache.filebackedindex.FileBackedIndex;

/**
 * Thrown when {@link FileBackedIndex} fails to read an existing index.
 * <p>
 * This occurs when upgrading to a new version of the plugin with breaking changes in the index storage strategy
 * (including Java serialization changes, or even moving to a different serialization mechanism (JSON, XML, etc.).
 */
public class IncompatibleIndexException extends RuntimeException {
    public IncompatibleIndexException(Exception cause) {
        super(cause);
    }
}
