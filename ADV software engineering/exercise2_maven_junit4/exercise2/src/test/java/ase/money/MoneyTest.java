package ase.money;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class MoneyTest {
  private Money oneFive, oneFifty;

  
  
  @Test
  public void creation() {
    oneFifty = new Money(1, 50);
    assertThat(oneFifty.getEuros(), is(1));
    assertThat(oneFifty.getCents(), is(50));
  }



  @Test
  public void stringConversion() {
    oneFive = new Money(1, 5);
    oneFifty = new Money(1, 50);
    assertThat(oneFifty.toString(), is("\u20ac1.50"));
    assertThat(oneFive.toString(), is("\u20ac1.05"));

  }
}
