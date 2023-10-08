

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        if(year<2000||year>3000)
            System.exit(0);
        // Calender c= new GregorianCalendar(year, month-1, day);
        //return c.getDisplayName(c.DAY_OF_WEEK, c.LONG, Locale.US).toUpperCase();
         // We use a Calendar object which we construct with GregorianCalendar constructor where month is 0 based (January = 0)
        Calendar calendar = new GregorianCalendar(year, month - 1, day);

        /* 
            We use calendar.getDisplayName method which receives the field format we want to display, day of week in this case, 
            a style to apply to the String representation, Long in this case and the Locale for our String representation, US.
            Finally we upper case it.
        */
        return calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG,       Locale.US).toUpperCase();

        
    }

}


