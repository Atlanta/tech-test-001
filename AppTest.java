package tech;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test(expected = BadBadValueException.class)
    public void shouldRaiseException() {
        TimeDuration td = new TimeDuration(-20;
    }
}
