package tn.devcartha.ecommerci.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.devcartha.ecommerci.data.entity.OrderLine;

/**
 * Created by Devcartha on 11/26/2015.
 */

@Repository
public interface IOrderLineRepository extends CrudRepository<OrderLine, Long>{
}
