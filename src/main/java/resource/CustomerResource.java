package resource;


import entity.Customer;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.CustomerService;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {


    @Inject
    CustomerService customerService;


    @POST
    @Path("/create-customer")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCustomer(Customer customer) {
        return customerService.addCustomer(customer);
    }
}
