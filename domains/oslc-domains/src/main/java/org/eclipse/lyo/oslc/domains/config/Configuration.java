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

import org.eclipse.lyo.oslc.domains.config.Oslc_configDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.eclipse.lyo.oslc.domains.RdfsDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsVocabularyConstants;
import org.eclipse.lyo.oslc.domains.OsclVocabularyConstants;
import org.eclipse.lyo.oslc.domains.Agent;
import org.eclipse.lyo.oslc.domains.config.Component;
import org.eclipse.lyo.oslc.domains.config.Contribution;
import org.eclipse.lyo.oslc.domains.Person;
import org.eclipse.lyo.oslc.domains.config.Selections;
// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_configDomainConstants.CONFIGURATION_NAMESPACE)
@OslcName(Oslc_configDomainConstants.CONFIGURATION_LOCALNAME)
@OslcResourceShape(title = "", description = "", describes = Oslc_configDomainConstants.CONFIGURATION_TYPE)
public class Configuration
    extends AbstractResource
    implements IConfiguration
{
    // Start of user code attributeAnnotation:contributor
    // End of user code
    private Set<Link> contributor = new HashSet<>();
    // Start of user code attributeAnnotation:created
    // End of user code
    private Date created;
    // Start of user code attributeAnnotation:creator
    // End of user code
    private Set<Link> creator = new HashSet<>();
    // Start of user code attributeAnnotation:description
    // End of user code
    private String description;
    // Start of user code attributeAnnotation:identifier
    // End of user code
    private String identifier;
    // Start of user code attributeAnnotation:modified
    // End of user code
    private Date modified;
    // Start of user code attributeAnnotation:subject
    // End of user code
    private Set<String> subject = new HashSet<>();
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:acceptedBy
    // End of user code
    private String acceptedBy;
    // Start of user code attributeAnnotation:branch
    // End of user code
    private Link branch;
    // Start of user code attributeAnnotation:component
    // End of user code
    private Link component;
    // Start of user code attributeAnnotation:contribution
    // End of user code
    private Link contribution;
    // Start of user code attributeAnnotation:selections
    // End of user code
    private Set<Link> selections = new HashSet<>();
    // Start of user code attributeAnnotation:archived
    // End of user code
    private Boolean archived;
    // Start of user code attributeAnnotation:instanceShape
    // End of user code
    private Set<Link> instanceShape = new HashSet<>();
    // Start of user code attributeAnnotation:modifiedBy
    // End of user code
    private Set<Link> modifiedBy = new HashSet<>();
    // Start of user code attributeAnnotation:release
    // End of user code
    private Set<Link> release = new HashSet<>();
    // Start of user code attributeAnnotation:serviceProvider
    // End of user code
    private Set<Link> serviceProvider = new HashSet<>();
    // Start of user code attributeAnnotation:shortId
    // End of user code
    private String shortId;
    // Start of user code attributeAnnotation:shortTitle
    // End of user code
    private String shortTitle;

    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public Configuration()
    {
        super();

        // Start of user code constructor1
        // End of user code
    }

    public Configuration(final URI about)
    {
        super(about);

        // Start of user code constructor2
        // End of user code
    }

    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_configDomainConstants.CONFIGURATION_PATH,
        Configuration.class);
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
            result = result + "{a Local Configuration Resource} - update Configuration.toString() to present resource as desired.";
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

    public void addContributor(final Link contributor)
    {
        this.contributor.add(contributor);
    }

    public void addCreator(final Link creator)
    {
        this.creator.add(creator);
    }

    public void addSubject(final String subject)
    {
        this.subject.add(subject);
    }

    public void addSelections(final Link selections)
    {
        this.selections.add(selections);
    }

    public void addInstanceShape(final Link instanceShape)
    {
        this.instanceShape.add(instanceShape);
    }

    public void addModifiedBy(final Link modifiedBy)
    {
        this.modifiedBy.add(modifiedBy);
    }

    public void addRelease(final Link release)
    {
        this.release.add(release);
    }

    public void addServiceProvider(final Link serviceProvider)
    {
        this.serviceProvider.add(serviceProvider);
    }


    // Start of user code getterAnnotation:contributor
    // End of user code
    @OslcName("contributor")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "contributor")
    @OslcDescription("Contributor or contributors to the resource. The link target is usually a foaf:Person or foaf:Agent, but could be any type.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE, FoafDomainConstants.AGENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getContributor()
    {
        // Start of user code getterInit:contributor
        // End of user code
        return contributor;
    }

    // Start of user code getterAnnotation:created
    // End of user code
    @OslcName("created")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "created")
    @OslcDescription("Timestamp of resource creation")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getCreated()
    {
        // Start of user code getterInit:created
        // End of user code
        return created;
    }

    // Start of user code getterAnnotation:creator
    // End of user code
    @OslcName("creator")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "creator")
    @OslcDescription("Creator or creators of the resource. The link target is usually a foaf:Person or foaf:Agent, but could be any type")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE, FoafDomainConstants.AGENT_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getCreator()
    {
        // Start of user code getterInit:creator
        // End of user code
        return creator;
    }

    // Start of user code getterAnnotation:description
    // End of user code
    @OslcName("description")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "description")
    @OslcDescription("Descriptive text about resource represented as rich text in XHTML content. SHOULD include only content that is valid and suitable inside an XHTML <div> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getDescription()
    {
        // Start of user code getterInit:description
        // End of user code
        return description;
    }

    // Start of user code getterAnnotation:identifier
    // End of user code
    @OslcName("identifier")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "identifier")
    @OslcDescription("A unique identifier for a resource. Typically read-only and assigned by the service provider when a resource is created. Not typically intended for end-user display.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getIdentifier()
    {
        // Start of user code getterInit:identifier
        // End of user code
        return identifier;
    }

    // Start of user code getterAnnotation:modified
    // End of user code
    @OslcName("modified")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "modified")
    @OslcDescription("Timestamp of latest resource modification")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.DateTime)
    @OslcReadOnly(false)
    public Date getModified()
    {
        // Start of user code getterInit:modified
        // End of user code
        return modified;
    }

    // Start of user code getterAnnotation:subject
    // End of user code
    @OslcName("subject")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "subject")
    @OslcDescription("Tag or keyword for a resource. Each occurrence of a dcterms:subject property denotes an additional tag for the resource.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    @OslcTitle("")
    public Set<String> getSubject()
    {
        // Start of user code getterInit:subject
        // End of user code
        return subject;
    }

    // Start of user code getterAnnotation:title
    // End of user code
    @OslcName("title")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "title")
    @OslcDescription("Title of the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getTitle()
    {
        // Start of user code getterInit:title
        // End of user code
        return title;
    }

    // Start of user code getterAnnotation:acceptedBy
    // End of user code
    @OslcName("acceptedBy")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "acceptedBy")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.String)
    @OslcRange({RdfsDomainConstants.CLASS_TYPE})
    @OslcReadOnly(false)
    public String getAcceptedBy()
    {
        // Start of user code getterInit:acceptedBy
        // End of user code
        return acceptedBy;
    }

    // Start of user code getterAnnotation:branch
    // End of user code
    @OslcName("branch")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "branch")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Link getBranch()
    {
        // Start of user code getterInit:branch
        // End of user code
        return branch;
    }

    // Start of user code getterAnnotation:component
    // End of user code
    @OslcName("component")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "component")
    @OslcDescription("The component to which this version belongs. Configuration Management provider should indicate the owning component for each version resource using either this property, or using the membership relationship from the component LDPC.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.COMPONENT_TYPE})
    @OslcReadOnly(false)
    public Link getComponent()
    {
        // Start of user code getterInit:component
        // End of user code
        return component;
    }

    // Start of user code getterAnnotation:contribution
    // End of user code
    @OslcName("contribution")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "contribution")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.CONTRIBUTION_TYPE})
    @OslcReadOnly(false)
    public Link getContribution()
    {
        // Start of user code getterInit:contribution
        // End of user code
        return contribution;
    }

    // Start of user code getterAnnotation:selections
    // End of user code
    @OslcName("selections")
    @OslcPropertyDefinition(Oslc_configDomainConstants.CONFIGURATION_MANAGEMENT_NAMSPACE + "selections")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_configDomainConstants.SELECTIONS_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getSelections()
    {
        // Start of user code getterInit:selections
        // End of user code
        return selections;
    }

    // Start of user code getterAnnotation:archived
    // End of user code
    @OslcName("archived")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "archived")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Boolean)
    @OslcReadOnly(false)
    public Boolean isArchived()
    {
        // Start of user code getterInit:archived
        // End of user code
        return archived;
    }

    // Start of user code getterAnnotation:instanceShape
    // End of user code
    @OslcName("instanceShape")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "instanceShape")
    @OslcDescription("The URI of a Resource Shape that describes the possible properties, occurrence, value types, allowed values and labels. This shape information is useful in displaying the subject resource as well as guiding clients in performing modifications. Instance shapes may be specific to the authenticated user associated with the request that retrieved the resource, the current state of the resource and other factors and thus should not be cached.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcReadOnly(false)
    public Set<Link> getInstanceShape()
    {
        // Start of user code getterInit:instanceShape
        // End of user code
        return instanceShape;
    }

    // Start of user code getterAnnotation:modifiedBy
    // End of user code
    @OslcName("modifiedBy")
    @OslcPropertyDefinition(OsclVocabularyConstants.OSLC_CORE_NAMSPACE + "modifiedBy")
    @OslcDescription("The entity that most recently modified the subject resource. The link target is usually a foaf:Person or foaf:Agent, but could be any type.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.AGENT_TYPE, FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getModifiedBy()
    {
        // Start of user code getterInit:modifiedBy
        // End of user code
        return modifiedBy;
    }

    // Start of user code getterAnnotation:release
    // End of user code
    @OslcName("release")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "release")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Set<Link> getRelease()
    {
        // Start of user code getterInit:release
        // End of user code
        return release;
    }

    // Start of user code getterAnnotation:serviceProvider
    // End of user code
    @OslcName("serviceProvider")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "serviceProvider")
    @OslcDescription("A link to the resource's OSLC Service Provider. There may be cases when the subject resource is available from a service provider that implements multiple domain specifications, which could result in multiple values for this property.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcReadOnly(false)
    public Set<Link> getServiceProvider()
    {
        // Start of user code getterInit:serviceProvider
        // End of user code
        return serviceProvider;
    }

    // Start of user code getterAnnotation:shortId
    // End of user code
    @OslcName("shortId")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "shortId")
    @OslcDescription("Shorter form of dcterms:identifier for the resource, such as a number.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.String)
    @OslcReadOnly(false)
    public String getShortId()
    {
        // Start of user code getterInit:shortId
        // End of user code
        return shortId;
    }

    // Start of user code getterAnnotation:shortTitle
    // End of user code
    @OslcName("shortTitle")
    @OslcPropertyDefinition(OslcDomainConstants.OSLC_NAMSPACE + "shortTitle")
    @OslcDescription("Shorter form of dcterms:title for the resource represented as rich text in XHTML content. SHOULD include only content that is valid inside an XHTML <span> element.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.XMLLiteral)
    @OslcReadOnly(false)
    public String getShortTitle()
    {
        // Start of user code getterInit:shortTitle
        // End of user code
        return shortTitle;
    }

    // Start of user code setterAnnotation:contributor
    // End of user code
    public void setContributor(final Set<Link> contributor )
    {
        // Start of user code setterInit:contributor
        // End of user code
        this.contributor.clear();
        if (contributor != null)
        {
            this.contributor.addAll(contributor);
        }
        // Start of user code setterFinalize:contributor
        // End of user code
    }

    // Start of user code setterAnnotation:created
    // End of user code
    public void setCreated(final Date created )
    {
        // Start of user code setterInit:created
        // End of user code
        this.created = created;
        // Start of user code setterFinalize:created
        // End of user code
    }

    // Start of user code setterAnnotation:creator
    // End of user code
    public void setCreator(final Set<Link> creator )
    {
        // Start of user code setterInit:creator
        // End of user code
        this.creator.clear();
        if (creator != null)
        {
            this.creator.addAll(creator);
        }
        // Start of user code setterFinalize:creator
        // End of user code
    }

    // Start of user code setterAnnotation:description
    // End of user code
    public void setDescription(final String description )
    {
        // Start of user code setterInit:description
        // End of user code
        this.description = description;
        // Start of user code setterFinalize:description
        // End of user code
    }

    // Start of user code setterAnnotation:identifier
    // End of user code
    public void setIdentifier(final String identifier )
    {
        // Start of user code setterInit:identifier
        // End of user code
        this.identifier = identifier;
        // Start of user code setterFinalize:identifier
        // End of user code
    }

    // Start of user code setterAnnotation:modified
    // End of user code
    public void setModified(final Date modified )
    {
        // Start of user code setterInit:modified
        // End of user code
        this.modified = modified;
        // Start of user code setterFinalize:modified
        // End of user code
    }

    // Start of user code setterAnnotation:subject
    // End of user code
    public void setSubject(final Set<String> subject )
    {
        // Start of user code setterInit:subject
        // End of user code
        this.subject.clear();
        if (subject != null)
        {
            this.subject.addAll(subject);
        }
        // Start of user code setterFinalize:subject
        // End of user code
    }

    // Start of user code setterAnnotation:title
    // End of user code
    public void setTitle(final String title )
    {
        // Start of user code setterInit:title
        // End of user code
        this.title = title;
        // Start of user code setterFinalize:title
        // End of user code
    }

    // Start of user code setterAnnotation:acceptedBy
    // End of user code
    public void setAcceptedBy(final String acceptedBy )
    {
        // Start of user code setterInit:acceptedBy
        // End of user code
        this.acceptedBy = acceptedBy;
        // Start of user code setterFinalize:acceptedBy
        // End of user code
    }

    // Start of user code setterAnnotation:branch
    // End of user code
    public void setBranch(final Link branch )
    {
        // Start of user code setterInit:branch
        // End of user code
        this.branch = branch;
        // Start of user code setterFinalize:branch
        // End of user code
    }

    // Start of user code setterAnnotation:component
    // End of user code
    public void setComponent(final Link component )
    {
        // Start of user code setterInit:component
        // End of user code
        this.component = component;
        // Start of user code setterFinalize:component
        // End of user code
    }

    // Start of user code setterAnnotation:contribution
    // End of user code
    public void setContribution(final Link contribution )
    {
        // Start of user code setterInit:contribution
        // End of user code
        this.contribution = contribution;
        // Start of user code setterFinalize:contribution
        // End of user code
    }

    // Start of user code setterAnnotation:selections
    // End of user code
    public void setSelections(final Set<Link> selections )
    {
        // Start of user code setterInit:selections
        // End of user code
        this.selections.clear();
        if (selections != null)
        {
            this.selections.addAll(selections);
        }
        // Start of user code setterFinalize:selections
        // End of user code
    }

    // Start of user code setterAnnotation:archived
    // End of user code
    public void setArchived(final Boolean archived )
    {
        // Start of user code setterInit:archived
        // End of user code
        this.archived = archived;
        // Start of user code setterFinalize:archived
        // End of user code
    }

    // Start of user code setterAnnotation:instanceShape
    // End of user code
    public void setInstanceShape(final Set<Link> instanceShape )
    {
        // Start of user code setterInit:instanceShape
        // End of user code
        this.instanceShape.clear();
        if (instanceShape != null)
        {
            this.instanceShape.addAll(instanceShape);
        }
        // Start of user code setterFinalize:instanceShape
        // End of user code
    }

    // Start of user code setterAnnotation:modifiedBy
    // End of user code
    public void setModifiedBy(final Set<Link> modifiedBy )
    {
        // Start of user code setterInit:modifiedBy
        // End of user code
        this.modifiedBy.clear();
        if (modifiedBy != null)
        {
            this.modifiedBy.addAll(modifiedBy);
        }
        // Start of user code setterFinalize:modifiedBy
        // End of user code
    }

    // Start of user code setterAnnotation:release
    // End of user code
    public void setRelease(final Set<Link> release )
    {
        // Start of user code setterInit:release
        // End of user code
        this.release.clear();
        if (release != null)
        {
            this.release.addAll(release);
        }
        // Start of user code setterFinalize:release
        // End of user code
    }

    // Start of user code setterAnnotation:serviceProvider
    // End of user code
    public void setServiceProvider(final Set<Link> serviceProvider )
    {
        // Start of user code setterInit:serviceProvider
        // End of user code
        this.serviceProvider.clear();
        if (serviceProvider != null)
        {
            this.serviceProvider.addAll(serviceProvider);
        }
        // Start of user code setterFinalize:serviceProvider
        // End of user code
    }

    // Start of user code setterAnnotation:shortId
    // End of user code
    public void setShortId(final String shortId )
    {
        // Start of user code setterInit:shortId
        // End of user code
        this.shortId = shortId;
        // Start of user code setterFinalize:shortId
        // End of user code
    }

    // Start of user code setterAnnotation:shortTitle
    // End of user code
    public void setShortTitle(final String shortTitle )
    {
        // Start of user code setterInit:shortTitle
        // End of user code
        this.shortTitle = shortTitle;
        // Start of user code setterFinalize:shortTitle
        // End of user code
    }

}
