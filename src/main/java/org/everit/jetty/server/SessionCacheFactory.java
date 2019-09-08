package org.everit.jetty.server;

import org.eclipse.jetty.server.session.SessionCache;
import org.eclipse.jetty.server.session.SessionHandler;

/**
 * Factory interface to create {@link SessionCache} instances.
 */
public interface SessionCacheFactory {

  /**
   * Creates a new {@link SessionCache} instance.
   *
   * @param sessionHandler
   *          The {@link SessionHandler} instance that is the parent of the newly created instance.
   * @return The newly created {@link SessionCache} instance.fw
   */
  SessionCache createSessionCache(SessionHandler sessionHandler);
}
