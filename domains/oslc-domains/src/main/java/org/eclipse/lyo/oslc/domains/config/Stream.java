// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 *
 * This file is generated by Lyo Designer (https://www.eclipse.org/lyo/)
 */
// End of user code

package org.eclipse.lyo.oslc.domains.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.annotation.OslcAllowedValue;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcMemberProperty;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.ResourceShapeFactory;

import org.eclipse.lyo.oslc.domains.config.Oslc_configDomainConstants;
import org.eclipse.lyo.oslc.domains.config.Configuration;
import org.eclipse.lyo.oslc.domains.config.Oslc_configDomainConstants;
import org.eclipse.lyo.oslc.domains.RdfsDomainConstants;
import org.eclipse.lyo.oslc.domains.ProvVocabularyConstants;
import org.eclipse.lyo.oslc.domains.Agent;
import org.eclipse.lyo.oslc.domains.config.Baseline;
import org.eclipse.lyo.oslc.domains.RdfsClass;
import org.eclipse.lyo.oslc.domains.config.Component;
import org.eclipse.lyo.oslc.domains.config.Configuration;
import org.eclipse.lyo.oslc.domains.config.Contribution;
import org.eclipse.lyo.oslc.domains.Person;
import org.eclipse.lyo.oslc.domains.config.Selections;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_configDomainConstants.STREAM_NAMESPACE)
@OslcName(Oslc_configDomainConstants.STREAM_LOCALNAME)
@OslcResourceShape(title = "Stream Shape", describes = Oslc_configDomainConstants.STREAM_TYPE)
public class Stream
    extends Configuration
    implements IStream
{
    // Start of user code attributeAnnotation:accepts
    // End of user code
    private Set<Link> accepts = new HashSet<>();
    // Start of user code attributeAnnotation:baselines
    // End of user code
    private Link baselines;
    // Start of user code attributeAnnotation:previousBaseline
    // End of user code
    private Link previousBaseline;
    // Start of user code attributeAnnotation:wasDerivedFrom
    // End of user code
    private Set<Link> wasDerivedFrom = new HashSet<>();

    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Stream()
    {
        super();

        // Start of user code constructor1
        // End of user code
    }

    public Stream(final URI about)
    {
        super(about);

        // Start of user code constructor2
        // End of user code
    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_configDomainConstants.STREAM_PATH,
        Stream.class);
    }


    public String toString()
    {
        return toString(false);
    }

    public String toString(boolean asLocalResource)
    {
        String result = "";
        // Start of user code toString_init
        // End of user code

        if (asLocalResource) {
            result = result + "{a Local Stream Resource} - update Stream.toString() to present resource as desired.";
            // Start of user code toString_bodyForLocalResource
            // End of user code
        }
        else {
            result = String.valueOf(getAbout());
        }

        // Start of user code toString_finalize
        // End of user code

        return result;
    }

    public void addAccepts(final Link accepts)
    {
        this.accepts.add(accepts);
    }

    public void addWasDerivedFrom(final Link wasDerivedFrom)
    {
        this.wasDerivedFrom.add(wasDerivedFrom);
    }


    // Start of user code getterAnnotation:accepts
    // End of user code
    @OslcName("accepts")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "accepts")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({RdfsDomainConstants.CLASS_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getAccepts()
    {
        // Start of user code getterInit:accepts
        // End of user code
        return accepts;
    }

    // Start of user code getterAnnotation:baselines
    // End of user code
    @OslcName("baselines")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "baselines")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.BASELINE_TYPE})
    @OslcReadOnly(false)
    public Link getBaselines()
    {
        // Start of user code getterInit:baselines
        // End of user code
        return baselines;
    }

    // Start of user code getterAnnotation:previousBaseline
    // End of user code
    @OslcName("previousBaseline")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "previousBaseline")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.BASELINE_TYPE})
    @OslcReadOnly(false)
    public Link getPreviousBaseline()
    {
        // Start of user code getterInit:previousBaseline
        // End of user code
        return previousBaseline;
    }

    // Start of user code getterAnnotation:wasDerivedFrom
    // End of user code
    @OslcName("wasDerivedFrom")
    @OslcPropertyDefinition(ProvVocabularyConstants.PROVENANCE_NAMSPACE + "wasDerivedFrom")
    @OslcDescription("")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_configDomainConstants.CONFIGURATION_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getWasDerivedFrom()
    {
        // Start of user code getterInit:wasDerivedFrom
        // End of user code
        return wasDerivedFrom;
    }

    // Start of user code setterAnnotation:accepts
    // End of user code
    public void setAccepts(final Set<Link> accepts )
    {
        // Start of user code setterInit:accepts
        // End of user code
        this.accepts.clear();
        if (accepts != null)
        {
            this.accepts.addAll(accepts);
        }
        // Start of user code setterFinalize:accepts
        // End of user code
    }

    // Start of user code setterAnnotation:baselines
    // End of user code
    public void setBaselines(final Link baselines )
    {
        // Start of user code setterInit:baselines
        // End of user code
        this.baselines = baselines;
        // Start of user code setterFinalize:baselines
        // End of user code
    }

    // Start of user code setterAnnotation:previousBaseline
    // End of user code
    public void setPreviousBaseline(final Link previousBaseline )
    {
        // Start of user code setterInit:previousBaseline
        // End of user code
        this.previousBaseline = previousBaseline;
        // Start of user code setterFinalize:previousBaseline
        // End of user code
    }

    // Start of user code setterAnnotation:wasDerivedFrom
    // End of user code
    public void setWasDerivedFrom(final Set<Link> wasDerivedFrom )
    {
        // Start of user code setterInit:wasDerivedFrom
        // End of user code
        this.wasDerivedFrom.clear();
        if (wasDerivedFrom != null)
        {
            this.wasDerivedFrom.addAll(wasDerivedFrom);
        }
        // Start of user code setterFinalize:wasDerivedFrom
        // End of user code
    }

}
