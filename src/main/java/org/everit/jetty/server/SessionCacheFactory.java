/*
 * Copyright © 2015 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
