//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.06 at 01:14:11 PM MST 
//

package com.pacificmetrics.apip.cp.manifest;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for manifestType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="manifestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lom" type="{http://pacificmetrics.com/apip/cp/manifest}lomManifestType"/>
 *         &lt;element name="ccss" type="{http://pacificmetrics.com/apip/cp/manifest}ccssType"/>
 *         &lt;element name="resource" type="{http://pacificmetrics.com/apip/cp/manifest}resourceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifestType", propOrder = { "lom", "ccss", "resources" })
@XmlRootElement(name = "manifest")
public class Manifest {

    @XmlElement(required = true)
    protected LomManifestType lom;
    @XmlElement(required = true)
    protected CcssType ccss;
    @XmlElement(name = "resource")
    protected List<ResourceType> resources;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "schema")
    protected String schema;
    @XmlAttribute(name = "schemaVersion")
    protected String schemaVersion;

    /**
     * Gets the value of the lom property.
     * 
     * @return possible object is {@link LomManifestType }
     * 
     */
    public LomManifestType getLom() {
        return lom;
    }

    /**
     * Sets the value of the lom property.
     * 
     * @param value
     *            allowed object is {@link LomManifestType }
     * 
     */
    public void setLom(LomManifestType value) {
        this.lom = value;
    }

    /**
     * Gets the value of the ccss property.
     * 
     * @return possible object is {@link CcssType }
     * 
     */
    public CcssType getCcss() {
        return ccss;
    }

    /**
     * Sets the value of the ccss property.
     * 
     * @param value
     *            allowed object is {@link CcssType }
     * 
     */
    public void setCcss(CcssType value) {
        this.ccss = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceType }
     * 
     * 
     */
    public List<ResourceType> getResources() {
        if (resources == null) {
            resources = new LinkedList<ResourceType>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
