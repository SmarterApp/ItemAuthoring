//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.06 at 01:14:11 PM MST 
//


package com.pacificmetrics.apip.cp.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cost" type="{http://pacificmetrics.com/apip/cp/manifest}costType"/>
 *         &lt;element name="copyrightAndOtherRestrictions" type="{http://pacificmetrics.com/apip/cp/manifest}copyrightAndOtherRestrictionsType"/>
 *         &lt;element name="description" type="{http://pacificmetrics.com/apip/cp/manifest}descriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rightsType", propOrder = {
    "cost",
    "copyrightAndOtherRestrictions",
    "description"
})
public class RightsType {

    @XmlElement(required = true)
    protected CostType cost;
    @XmlElement(required = true)
    protected CopyrightAndOtherRestrictionsType copyrightAndOtherRestrictions;
    @XmlElement(required = true)
    protected DescriptionType description;

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link CostType }
     *     
     */
    public CostType getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostType }
     *     
     */
    public void setCost(CostType value) {
        this.cost = value;
    }

    /**
     * Gets the value of the copyrightAndOtherRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link CopyrightAndOtherRestrictionsType }
     *     
     */
    public CopyrightAndOtherRestrictionsType getCopyrightAndOtherRestrictions() {
        return copyrightAndOtherRestrictions;
    }

    /**
     * Sets the value of the copyrightAndOtherRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyrightAndOtherRestrictionsType }
     *     
     */
    public void setCopyrightAndOtherRestrictions(CopyrightAndOtherRestrictionsType value) {
        this.copyrightAndOtherRestrictions = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

}
