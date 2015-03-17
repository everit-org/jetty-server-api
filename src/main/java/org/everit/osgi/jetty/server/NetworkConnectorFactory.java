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

import org.eclipse.jetty.server.NetworkConnector;
import org.eclipse.jetty.server.Server;

/**
 * Factory interface for creating {@link NetworkConnector}s.
 */
public interface NetworkConnectorFactory {

  /**
   * Creates a {@link NetworkConnector}.
   *
   * @param server
   *          The {@link Server} in which the {@link NetworkConnector} will be used.
   * @param host
   *          The name of the host that the new connector should bind to. The parameter is optional.
   * @param port
   *          The port which the connector should bind to. In case of 0, the connector will bind to
   *          a random port.
   * @return The created network connector instance.
   */
  NetworkConnector createNetworkConnector(Server server, String host, int port);

}
