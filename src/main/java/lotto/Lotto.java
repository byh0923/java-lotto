package lotto;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    private List<LottoNumbers> lotto;

    public Lotto() {
        this.lotto = new ArrayList<>();
    }

    protected List<LottoNumbers> makeLottoNumbers(int count) {
        for (int i = 0; i < count; i++) {
            lotto.add(new LottoNumbers());
        }
        return lotto;
    }
}
