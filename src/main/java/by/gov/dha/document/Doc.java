
package by.gov.dha.document;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Doc complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Doc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docSql" type="{http://document.dha.gov.by}DocSql"/>
 *         &lt;element name="docAttr" type="{http://document.dha.gov.by}DocAttr"/>
 *         &lt;element name="docDocs" type="{http://document.dha.gov.by}DocDocs"/>
 *         &lt;element name="docOrgs" type="{http://document.dha.gov.by}DocOrgs"/>
 *         &lt;element name="docSign" type="{http://document.dha.gov.by}DocSign"/>
 *         &lt;element name="docWaste" type="{http://document.dha.gov.by}SimpleTable"/>
 *         &lt;element name="docAssets" type="{http://document.dha.gov.by}SimpleTable"/>
 *         &lt;element name="docServices" type="{http://document.dha.gov.by}SimpleTable"/>
 *         &lt;element name="docBankDetails" type="{http://document.dha.gov.by}DocBankDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idDoc" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="idDocType" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="docName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Doc", namespace = "http://document.dha.gov.by", propOrder = {
        "docAttr",
        "docDocs",
        "docOrgs",
        "docSign",
        "docWaste",
        "docAssets",
        "docServices",
        "docBankDetails",
        "docSql"

})
@XmlRootElement(name = "doc", namespace = "http://document.dha.gov.by")
public class Doc {

    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocAttr docAttr;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocDocs docDocs;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocOrgs docOrgs;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocSign docSign;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected SimpleTable docWaste;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected SimpleTable docAssets;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected SimpleTable docServices;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocBankDetails docBankDetails;
    @XmlElement(namespace = "http://document.dha.gov.by", required = true)
    protected DocSql docSql;
    @XmlAttribute(name = "idDoc")
    protected Integer idDoc;
    @XmlAttribute(name = "idDocType")
    protected Integer idDocType;
    @XmlAttribute(name = "docName")
    protected String docName;


    /**
     * Gets the value of the docSql property.
     *
     * @return
     *     possible object is
     *     {@link DocSql }
     *
     */
    public DocSql getDocSql() {
        return docSql;
    }

    /**
     * Sets the value of the docSql property.
     *
     * @param value
     *     allowed object is
     *     {@link DocSql }
     *
     */
    public void setDocSql(DocSql value) {
        this.docSql = value;
    }


    /**
     * Gets the value of the docAttr property.
     *
     * @return possible object is
     * {@link DocAttr }
     */
    public DocAttr getDocAttr() {
        return docAttr;
    }

    /**
     * Sets the value of the docAttr property.
     *
     * @param value allowed object is
     *              {@link DocAttr }
     */
    public void setDocAttr(DocAttr value) {
        this.docAttr = value;
    }

    /**
     * Gets the value of the docDocs property.
     *
     * @return possible object is
     * {@link DocDocs }
     */
    public DocDocs getDocDocs() {
        return docDocs;
    }

    /**
     * Sets the value of the docDocs property.
     *
     * @param value allowed object is
     *              {@link DocDocs }
     */
    public void setDocDocs(DocDocs value) {
        this.docDocs = value;
    }

    /**
     * Gets the value of the docOrgs property.
     *
     * @return possible object is
     * {@link DocOrgs }
     */
    public DocOrgs getDocOrgs() {
        return docOrgs;
    }

    /**
     * Sets the value of the docOrgs property.
     *
     * @param value allowed object is
     *              {@link DocOrgs }
     */
    public void setDocOrgs(DocOrgs value) {
        this.docOrgs = value;
    }

    /**
     * Gets the value of the docSign property.
     *
     * @return possible object is
     * {@link DocSign }
     */
    public DocSign getDocSign() {
        return docSign;
    }

    /**
     * Sets the value of the docSign property.
     *
     * @param value allowed object is
     *              {@link DocSign }
     */
    public void setDocSign(DocSign value) {
        this.docSign = value;
    }

    /**
     * Gets the value of the docWaste property.
     *
     * @return possible object is
     * {@link SimpleTable }
     */
    public SimpleTable getDocWaste() {
        return docWaste;
    }

    /**
     * Sets the value of the docWaste property.
     *
     * @param value allowed object is
     *              {@link SimpleTable }
     */
    public void setDocWaste(SimpleTable value) {
        this.docWaste = value;
    }

    /**
     * Gets the value of the docAssets property.
     *
     * @return possible object is
     * {@link SimpleTable }
     */
    public SimpleTable getDocAssets() {
        return docAssets;
    }

    /**
     * Sets the value of the docAssets property.
     *
     * @param value allowed object is
     *              {@link SimpleTable }
     */
    public void setDocAssets(SimpleTable value) {
        this.docAssets = value;
    }

    /**
     * Gets the value of the docServices property.
     *
     * @return possible object is
     * {@link SimpleTable }
     */
    public SimpleTable getDocServices() {
        return docServices;
    }

    /**
     * Sets the value of the docServices property.
     *
     * @param value allowed object is
     *              {@link SimpleTable }
     */
    public void setDocServices(SimpleTable value) {
        this.docServices = value;
    }

    /**
     * Gets the value of the docBankDetails property.
     *
     * @return possible object is
     * {@link DocBankDetails }
     */
    public DocBankDetails getDocBankDetails() {
        return docBankDetails;
    }

    /**
     * Sets the value of the docBankDetails property.
     *
     * @param value allowed object is
     *              {@link DocBankDetails }
     */
    public void setDocBankDetails(DocBankDetails value) {
        this.docBankDetails = value;
    }

    /**
     * Gets the value of the idDoc property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIdDoc() {
        return idDoc;
    }

    /**
     * Sets the value of the idDoc property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIdDoc(Integer value) {
        this.idDoc = value;
    }

    /**
     * Gets the value of the idDocType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getIdDocType() {
        return idDocType;
    }

    /**
     * Sets the value of the idDocType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setIdDocType(Integer value) {
        this.idDocType = value;
    }

    /**
     * Gets the value of the docName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocName(String value) {
        this.docName = value;
    }

}
