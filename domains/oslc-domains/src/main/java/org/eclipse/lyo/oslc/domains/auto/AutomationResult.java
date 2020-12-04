// Start of user code Copyright
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
// End of user code

package org.eclipse.lyo.oslc.domains.auto;

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

import org.eclipse.lyo.oslc.domains.auto.Oslc_autoDomainConstants;


import org.eclipse.lyo.oslc.domains.auto.Oslc_autoDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsDomainConstants;
import org.eclipse.lyo.oslc.domains.FoafDomainConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcDomainConstants;
import org.eclipse.lyo.oslc.domains.RdfDomainConstants;
import org.eclipse.lyo.oslc.domains.DctermsVocabularyConstants;

import org.eclipse.lyo.oslc.domains.RdfVocabularyConstants;
import org.eclipse.lyo.oslc.domains.Person;
import org.eclipse.lyo.oslc.domains.Person;
import org.eclipse.lyo.oslc.domains.auto.ParameterInstance;
import org.eclipse.lyo.oslc.domains.auto.ParameterInstance;
import org.eclipse.lyo.oslc.domains.auto.AutomationRequest;
import org.eclipse.lyo.oslc.domains.auto.AutomationPlan;

// Start of user code imports
// End of user code

// Start of user code preClassCode
// End of user code

