
package by.gov.dha.document;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SimpleTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableHeader" type="{http://document.dha.gov.by}TableHeader"/>
 *         &lt;element name="tableData" type="{http://document.dha.gov.by}TableData"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://document.dha.gov.by}SimpleAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTable", namespace = "http://document.dha.gov.by", propOrder = {
    "tableHeader",
    "tableData"
})
public class SimpleTable {

    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected TableHeader tableHeader;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected TableData tableData;
    @XmlAttribute(name = "num")
    protected Integer num;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "footer")
    protected String footer;
    @XmlAttribute(name = "header")
    protected String header;
    @XmlAttribute(name = "prefix")
    protected String prefix;
    @XmlAttribute(name = "postfix")
    protected String postfix;
    @XmlAttribute(name = "visible")
    protected Integer visible;
    @XmlAttribute(name = "editable")
    protected Integer editable;
    @XmlAttribute(name = "required")
    protected Integer required;
    @XmlAttribute(name = "alignment")
    protected String alignment;

    /**
     * Gets the value of the tableHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TableHeader }
     *     
     */
    public TableHeader getTableHeader() {
        return tableHeader;
    }

    /**
     * Sets the value of the tableHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableHeader }
     *     
     */
    public void setTableHeader(TableHeader value) {
        this.tableHeader = value;
    }

    /**
     * Gets the value of the tableData property.
     * 
     * @return
     *     possible object is
     *     {@link TableData }
     *     
     */
    public TableData getTableData() {
        return tableData;
    }

    /**
     * Sets the value of the tableData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableData }
     *     
     */
    public void setTableData(TableData value) {
        this.tableData = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum(Integer value) {
        this.num = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the postfix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostfix() {
        return postfix;
    }

    /**
     * Sets the value of the postfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostfix(String value) {
        this.postfix = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisible(Integer value) {
        this.visible = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditable(Integer value) {
        this.editable = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequired(Integer value) {
        this.required = value;
    }

    /**
     * Gets the value of the alignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Sets the value of the alignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignment(String value) {
        this.alignment = value;
    }

}
