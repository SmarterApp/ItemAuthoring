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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *     Define the PreSetAnswerPart type.
 *     Answer components included in the original question rendering.
 *     
 * 
 * <p>Java class for PreSetAnswerPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreSetAnswerPartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnswerSet" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}AnswerSetType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreSetAnswerPartType", propOrder = {
    "answerSet",
    "any"
})
public class PreSetAnswerPartType {

    @XmlElement(name = "AnswerSet")
    protected AnswerSetType answerSet;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the answerSet property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerSetType }
     *     
     */
    public AnswerSetType getAnswerSet() {
        return answerSet;
    }

    /**
     * Sets the value of the answerSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerSetType }
     *     
     */
    public void setAnswerSet(AnswerSetType value) {
        this.answerSet = value;
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

}
