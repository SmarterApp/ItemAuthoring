//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package org.ieee.ltsc.lom.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for General.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="General.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="identifier" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}Identifier.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}LangString.Type" minOccurs="0"/>
 *         &lt;element name="language" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}CharacterString.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="description" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}LangString.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}LangString.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coverage" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}LangString.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="structure" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}Structure.Type" minOccurs="0"/>
 *         &lt;element name="aggregationLevel" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}AggregationLevel.Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "General.Type", propOrder = {
    "identifiersAndTitlesAndLanguages"
})
public class GeneralType {

    @XmlElementRefs({
        @XmlElementRef(name = "coverage", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aggregationLevel", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "structure", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keyword", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "description", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "identifier", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> identifiersAndTitlesAndLanguages;

    /**
     * Gets the value of the identifiersAndTitlesAndLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiersAndTitlesAndLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiersAndTitlesAndLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link AggregationLevelType }{@code >}
     * {@link JAXBElement }{@code <}{@link StructureType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getIdentifiersAndTitlesAndLanguages() {
        if (identifiersAndTitlesAndLanguages == null) {
            identifiersAndTitlesAndLanguages = new ArrayList<JAXBElement<?>>();
        }
        return this.identifiersAndTitlesAndLanguages;
    }

}