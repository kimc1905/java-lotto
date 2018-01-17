package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Moonchan on 2018. 1. 16..
 */
public class AutoLottoNumberGenerator implements LottoNumberGenerator {

    private static final List<Integer> AVAILABLE_LOTTO_NUMBERS;

    static {
        AVAILABLE_LOTTO_NUMBERS = new ArrayList<>();
        for (int i = 1; i <= LottoNumber.MAX_NUMBER; i++) {
            AVAILABLE_LOTTO_NUMBERS.add(i);
        }
    }

    @Override
    public List<Integer> generateNumbers() {
        Collections.shuffle(AVAILABLE_LOTTO_NUMBERS);
        return AVAILABLE_LOTTO_NUMBERS.subList(0, LottoNumber.LOTTO_NUMBERS_SIZE).stream().collect(Collectors.toList());
    }
}
