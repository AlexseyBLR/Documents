package by.gov.dha.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOC_BANK_DETAILS")
public class DBD {

    @Id
    @Column(name = "ID_ROW")
    private String id_row;

    @Column(name = "ID_DOC")
    private String id_doc;

    @Column(name = "TYPE_PARTICIPANT")
    private String type_participant;

    @Column(name = "PARTICIPANT")
    private String participant;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "UNP")
    private String unp;

    @Column(name = "IBAN")
    private String IBAN;

    @Column(name = "BIC")
    private String bic;

    @Column(name = "BANK_NAME")
    private String bank_name;

    @Column(name = "IS_ACTUAL")
    private String is_actual;

    @Column(name = "ORDER_NUM")
    private String order_num;

    public String getId_row() {
        return id_row;
    }

    public void setId_row(String id_row) {
        this.id_row = id_row;
    }

    public String getId_doc() {
        return id_doc;
    }

    public void setId_doc(String id_doc) {
        this.id_doc = id_doc;
    }

    public String getType_participant() {
        return type_participant;
    }

    public void setType_participant(String type_participant) {
        this.type_participant = type_participant;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnp() {
        return unp;
    }

    public void setUnp(String unp) {
        this.unp = unp;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getIs_actual() {
        return is_actual;
    }

    public void setIs_actual(String is_actual) {
        this.is_actual = is_actual;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }
}
