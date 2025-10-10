package ase.money;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyTest {
  private Money oneFortyNine, oneFifty;

  @BeforeEach
  void setUp() {
    oneFortyNine = new Money(1, 49);
    oneFifty = new Money(1, 50);
  }

  @Test
  void creation() {
    assertThat(oneFifty.getEuros(), is(1));
    assertThat(oneFifty.getCents(), is(50));
  }

  @Test
  void centsTooLow() {
    assertThrows(IllegalArgumentException.class, () -> new Money(1, -1));
  }

  @Test
  void stringConversion() {
    Money oneFive = new Money(1, 5);
    assertAll(
      () -> assertThat(oneFifty.toString(), is("\u20ac1.50")),
      () -> assertThat(oneFive.toString(), is("\u20ac1.05"))
    );
  }
}
