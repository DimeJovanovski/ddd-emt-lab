package mk.ukim.finki.emt.lab.module.customermanagement.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.lab.module.customermanagement.domain.valueobjects.PhoneNumber;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name = "customer")
@Getter
public class Customer extends AbstractEntity<CustomerId> {
    private String password;
    private PhoneNumber phoneNumber;
    @Enumerated(value = EnumType.STRING)
    private CustomerAccountState accountState;

    public static Customer build(String password, PhoneNumber phoneNumber) {
        Customer customer = new Customer();
        customer.password = password;
        customer.phoneNumber = phoneNumber;
        customer.accountState = CustomerAccountState.VALID;
        return customer;
    }

}
