//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:53:42 PM IST 
//


package com.pacificmetrics.saaif.wordlist;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pacificmetrics.saaif.wordlist package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Itemrelease_QNAME = new QName("http://www.smarterapp.org/xsd/saaif/v1p0/wordlist_v1p0.xsd", "itemrelease");
    private final static QName _Item_QNAME = new QName("http://www.smarterapp.org/xsd/saaif/v1p0/wordlist_v1p0.xsd", "item");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pacificmetrics.saaif.wordlist
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WordlistitemType }
     * 
     */
    public WordlistitemType createWordlistitemType() {
        return new WordlistitemType();
    }

    /**
     * Create an instance of {@link WordlistreleaseType }
     * 
     */
    public WordlistreleaseType createWordlistreleaseType() {
        return new WordlistreleaseType();
    }

    /**
     * Create an instance of {@link KeywordType }
     * 
     */
    public KeywordType createKeywordType() {
        return new KeywordType();
    }

    /**
     * Create an instance of {@link HtmlType }
     * 
     */
    public HtmlType createHtmlType() {
        return new HtmlType();
    }

    /**
     * Create an instance of {@link W3XHtmlType }
     * 
     */
    public W3XHtmlType createW3XHtmlType() {
        return new W3XHtmlType();
    }

    /**
     * Create an instance of {@link KeywordListType }
     * 
     */
    public KeywordListType createKeywordListType() {
        return new KeywordListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordlistreleaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.smarterapp.org/xsd/saaif/v1p0/wordlist_v1p0.xsd", name = "itemrelease")
    public JAXBElement<WordlistreleaseType> createItemrelease(WordlistreleaseType value) {
        return new JAXBElement<WordlistreleaseType>(_Itemrelease_QNAME, WordlistreleaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WordlistitemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.smarterapp.org/xsd/saaif/v1p0/wordlist_v1p0.xsd", name = "item")
    public JAXBElement<WordlistitemType> createItem(WordlistitemType value) {
        return new JAXBElement<WordlistitemType>(_Item_QNAME, WordlistitemType.class, null, value);
    }

}
