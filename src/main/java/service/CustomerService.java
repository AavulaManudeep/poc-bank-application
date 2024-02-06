package service;

import entity.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.TransactionManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import repository.CustomerRepository;


@ApplicationScoped
public class CustomerService {

    //@Inject
    //TransactionManager tm;

    @Inject
    CustomerRepository customerRepository;
//
//    CustomerService (final CustomerRepository customerRepository){
//        this.customerRepository= customerRepository;
//    }


    @Transactional
    public Response addCustomer(Customer customer)
    {
//        var customer_fromDB = customerRepository.findById(customer.getId());
//        if(customer_fromDB != null) {
//            customer_fromDB.setFistName(customer.getFistName());
//        }
        try{
            //tm.begin();
            customerRepository.persist(customer);
            //tm.commit();
        }
        catch (Exception exception){
            throw new WebApplicationException("Error occur ar insertion",Response.Status.INTERNAL_SERVER_ERROR);
        }
        return Response.ok(customer).status(Response.Status.CREATED).build();
    }

//    public Response addCustomer(Customer customer)
//    {
//        return Response.ok(customer).status(Response.Status.CREATED).build();
//    }
}
