package com.github.bishnusubedi.dateconverter.converter;

import com.github.bishnusubedi.dateconverter.utils.CalendarBS;
import com.github.bishnusubedi.dateconverter.utils.DateBS;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @Author bishnusubedi
 * Created on 18/06/25
 */
@RunWith(JUnitParamsRunner.class)
public class DateConverterTest {

  private static Object[] getParams() {
    List<Object[]> testCases = new ArrayList<>();

    Calendar calendar = Calendar.getInstance();

    calendar.set(1998, Calendar.APRIL, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2055, CalendarBS.BAISAKH, 1) });

    calendar.set(2007, Calendar.APRIL, 10);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2063, CalendarBS.CHAITRA, 27) });

    calendar.set(2003, Calendar.JUNE, 13);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2060, CalendarBS.JESTHA, 30) });

    calendar.set(2000, Calendar.NOVEMBER, 29);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2057, CalendarBS.MANGSHIR, 14) });

    calendar.set(2005, Calendar.MAY, 30);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2062, CalendarBS.JESTHA, 17) });


    calendar.set(2016, Calendar.APRIL, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2073, CalendarBS.BAISAKH, 4) });

    calendar.set(2000, Calendar.FEBRUARY, 9);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2056, CalendarBS.MAGH, 26) });

    calendar.set(1998, Calendar.APRIL, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2055, CalendarBS.BAISAKH, 3) });

    calendar.set(1998, Calendar.APRIL, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2055, CalendarBS.BAISAKH, 2) });

    calendar.set(1968, Calendar.JULY, 26);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2025, CalendarBS.SHRAWAN, 11) });

    calendar.set(1953, Calendar.APRIL, 23);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2010, CalendarBS.BAISAKH, 11) });

    calendar.set(2001, Calendar.DECEMBER, 18);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2058, CalendarBS.POUSH, 3) });

    calendar.set(2023, Calendar.NOVEMBER, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2080, CalendarBS.KARTIK, 29) });

    calendar.set(2025, Calendar.APRIL, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.BAISAKH, 1) });

    calendar.set(2025, Calendar.MAY, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.BAISAKH, 31) });

    calendar.set(2025, Calendar.MAY, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.JESTHA, 1) });

    calendar.set(2025, Calendar.JUNE, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.JESTHA, 31) });

    calendar.set(2025, Calendar.JUNE, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.ASAR, 1) });

    calendar.set(2025, Calendar.JULY, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.ASAR, 32) });

    calendar.set(2025, Calendar.JULY, 17);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.SHRAWAN, 1) });

    calendar.set(2025, Calendar.AUGUST, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.SHRAWAN, 31) });

    calendar.set(2025, Calendar.AUGUST, 17);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.BHADRA, 1) });

    calendar.set(2025, Calendar.SEPTEMBER, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.BHADRA, 31) });

    calendar.set(2025, Calendar.SEPTEMBER, 17);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.ASOJ, 1) });

    calendar.set(2025, Calendar.OCTOBER, 17);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.ASOJ, 31) });

    calendar.set(2025, Calendar.OCTOBER, 18);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.KARTIK, 1) });

    calendar.set(2025, Calendar.NOVEMBER, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.KARTIK, 30) });

    calendar.set(2025, Calendar.NOVEMBER, 17);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.MANGSHIR, 1) });

    calendar.set(2025, Calendar.DECEMBER, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.MANGSHIR, 29) });

    calendar.set(2025, Calendar.DECEMBER, 16);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.POUSH, 1) });

    calendar.set(2026, Calendar.JANUARY, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.POUSH, 30) });

    calendar.set(2026, Calendar.JANUARY, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.MAGH, 1) });

    calendar.set(2026, Calendar.FEBRUARY, 12);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.MAGH, 29) });

    calendar.set(2026, Calendar.FEBRUARY, 13);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.FALGUN, 1) });

    calendar.set(2026, Calendar.MARCH, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.FALGUN, 30) });

    calendar.set(2026, Calendar.MARCH, 15);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.CHAITRA, 1) });

    calendar.set(2026, Calendar.APRIL, 13);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2082, CalendarBS.CHAITRA, 30) });

    calendar.set(2041, Calendar.SEPTEMBER, 14);
    testCases.add(new Object[] { calendar.getTime(), new DateBS(2098, CalendarBS.BHADRA, 29) });

    return testCases.toArray();
  }

  @Test
  @Parameters(method = "getParams")
  public void convertADToBSTest(Date dateAD, DateBS dateBS) {
    DateBS dateBS1 = DateConverter.convertADToBS(dateAD);
    assertEquals(dateBS, dateBS1);
  }

  @Test
  @Parameters(method = "getParams")
  public void convertBSToADTest(Date expectedDate, DateBS inputDateBS) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(expectedDate);
    calendar.set(Calendar.HOUR_OF_DAY, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);

    Date actualDate = DateConverter.convertBSToAD(inputDateBS);
    assertEquals(calendar.getTime(), actualDate);
  }

  @Test
  public void daysBetweenTest() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(2016, Calendar.APRIL, 10);
    LocalDate date1 = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    calendar.set(2016, Calendar.APRIL, 16);
    LocalDate date2 = calendar.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    int days = date1.until(date2).getDays();

    assertEquals(6, days);
  }

}