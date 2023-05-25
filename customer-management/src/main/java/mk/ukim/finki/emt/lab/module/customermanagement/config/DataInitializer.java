//package mk.ukim.finki.emt.lab.module.customermanagement.config;
//
//import jakarta.annotation.PostConstruct;
//import lombok.AllArgsConstructor;
//import mk.ukim.finki.emt.lab.module.customermanagement.domain.models.Customer;
//import mk.ukim.finki.emt.lab.module.customermanagement.domain.repository.CustomerRepository;
//import mk.ukim.finki.emt.lab.module.customermanagement.domain.valueobjects.PhoneNumber;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//@AllArgsConstructor
//public class DataInitializer {
//    private final CustomerRepository customerRepository;
//
//    @PostConstruct
//    public void initData() {
//        Customer c1 = Customer.build("abc", new PhoneNumber("077123456"));
//        Customer c2 = Customer.build("efg", new PhoneNumber("078123456"));
//        Customer c3 = Customer.build("hig", new PhoneNumber("079123456"));
//        if (customerRepository.findAll().isEmpty()) {
//            customerRepository.saveAll(Arrays.asList(c1, c2, c3));
//        }
//    }
//
//}
