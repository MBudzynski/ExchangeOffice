package pl.sda.exchangeoffice;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.exchangeoffice.domain.curencyrate.CurrencyRateResponse;
import pl.sda.exchangeoffice.external.exchangerate.ExchangeRateClient;

import java.time.LocalDate;

@SpringBootTest
class MoviedbApplicationTests {

    @Autowired
    private ExchangeRateClient exchangeRateClient;

    @Test
    void shouldFetchExchangeRate() throws JsonProcessingException {
        //given
        String currency = "eur";
        LocalDate forDate = LocalDate.now();
        //when
        CurrencyRateResponse rate = exchangeRateClient.findCurrencyRate(currency, forDate);
        //then
        Assertions.assertNotNull(rate);
    }

    @Test
    void contextLoads() {
    }

}
