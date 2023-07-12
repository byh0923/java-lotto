package lotto.dto;

public class MoneyRequestDto {

    private final long money;

    public MoneyRequestDto(long money) {
        this.money = money;
    }

    public long getMoney() {
        return money;
    }
}
