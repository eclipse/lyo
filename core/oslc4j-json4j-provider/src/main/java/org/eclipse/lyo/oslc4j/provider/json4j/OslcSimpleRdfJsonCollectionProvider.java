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
package org.eclipse.lyo.oslc4j.provider.json4j;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

/**
 * Use JSON-LD support in Jena provider.
 */
@Deprecated
@Provider
@Produces(OslcMediaType.APPLICATION_JSON)
@Consumes(OslcMediaType.APPLICATION_JSON)
public final class OslcSimpleRdfJsonCollectionProvider
	   extends OslcRdfJsonCollectionProvider
{
	public OslcSimpleRdfJsonCollectionProvider()
	{
		super();
	}

	@Override
	public void writeTo(final Collection<Object>			 collection,
						final Class<?>						 type,
						final Type							 genericType,
						final Annotation[]					 annotations,
						final MediaType						 mediaType,
						final MultivaluedMap<String, Object> map,
						final OutputStream					 outputStream)
		   throws IOException,
				  WebApplicationException
	{
		writeTo(collection.toArray(new Object[collection.size()]),
				mediaType,
				map,
				outputStream,
				null,
				null,
				null,
				null);
	}
}
