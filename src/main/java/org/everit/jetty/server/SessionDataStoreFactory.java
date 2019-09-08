package org.everit.jetty.server;

import org.eclipse.jetty.server.session.SessionDataStore;

/**
 * Factory interface to create {@link SessionDataStore} instances.
 */
public interface SessionDataStoreFactory {
  /**
   * Creates a new {@link SessionDataStore}.
   *
   * @return The freshly created {@link SessionDataStore}.
   */
  SessionDataStore createSessionDataStore();
}
