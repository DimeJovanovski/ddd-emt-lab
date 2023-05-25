package mk.ukim.finki.emt.lab.module.customermanagement.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class PhoneNumber implements ValueObject {
    private final String phoneNumber;

    protected PhoneNumber() {
        this.phoneNumber = null;
    }

    public PhoneNumber(@NonNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
