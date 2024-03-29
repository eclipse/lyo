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
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lyo.oslc4j.provider.json4j;

import java.util.HashSet;
import java.util.Set;

/**
 * Use JSON-LD support in Jena provider.
 */
@Deprecated
public final class Json4JProvidersRegistry
{
	private static final Set<Class<?>> PROVIDERS = new HashSet<>();

	static
	{
		PROVIDERS.add(OslcCompactJsonProvider.class);
		PROVIDERS.add(OslcRdfJsonArrayProvider.class);
		PROVIDERS.add(OslcRdfJsonCollectionProvider.class);
		PROVIDERS.add(OslcRdfJsonProvider.class);
	}

	private Json4JProvidersRegistry()
	{
		super();
	}

	/**
	 * Returns a mutable set of provider classes.  Each request returns a new Set.
	 */
	public static final Set<Class<?>> getProviders()
	{
		return new HashSet<>(PROVIDERS);
	}
}
