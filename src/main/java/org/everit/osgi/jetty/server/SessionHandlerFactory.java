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

import org.eclipse.jetty.server.session.SessionHandler;

/**
 * Factory instance to created pre-configured {@link SessionHandler}s.
 */
public interface SessionHandlerFactory {

  /**
   * Creates a new {@link SessionHandler}.
   *
   * @return A freshly instantiated and pre-configured {@link SessionHandler}.
   */
  SessionHandler createSessionHandler();
}
