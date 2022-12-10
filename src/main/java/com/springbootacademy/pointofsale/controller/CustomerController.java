package com.springbootacademy.pointofsale.controller;

import com.springbootacademy.pointofsale.dto.CustomerDTO;
import com.springbootacademy.pointofsale.dto.request.RequestUpdateCustomerDto;
import com.springbootacademy.pointofsale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);

        return "saved";
    }

    @PutMapping(path = "/update")
    public String updateCustomer(@RequestBody RequestUpdateCustomerDto customerDto){
        String updated = customerService.updateCustomer(customerDto);
        return updated;
    }


    @GetMapping(
            path="/get-by-id",
            params="id"
    )
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerId){
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;
    }

    @GetMapping("/get-all")
    public List<CustomerDTO> getCustomers(){
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }


    @DeleteMapping(path = "/delete-customer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int customerId){
        String delete = customerService.deleteCustomer(customerId);
        return null;
    }
}
