//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:51:28 PM IST 
//


package com.pacificmetrics.saaif.item1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *     Define the IconSpec type.
 *     Image to be rendered on the palette.
 *     
 * 
 * <p>Java class for IconSpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IconSpecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileSpec" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}FileNameType"/>
 *         &lt;element name="Label" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}LabelType"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}positiveIntType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IconSpecType", propOrder = {
    "fileSpec",
    "label",
    "any"
})
public class IconSpecType {

    @XmlElement(name = "FileSpec", required = true)
    protected String fileSpec;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "index")
    protected Integer index;

    /**
     * Gets the value of the fileSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSpec() {
        return fileSpec;
    }

    /**
     * Sets the value of the fileSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSpec(String value) {
        this.fileSpec = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

}
