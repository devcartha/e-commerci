package tn.devcartha.ecommerci.data.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Devcartha on 11/26/2015.
 */
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date orderingDate;
    private String orderState;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;
    @OneToOne(mappedBy = "order")
    private Bill bill;

    public Order() {
    }

    public Order(Date orderingDate, String orderState, Customer customer, List<OrderLine> orderLines, Bill bill) {
        this.orderingDate = orderingDate;
        this.orderState = orderState;
        this.customer = customer;
        this.orderLines = orderLines;
        this.bill = bill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderingDate() {
        return orderingDate;
    }

    public void setOrderingDate(Date orderingDate) {
        this.orderingDate = orderingDate;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (orderingDate != null ? !orderingDate.equals(order.orderingDate) : order.orderingDate != null) return false;
        if (orderState != null ? !orderState.equals(order.orderState) : order.orderState != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (orderLines != null ? !orderLines.equals(order.orderLines) : order.orderLines != null) return false;
        return !(bill != null ? !bill.equals(order.bill) : order.bill != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderingDate != null ? orderingDate.hashCode() : 0);
        result = 31 * result + (orderState != null ? orderState.hashCode() : 0);
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (orderLines != null ? orderLines.hashCode() : 0);
        result = 31 * result + (bill != null ? bill.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderingDate=" + orderingDate +
                ", orderState='" + orderState + '\'' +
                ", customer=" + customer +
                ", orderLines=" + orderLines +
                ", bill=" + bill +
                '}';
    }
}
