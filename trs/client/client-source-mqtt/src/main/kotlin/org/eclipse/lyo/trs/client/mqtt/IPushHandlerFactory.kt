/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Eclipse Distribution License 1.0
 * which is available at http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Simple
 */

package org.eclipse.lyo.trs.client.mqtt

import org.eclipse.lyo.core.trs.TrackedResourceSet
import org.eclipse.lyo.trs.client.handlers.IPushProviderHandler

// FIXME Andrew@2019-07-21: replace all the topic parameters with a factory
interface IPushHandlerFactory {
    fun handlerFor(topic: String): IPushProviderHandler
    fun handlerFor(provider: TrackedResourceSet): IPushProviderHandler
}
