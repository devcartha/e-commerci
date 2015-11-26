package tn.devcartha.ecommerci.data.entity;

import javax.persistence.*;

/**
 * Created by Devcartha on 11/26/2015.
 */

@Entity
@Table(name = "orderLines")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer orderedQuantity;
    @ManyToOne
    private Order order;
    @ManyToOne
    @JoinColumn(name ="product")
    private Product product;

    public OrderLine() {
    }

    public OrderLine(Integer orderedQuantity, Order order, Product product) {
        this.orderedQuantity = orderedQuantity;
        this.order = order;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(Integer orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderLine orderLine = (OrderLine) o;

        if (id != null ? !id.equals(orderLine.id) : orderLine.id != null) return false;
        if (orderedQuantity != null ? !orderedQuantity.equals(orderLine.orderedQuantity) : orderLine.orderedQuantity != null)
            return false;
        if (order != null ? !order.equals(orderLine.order) : orderLine.order != null) return false;
        return !(product != null ? !product.equals(orderLine.product) : orderLine.product != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderedQuantity != null ? orderedQuantity.hashCode() : 0);
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (product != null ? product.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", orderedQuantity=" + orderedQuantity +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
