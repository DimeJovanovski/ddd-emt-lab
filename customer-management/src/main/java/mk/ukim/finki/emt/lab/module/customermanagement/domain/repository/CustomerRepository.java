package mk.ukim.finki.emt.lab.module.customermanagement.domain.repository;

import mk.ukim.finki.emt.lab.module.customermanagement.domain.models.Customer;
import mk.ukim.finki.emt.lab.module.customermanagement.domain.models.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
