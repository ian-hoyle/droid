//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.22 at 11:40:59 AM GMT 
//


package uk.gov.nationalarchives.droid.report.planets.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ByFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ByFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="formatItem" type="{http://www.nationalarchives.gov.uk/CollectionProfile}FormatItemType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @deprecated PLANETS XML is now generated using XSLT over normal report xml files.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ByFormatType", propOrder = {
    "formatItem"
})
@Deprecated
public class ByFormatType {

    protected List<FormatItemType> formatItem;

    /**
     * Gets the value of the formatItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatItemType }
     * 
     * 
     */
    public List<FormatItemType> getFormatItem() {
        if (formatItem == null) {
            formatItem = new ArrayList<FormatItemType>();
        }
        return this.formatItem;
    }

}
