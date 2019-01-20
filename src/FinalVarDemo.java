class FinalVarDemo
{
    public static void main(String[] args)
    {
        //Once created and initialized, its value can not be changed.
        final int dayInWeek = 7;
        //Below statement will not compile. you can not change value of dayInWeek variable.
        //dayInWeek = 6;

        System.out.println("Number of days in a week = " + dayInWeek);
    }
}
