package mk.ukim.finki.emt.lab.module.bicyclerent.domain.repository;

import mk.ukim.finki.emt.lab.module.bicyclerent.domain.model.Rent;
import mk.ukim.finki.emt.lab.module.bicyclerent.domain.model.RentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, RentId> {
}
