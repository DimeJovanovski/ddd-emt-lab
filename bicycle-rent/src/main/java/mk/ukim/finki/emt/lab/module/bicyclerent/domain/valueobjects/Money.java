package mk.ukim.finki.emt.lab.module.bicyclerent.domain.valueobjects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NonNull;
import mk.ukim.finki.emt.lab.module.sharedkernel.domain.base.ValueObject;

@Embeddable
@Getter
public class Money implements ValueObject {
    private final double amount;

    protected Money() {
        this.amount = 0.0;
    }

    public Money(@NonNull double amount) {
        this.amount = amount;
    }

    public static Money valueOf(int amount) {
        return new Money(amount);
    }

    public Money add(Money money) {
        return new Money(amount + money.amount);
    }

    public Money subtract(Money money) {
        return new Money(amount - money.amount);
    }

    public Money multiply(int m)  {
        return new Money(amount*m);
    }


}
