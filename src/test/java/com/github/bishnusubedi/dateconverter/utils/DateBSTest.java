package com.github.bishnusubedi.dateconverter.utils;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * @Author bishnusubedi
 * Created on 18/06/25
 */
@RunWith(JUnitParamsRunner.class)
public class DateBSTest {

  public static final Object[] getParameters() {
    return new Object[] { new Object[] { new DateBS(2073, CalendarBS.BAISAKH, 5), new DateBS(2073, CalendarBS.BAISAKH, 1), 1 },
            new Object[] { new DateBS(2073, CalendarBS.BAISAKH, 5), new DateBS(2073, CalendarBS.JESTHA, 1), -1 },
            new Object[] { new DateBS(2073, CalendarBS.BAISAKH, 5), new DateBS(2073, CalendarBS.BAISAKH, 5), 0 },
            new Object[] { new DateBS(2072, CalendarBS.BAISAKH, 5), new DateBS(2071, CalendarBS.JESTHA, 23), 1 },
            new Object[] { new DateBS(2073, CalendarBS.BAISAKH, 5), new DateBS(2074, CalendarBS.ASAR, 1), -1 } };
  }

  @Test
  @Parameters(method = "getParameters")
  public void compareToTest(DateBS dateBS1, DateBS dateBS2, int result) {
    assertEquals(result, dateBS1.compareTo(dateBS2));
  }

//  @Test
//  public void emptyConstructorShouldReturnTodayDate(){
//    DateBS dateBS = new DateBS();
//    DateBS dateBS1 = new DateBS(2073, CalendarBS.ASAR, 25);
//    assertEquals(dateBS1, dateBS);
//  }
}
