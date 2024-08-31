/**
 * @author arvindhvelrajan
 * @author Jaime Nguyen
 */
public class IceBreaker
{
    final int numberOfAcceptableDaysForRefund = 14;
    final int studentPopulation = 39740;
    int numberOfDaysSinceClassStarted;
    int sum = 0;

    public IceBreaker()
    {
        numberOfDaysSinceClassStarted = 0;
    }

    public int predictCases(int numberOfDays)
    {
        for(int i = 0; i < numberOfDays; i++)
        {
            sum += (int) (Math.pow(2, i) / 1);
        }
    }
}
