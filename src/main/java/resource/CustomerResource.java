package resource;


import entity.Customer;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
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

    @GET
    @Path("/test")
    public String getTest(){
        return "test well done";
    }
}