// Start of user code classAnnotations
// End of user code
@OslcNamespace(Oslc_autoDomainConstants.AUTOMATIONRESULT_NAMESPACE)
@OslcName(Oslc_autoDomainConstants.AUTOMATIONRESULT_LOCALNAME)
@OslcResourceShape(title = "AutomationResult Resource Shape", describes = Oslc_autoDomainConstants.AUTOMATIONRESULT_TYPE)
public class AutomationResult
    extends AbstractResource
    implements IAutomationResult
{
    // Start of user code attributeAnnotation:contributor
    // End of user code
    private Set<Link> contributor = new HashSet<Link>();
    // Start of user code attributeAnnotation:created
    // End of user code
    private Date created;
    // Start of user code attributeAnnotation:creator
    // End of user code
    private Set<Link> creator = new HashSet<Link>();
    // Start of user code attributeAnnotation:identifier
    // End of user code
    private String identifier;
    // Start of user code attributeAnnotation:modified
    // End of user code
    private Date modified;
    // Start of user code attributeAnnotation:type
    // End of user code
    private Set<Link> type = new HashSet<Link>();
    // Start of user code attributeAnnotation:subject
    // End of user code
    private Set<String> subject = new HashSet<String>();
    // Start of user code attributeAnnotation:title
    // End of user code
    private String title;
    // Start of user code attributeAnnotation:instanceShape
    // End of user code
    private Set<Link> instanceShape = new HashSet<Link>();
    // Start of user code attributeAnnotation:serviceProvider
    // End of user code
    private Set<Link> serviceProvider = new HashSet<Link>();
    // Start of user code attributeAnnotation:state
    // End of user code
    private Set<Link> state = new HashSet<Link>();
    // Start of user code attributeAnnotation:desiredState
    // End of user code
    private Link desiredState;
    // Start of user code attributeAnnotation:verdict
    // End of user code
    private Set<Link> verdict = new HashSet<Link>();
    // Start of user code attributeAnnotation:contribution
    // End of user code
    private Set<Link> contribution = new HashSet<Link>();
    // Start of user code attributeAnnotation:inputParameter
    // End of user code
    private Set<Link> inputParameter = new HashSet<Link>();
    // Start of user code attributeAnnotation:outputParameter
    // End of user code
    private Set<Link> outputParameter = new HashSet<Link>();
    // Start of user code attributeAnnotation:producedByAutomationRequest
    // End of user code
    private Link producedByAutomationRequest;
    // Start of user code attributeAnnotation:reportsOnAutomationPlan
    // End of user code
    private Link reportsOnAutomationPlan;
    
    // Start of user code classAttributes
    // End of user code
    // Start of user code classMethods
    // End of user code
    public AutomationResult()
    {
        super();
    
        // Start of user code constructor1
        // End of user code
    }
    
    public AutomationResult(final URI about)
    {
        super(about);
    
        // Start of user code constructor2
        // End of user code
    }
    
    public static ResourceShape createResourceShape() throws OslcCoreApplicationException, URISyntaxException {
        return ResourceShapeFactory.createResourceShape(OSLC4JUtils.getServletURI(),
        OslcConstants.PATH_RESOURCE_SHAPES,
        Oslc_autoDomainConstants.AUTOMATIONRESULT_PATH,
        AutomationResult.class);
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
            result = result + "{a Local AutomationResult Resource} - update AutomationResult.toString() to present resource as desired.";
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
    
    public void addType(final Link type)
    {
        this.type.add(type);
    }
    
    public void addSubject(final String subject)
    {
        this.subject.add(subject);
    }
    
    public void addInstanceShape(final Link instanceShape)
    {
        this.instanceShape.add(instanceShape);
    }
    
    public void addServiceProvider(final Link serviceProvider)
    {
        this.serviceProvider.add(serviceProvider);
    }
    
    public void addState(final Link state)
    {
        this.state.add(state);
    }
    
    public void addVerdict(final Link verdict)
    {
        this.verdict.add(verdict);
    }
    
    public void addContribution(final Link contribution)
    {
        this.contribution.add(contribution);
    }
    
    public void addInputParameter(final Link inputParameter)
    {
        this.inputParameter.add(inputParameter);
    }
    
    public void addOutputParameter(final Link outputParameter)
    {
        this.outputParameter.add(outputParameter);
    }
    
    
    // Start of user code getterAnnotation:contributor
    // End of user code
    @OslcName("contributor")
    @OslcPropertyDefinition(DctermsVocabularyConstants.DUBLIN_CORE_NAMSPACE + "contributor")
    @OslcDescription("Contributor or contributors to the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
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
    @OslcDescription("Creator or creators of the resource. It is likely that the target resource will be a foaf:Person but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({FoafDomainConstants.PERSON_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getCreator()
    {
        // Start of user code getterInit:creator
        // End of user code
        return creator;
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
    
    // Start of user code getterAnnotation:type
    // End of user code
    @OslcName("type")
    @OslcPropertyDefinition(RdfVocabularyConstants.RDF_NAMSPACE + "type")
    @OslcDescription("The resource type URIs")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Set<Link> getType()
    {
        // Start of user code getterInit:type
        // End of user code
        return type;
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
    
    // Start of user code getterAnnotation:state
    // End of user code
    @OslcName("state")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "state")
    @OslcDescription("Used to indicate the state of the automation request based on values defined by the service provider. Most often a read-only property. It is expected that this will be a resource reference to a definition of a valid automation request state on the service provider.")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(true)
    public Set<Link> getState()
    {
        // Start of user code getterInit:state
        // End of user code
        return state;
    }
    
    // Start of user code getterAnnotation:desiredState
    // End of user code
    @OslcName("desiredState")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "desiredState")
    @OslcDescription("Used to indicate the desired state of the Automation Request based on values defined by the service provider. It is expected that this will be a resource reference to a definition of a valid automation request state on the service provider.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Link getDesiredState()
    {
        // Start of user code getterInit:desiredState
        // End of user code
        return desiredState;
    }
    
    // Start of user code getterAnnotation:verdict
    // End of user code
    @OslcName("verdict")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "verdict")
    @OslcDescription("Used to indicate the verdict of the automation result based on values defined by the service provider. Most often a read-only property. It is expected that this will be a resource reference to a definition of a valid automation result verdict on the service provider.")
    @OslcOccurs(Occurs.OneOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Set<Link> getVerdict()
    {
        // Start of user code getterInit:verdict
        // End of user code
        return verdict;
    }
    
    // Start of user code getterAnnotation:contribution
    // End of user code
    @OslcName("contribution")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "contribution")
    @OslcDescription("A result contribution associated with this automation result. It is recommended that the contribution be an inline resource which can be retrieved with the automation result. The recommended attributes beyond the contribution itself are dcterms:title, dcterms:description and dcterms:type to provide a description of the contribution which would be appropriate for display in a simple UI for an automation result.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcReadOnly(false)
    public Set<Link> getContribution()
    {
        // Start of user code getterInit:contribution
        // End of user code
        return contribution;
    }
    
    // Start of user code getterAnnotation:inputParameter
    // End of user code
    @OslcName("inputParameter")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "inputParameter")
    @OslcDescription("Parameters provided when Automation Requests are created. These include parameters provided by the creator of the Automation Request (whether by delegated UI or HTTP POST) and MAY include additional parameters added by the service provider during Automation Request creation. See the definition of the oslc_auto:parameterDefinition attribute of the Automation Plan for additional guidance on determining which parameters are required. Creators of Automation Requests MAY provide parameters beyond those defined in the Automation Plan without guarantee the service provider will recognize or honor them. It is expected that this attribute is write-able on Automation Request creation and read-only thereafter.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_autoDomainConstants.PARAMETERINSTANCE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getInputParameter()
    {
        // Start of user code getterInit:inputParameter
        // End of user code
        return inputParameter;
    }
    
    // Start of user code getterAnnotation:outputParameter
    // End of user code
    @OslcName("outputParameter")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "outputParameter")
    @OslcDescription("Automation Result output parameters are parameters associated with the automation execution which produced this Result. This includes the final value of all parameters used to initiate the execution and any additional parameters which may have been created during automation execution by the service provider or external agents. The value of a given oslc_auto:outputParameter MAY change as the execution proceeds. Point-in-time accuracy of the values of output parameters is not covered by this specification. Once the Automation Result is in a final state ( oslc_auto:complete or oslc_auto:canceled), the oslc_auto:outputParameter values MUST NOT change.")
    @OslcOccurs(Occurs.ZeroOrMany)
    @OslcValueType(ValueType.Resource)
    @OslcRange({Oslc_autoDomainConstants.PARAMETERINSTANCE_TYPE})
    @OslcReadOnly(false)
    public Set<Link> getOutputParameter()
    {
        // Start of user code getterInit:outputParameter
        // End of user code
        return outputParameter;
    }
    
    // Start of user code getterAnnotation:producedByAutomationRequest
    // End of user code
    @OslcName("producedByAutomationRequest")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "producedByAutomationRequest")
    @OslcDescription("Automation Request which produced the Automation Result. It is likely that the target resource will be an oslc_auto:AutomationRequest but that is not necessarily the case.")
    @OslcOccurs(Occurs.ZeroOrOne)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_autoDomainConstants.AUTOMATIONREQUEST_TYPE})
    @OslcReadOnly(false)
    public Link getProducedByAutomationRequest()
    {
        // Start of user code getterInit:producedByAutomationRequest
        // End of user code
        return producedByAutomationRequest;
    }
    
    // Start of user code getterAnnotation:reportsOnAutomationPlan
    // End of user code
    @OslcName("reportsOnAutomationPlan")
    @OslcPropertyDefinition(Oslc_autoDomainConstants.AUTOMATION_NAMSPACE + "reportsOnAutomationPlan")
    @OslcDescription("Automation Plan which the Automation Result reports on. It is likely that the target resource will be an oslc_auto:AutomationPlan but that is not necessarily the case.")
    @OslcOccurs(Occurs.ExactlyOne)
    @OslcValueType(ValueType.Resource)
    @OslcRepresentation(Representation.Reference)
    @OslcRange({Oslc_autoDomainConstants.AUTOMATIONPLAN_TYPE})
    @OslcReadOnly(false)
    public Link getReportsOnAutomationPlan()
    {
        // Start of user code getterInit:reportsOnAutomationPlan
        // End of user code
        return reportsOnAutomationPlan;
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
    
    // Start of user code setterAnnotation:type
    // End of user code
    public void setType(final Set<Link> type )
    {
        // Start of user code setterInit:type
        // End of user code
        this.type.clear();
        if (type != null)
        {
            this.type.addAll(type);
        }
    
        // Start of user code setterFinalize:type
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
    
    // Start of user code setterAnnotation:state
    // End of user code
    public void setState(final Set<Link> state )
    {
        // Start of user code setterInit:state
        // End of user code
        this.state.clear();
        if (state != null)
        {
            this.state.addAll(state);
        }
    
        // Start of user code setterFinalize:state
        // End of user code
    }
    
    // Start of user code setterAnnotation:desiredState
    // End of user code
    public void setDesiredState(final Link desiredState )
    {
        // Start of user code setterInit:desiredState
        // End of user code
        this.desiredState = desiredState;
    
        // Start of user code setterFinalize:desiredState
        // End of user code
    }
    
    // Start of user code setterAnnotation:verdict
    // End of user code
    public void setVerdict(final Set<Link> verdict )
    {
        // Start of user code setterInit:verdict
        // End of user code
        this.verdict.clear();
        if (verdict != null)
        {
            this.verdict.addAll(verdict);
        }
    
        // Start of user code setterFinalize:verdict
        // End of user code
    }
    
    // Start of user code setterAnnotation:contribution
    // End of user code
    public void setContribution(final Set<Link> contribution )
    {
        // Start of user code setterInit:contribution
        // End of user code
        this.contribution.clear();
        if (contribution != null)
        {
            this.contribution.addAll(contribution);
        }
    
        // Start of user code setterFinalize:contribution
        // End of user code
    }
    
    // Start of user code setterAnnotation:inputParameter
    // End of user code
    public void setInputParameter(final Set<Link> inputParameter )
    {
        // Start of user code setterInit:inputParameter
        // End of user code
        this.inputParameter.clear();
        if (inputParameter != null)
        {
            this.inputParameter.addAll(inputParameter);
        }
    
        // Start of user code setterFinalize:inputParameter
        // End of user code
    }
    
    // Start of user code setterAnnotation:outputParameter
    // End of user code
    public void setOutputParameter(final Set<Link> outputParameter )
    {
        // Start of user code setterInit:outputParameter
        // End of user code
        this.outputParameter.clear();
        if (outputParameter != null)
        {
            this.outputParameter.addAll(outputParameter);
        }
    
        // Start of user code setterFinalize:outputParameter
        // End of user code
    }
    
    // Start of user code setterAnnotation:producedByAutomationRequest
    // End of user code
    public void setProducedByAutomationRequest(final Link producedByAutomationRequest )
    {
        // Start of user code setterInit:producedByAutomationRequest
        // End of user code
        this.producedByAutomationRequest = producedByAutomationRequest;
    
        // Start of user code setterFinalize:producedByAutomationRequest
        // End of user code
    }
    
    // Start of user code setterAnnotation:reportsOnAutomationPlan
    // End of user code
    public void setReportsOnAutomationPlan(final Link reportsOnAutomationPlan )
    {
        // Start of user code setterInit:reportsOnAutomationPlan
        // End of user code
        this.reportsOnAutomationPlan = reportsOnAutomationPlan;
    
        // Start of user code setterFinalize:reportsOnAutomationPlan
        // End of user code
    }
    
    
}
