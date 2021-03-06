//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:54:09 PM IST 
//


package com.pacificmetrics.saaif.tutorial;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * 
 *     Define the item type for a Tutorial Item.
 *     
 * 
 * <p>Java class for tutorialitemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tutorialitemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associatedpassage" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}associatedpassageType" minOccurs="0"/>
 *         &lt;element name="attriblist" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}itemattriblistType" minOccurs="0"/>
 *         &lt;element name="resourceslist" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}resourceslistType" minOccurs="0"/>
 *         &lt;element name="statistic" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}statisticType" minOccurs="0"/>
 *         &lt;element name="MachineRubric" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}MachineRubricType" minOccurs="0"/>
 *         &lt;element name="RendererSpec" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}RendererSpecType" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}tutorialcontentType" maxOccurs="unbounded"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}itemAttr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tutorialitemType", propOrder = {
    "associatedpassage",
    "attriblist",
    "resourceslist",
    "statistic",
    "machineRubric",
    "rendererSpec",
    "content",
    "any"
})
public class TutorialitemType {

    protected String associatedpassage;
    protected ItemattriblistType attriblist;
    protected ResourceslistType resourceslist;
    protected StatisticType statistic;
    @XmlElement(name = "MachineRubric")
    protected MachineRubricType machineRubric;
    @XmlElement(name = "RendererSpec")
    protected RendererSpecType rendererSpec;
    @XmlElement(required = true)
    protected List<TutorialcontentType> content;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "format")
    protected ItemFormatType format;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "bankkey")
    protected String bankkey;
    @XmlAttribute(name = "schemaversion")
    protected String schemaversion;

    /**
     * Gets the value of the associatedpassage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedpassage() {
        return associatedpassage;
    }

    /**
     * Sets the value of the associatedpassage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedpassage(String value) {
        this.associatedpassage = value;
    }

    /**
     * Gets the value of the attriblist property.
     * 
     * @return
     *     possible object is
     *     {@link ItemattriblistType }
     *     
     */
    public ItemattriblistType getAttriblist() {
        return attriblist;
    }

    /**
     * Sets the value of the attriblist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemattriblistType }
     *     
     */
    public void setAttriblist(ItemattriblistType value) {
        this.attriblist = value;
    }

    /**
     * Gets the value of the resourceslist property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceslistType }
     *     
     */
    public ResourceslistType getResourceslist() {
        return resourceslist;
    }

    /**
     * Sets the value of the resourceslist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceslistType }
     *     
     */
    public void setResourceslist(ResourceslistType value) {
        this.resourceslist = value;
    }

    /**
     * Gets the value of the statistic property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticType }
     *     
     */
    public StatisticType getStatistic() {
        return statistic;
    }

    /**
     * Sets the value of the statistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticType }
     *     
     */
    public void setStatistic(StatisticType value) {
        this.statistic = value;
    }

    /**
     * Gets the value of the machineRubric property.
     * 
     * @return
     *     possible object is
     *     {@link MachineRubricType }
     *     
     */
    public MachineRubricType getMachineRubric() {
        return machineRubric;
    }

    /**
     * Sets the value of the machineRubric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MachineRubricType }
     *     
     */
    public void setMachineRubric(MachineRubricType value) {
        this.machineRubric = value;
    }

    /**
     * Gets the value of the rendererSpec property.
     * 
     * @return
     *     possible object is
     *     {@link RendererSpecType }
     *     
     */
    public RendererSpecType getRendererSpec() {
        return rendererSpec;
    }

    /**
     * Sets the value of the rendererSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RendererSpecType }
     *     
     */
    public void setRendererSpec(RendererSpecType value) {
        this.rendererSpec = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TutorialcontentType }
     * 
     * 
     */
    public List<TutorialcontentType> getContent() {
        if (content == null) {
            content = new ArrayList<TutorialcontentType>();
        }
        return this.content;
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFormatType }
     *     
     */
    public ItemFormatType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFormatType }
     *     
     */
    public void setFormat(ItemFormatType value) {
        this.format = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the bankkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankkey() {
        return bankkey;
    }

    /**
     * Sets the value of the bankkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankkey(String value) {
        this.bankkey = value;
    }

    /**
     * Gets the value of the schemaversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaversion() {
        return schemaversion;
    }

    /**
     * Sets the value of the schemaversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaversion(String value) {
        this.schemaversion = value;
    }

}
