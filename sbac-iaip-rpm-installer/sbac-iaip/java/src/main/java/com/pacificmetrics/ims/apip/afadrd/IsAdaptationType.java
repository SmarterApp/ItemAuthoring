//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package com.pacificmetrics.ims.apip.afadrd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The Is_Adaptation complexType is the container for a collection of information that states what resource the
 * described resource provides an adaptation of, and the extent to which it does so.
 *             
 * 
 * <p>Java class for Is_Adaptation.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Is_Adaptation.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isAdaptationOf" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="extent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="all"/>
 *               &lt;enumeration value="part"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsafa_drdv2p0}grpStrict.any"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Is_Adaptation.Type", propOrder = {
    "isAdaptationOf",
    "extent",
    "anies"
})
public class IsAdaptationType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String isAdaptationOf;
    @XmlElement(required = true, defaultValue = "all")
    protected String extent;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;

    /**
     * Gets the value of the isAdaptationOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAdaptationOf() {
        return isAdaptationOf;
    }

    /**
     * Sets the value of the isAdaptationOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAdaptationOf(String value) {
        this.isAdaptationOf = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(String value) {
        this.extent = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Object>();
        }
        return this.anies;
    }

}
