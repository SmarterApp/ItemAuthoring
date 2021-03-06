//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti.item;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3.xinclude.Include;


/**
 * 
 *                 The ResponseProcessingFragment complexType is the container for a group of response rules. A responseProcessingFragment is a simple group of responseRules which are grouped together in order to allow them to be managed as a separate resource. It should not be used for any other purpose.
 *             
 * 
 * <p>Java class for ResponseProcessingFragment.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseProcessingFragment.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/2001/XInclude}include"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}responseCondition"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}responseProcessingFragment"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}setOutcomeValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}exitResponse"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}lookupOutcomeValue"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessingFragment.Type", propOrder = {
    "includesAndResponseConditionsAndResponseProcessingFragments"
})
@XmlRootElement(name = "responseProcessingFragment")
public class ResponseProcessingFragment {

    @XmlElements({
        @XmlElement(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = Include.class),
        @XmlElement(name = "responseCondition", type = ResponseCondition.class),
        @XmlElement(name = "responseProcessingFragment", type = ResponseProcessingFragment.class),
        @XmlElement(name = "setOutcomeValue", type = SetValueType.class),
        @XmlElement(name = "exitResponse", type = EmptyPrimitiveTypeType.class),
        @XmlElement(name = "lookupOutcomeValue", type = LookupOutcomeValue.class)
    })
    protected List<java.lang.Object> includesAndResponseConditionsAndResponseProcessingFragments;

    /**
     * Gets the value of the includesAndResponseConditionsAndResponseProcessingFragments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includesAndResponseConditionsAndResponseProcessingFragments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludesAndResponseConditionsAndResponseProcessingFragments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * {@link ResponseCondition }
     * {@link ResponseProcessingFragment }
     * {@link SetValueType }
     * {@link EmptyPrimitiveTypeType }
     * {@link LookupOutcomeValue }
     * 
     * 
     */
    public List<java.lang.Object> getIncludesAndResponseConditionsAndResponseProcessingFragments() {
        if (includesAndResponseConditionsAndResponseProcessingFragments == null) {
            includesAndResponseConditionsAndResponseProcessingFragments = new ArrayList<java.lang.Object>();
        }
        return this.includesAndResponseConditionsAndResponseProcessingFragments;
    }

}
