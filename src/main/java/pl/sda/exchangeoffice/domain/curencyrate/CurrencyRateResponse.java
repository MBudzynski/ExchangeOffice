package pl.sda.exchangeoffice.domain.curencyrate;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CurrencyRateResponse {
    private String table;
    private String currency;
    private String code;
    private List<Rate> rates;


    @Getter
    @Setter
    public static class Rate {
        private String no;
        private LocalDate effectiveDate;
        private Double mid;
    }
}
