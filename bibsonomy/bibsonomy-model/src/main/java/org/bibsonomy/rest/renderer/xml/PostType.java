//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.27 at 01:17:20 PM CEST 
//


package org.bibsonomy.rest.renderer.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PostType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{}UserType"/>
 *         &lt;element name="group" type="{}GroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tag" type="{}TagType" maxOccurs="unbounded"/>
 *         &lt;element name="documents" type="{}DocumentsType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="bookmark" type="{}BookmarkType"/>
 *           &lt;element name="bibtex" type="{}BibtexType"/>
 *           &lt;element name="goldStandardPublication" type="{}GoldStandardPublicationType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="postingdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="changedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostType", propOrder = {
    "user",
    "group",
    "tag",
    "documents",
    "bookmark",
    "bibtex",
    "goldStandardPublication"
})
public class PostType {

    @XmlElement(required = true)
    protected UserType user;
    protected List<GroupType> group;
    @XmlElement(required = true)
    protected List<TagType> tag;
    protected DocumentsType documents;
    protected BookmarkType bookmark;
    protected BibtexType bibtex;
    protected GoldStandardPublicationType goldStandardPublication;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postingdate;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedate;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupType }
     * 
     * 
     */
    public List<GroupType> getGroup() {
        if (group == null) {
            group = new ArrayList<GroupType>();
        }
        return this.group;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagType }
     * 
     * 
     */
    public List<TagType> getTag() {
        if (tag == null) {
            tag = new ArrayList<TagType>();
        }
        return this.tag;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsType }
     *     
     */
    public DocumentsType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsType }
     *     
     */
    public void setDocuments(DocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the bookmark property.
     * 
     * @return
     *     possible object is
     *     {@link BookmarkType }
     *     
     */
    public BookmarkType getBookmark() {
        return bookmark;
    }

    /**
     * Sets the value of the bookmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookmarkType }
     *     
     */
    public void setBookmark(BookmarkType value) {
        this.bookmark = value;
    }

    /**
     * Gets the value of the bibtex property.
     * 
     * @return
     *     possible object is
     *     {@link BibtexType }
     *     
     */
    public BibtexType getBibtex() {
        return bibtex;
    }

    /**
     * Sets the value of the bibtex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BibtexType }
     *     
     */
    public void setBibtex(BibtexType value) {
        this.bibtex = value;
    }

    /**
     * Gets the value of the goldStandardPublication property.
     * 
     * @return
     *     possible object is
     *     {@link GoldStandardPublicationType }
     *     
     */
    public GoldStandardPublicationType getGoldStandardPublication() {
        return goldStandardPublication;
    }

    /**
     * Sets the value of the goldStandardPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoldStandardPublicationType }
     *     
     */
    public void setGoldStandardPublication(GoldStandardPublicationType value) {
        this.goldStandardPublication = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the postingdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingdate() {
        return postingdate;
    }

    /**
     * Sets the value of the postingdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingdate(XMLGregorianCalendar value) {
        this.postingdate = value;
    }

    /**
     * Gets the value of the changedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedate() {
        return changedate;
    }

    /**
     * Sets the value of the changedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedate(XMLGregorianCalendar value) {
        this.changedate = value;
    }

}