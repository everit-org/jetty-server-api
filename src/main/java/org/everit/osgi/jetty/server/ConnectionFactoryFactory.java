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

import org.eclipse.jetty.server.ConnectionFactory;

/**
 * Factory class to create pre-configured {@link ConnectionFactory} instances.
 */
public interface ConnectionFactoryFactory {

  /**
   * Creates a new pre-configured {@link ConnectionFactory}.
   *
   * @param nextProtocol
   *          The protocol of the {@link ConnectionFactory} that follows the one created by this
   *          factory in the queue.
   *
   * @return a new pre-configured {@link ConnectionFactory}.
   */
  ConnectionFactory createConnectionFactory(String nextProtocol);

  /**
   * A string representing the primary protocol name of the {@link ConnectionFactory}s created by
   * this factory.
   *
   * @return the primary protocol name.
   */
  String getProtocol();

}
