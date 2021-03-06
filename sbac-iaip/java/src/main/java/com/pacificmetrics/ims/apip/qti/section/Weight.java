//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.10 at 09:54:32 AM IST 
//


package com.pacificmetrics.ims.apip.qti.section;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The Weight complexType stores the weighting information. The contribution of an individual item score to an overall test score typically varies from test to test. The score of the item is said to be weighted. Weights are defined as part of each reference to an item (assessmentItemRef) within a test.
 *             
 * 
 * <p>Java class for Weight.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weight.Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}EmptyPrimitiveType.Type">
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}identifier.Weight.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}value.Weight.Attr"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weight.Type")
@XmlRootElement(name = "weight")
public class Weight
    extends EmptyPrimitiveTypeType
{

    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "value", required = true)
    protected double value;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
