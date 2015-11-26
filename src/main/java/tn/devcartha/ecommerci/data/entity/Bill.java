package tn.devcartha.ecommerci.data.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Devcartha on 11/26/2015.
 */
@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date billingDate;
    private String billState;
    @OneToOne
    private Order order;

    public Bill() {
    }

    public Bill(Date billingDate, String billState, Order order) {
        this.billingDate = billingDate;
        this.billState = billState;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bill bill = (Bill) o;

        if (id != null ? !id.equals(bill.id) : bill.id != null) return false;
        if (billingDate != null ? !billingDate.equals(bill.billingDate) : bill.billingDate != null) return false;
        if (billState != null ? !billState.equals(bill.billState) : bill.billState != null) return false;
        return !(order != null ? !order.equals(bill.order) : bill.order != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (billingDate != null ? billingDate.hashCode() : 0);
        result = 31 * result + (billState != null ? billState.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", billingDate=" + billingDate +
                ", billState='" + billState + '\'' +
                ", order=" + order +
                '}';
    }
}
