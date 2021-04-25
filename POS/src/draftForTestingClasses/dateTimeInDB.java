package draftForTestingClasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mir Ferdous
 */
public class dateTimeInDB {

    public static Calendar stringToCalendar(String timeS) {
        Calendar cal = null;

        DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");
        Date date;
        try {
            date = df.parse(timeS);
            cal = Calendar.getInstance();
            cal.setTime(date);
        } catch (ParseException ex) {
            Logger.getLogger(dateTimeInDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cal;
    }

    public static String calendartoString(Calendar cal) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");
        String time = sdf.format(cal.getTime());
        return time;
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        Calendar c = stringToCalendar("2016-01-16 12:02:03");
        System.out.println(c);

        String time = calendartoString(c);
        System.out.println(time);

        //*******date array for selecting within range
//        DateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//
//        ArrayList<Calendar> timeList = new ArrayList<>();
//
//        timeList.add(new GregorianCalendar());
//        timeList.add(new GregorianCalendar(1980, 02, 20));
//        timeList.add(new GregorianCalendar(1996, 02, 05));
//        timeList.add(new GregorianCalendar(1993, 02, 25));
//        timeList.add(new GregorianCalendar(1991, 02, 01));
//        timeList.add(new GregorianCalendar(1973, 02, 25));
//        timeList.add(new GregorianCalendar(1980, 02, 15));
//        timeList.add(new GregorianCalendar(1916, 02, 05));
//        timeList.add(new GregorianCalendar(2011, 02, 16));
//        timeList.add(new GregorianCalendar(2012, 07, 17));
//        timeList.add(new GregorianCalendar(2014, 11, 25));
//
//        System.out.println("Enter a Date(yyyy-mm-dd) to search : ");
//        String s = sc.next();
//        Date date = sdf.parse(s);
//        Calendar tempC = Calendar.getInstance();
//        tempC.setTime(date);
//
//        System.out.println(tempC);
//************date to string
        /*      DateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:MM:ss");
        Date date;
        try {
            date = df.parse("1991-06-16 02:20:59");
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);             
            System.out.println( df.format(date));
            
            
            

        } catch (ParseException ex) {
            Logger.getLogger(dateTimeInDB.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
//*********string to date
//        String string = "2011-03-09T03:02:10.823Z";
//        String pattern = "dd-mm-yyyy";
//        date = new SimpleDateFormat(pattern).parse(string);
//        System.out.println(date); // Wed Mar 09 03:02:10 BOT 2011

        /*        
 Date curDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        String DateToStr = format.format(curDate);
        System.out.println("Default pattern: " + DateToStr);

        format = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("MMMM dd HH:mm:ss zzzz yyyy",
                Locale.ITALIAN);
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        DateToStr = format.format(curDate);
        System.out.println(DateToStr);

        try {
            Date strToDate = format.parse(DateToStr);
            System.out.println(strToDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

         */
    }
}
