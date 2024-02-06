package repository;

import entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository implements PanacheRepositoryBase<Customer, Long> {

}
