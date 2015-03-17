/*
 * Copyright (C) 2015 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.osgi.jetty.server;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.SessionManager;

/**
 * Factory instance to created pre-configured {@link SessionManager}s.
 */
public interface SessionManagerFactory {

  /**
   * Creates a new {@link SessionManager}.
   *
   * @param parentHandler
   *          The {@link Handler} (e.g.: {@link org.eclipse.jetty.server.session.SessionHandler}) in
   *          which the {@link SessionManager} will be used.
   * @return A freshly instantiated and pre-configured {@link SessionManager}.
   */
  SessionManager createSessionManager(Handler parentHandler);
}
