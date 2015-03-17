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

import org.eclipse.jetty.server.HandlerContainer;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Factory interface to create {@link ServletContextHandler} instances.
 */
public interface ServletContextHandlerFactory {

  /**
   * Creates a new {@link ServletContextHandler} instance.
   *
   * @param parent
   *          The parent handler container (e.g.: a ContextHandlerCollection) that the
   *          {@link ServletContextHandler} will be used in. The parameter should also implement the
   *          {@link org.eclipse.jetty.server.Handler} interface.
   * @param contextPath
   *          The context path that the {@link ServletContextHandler} will be mapped to.
   * @return The instantiated {@link ServletContextHandler}.
   */
  ServletContextHandler createHandler(HandlerContainer parent, String contextPath);
}
