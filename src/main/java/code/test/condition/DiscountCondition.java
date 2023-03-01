package code.test.condition;

import code.test.screen.Screen;

import java.time.LocalDate;
import java.time.LocalTime;

public class DiscountCondition {
    private int sequence;
    private LocalDate localDate;
    private LocalTime startDiscountTime;
    private LocalTime endDiscountTime;
    public boolean checkDiscountCondition(Screen screen) {
        if (screen.getSequence() == sequence
                || ((screen.getRunningDate().isEqual(localDate))
                && (screen.getStartTime().isAfter(startDiscountTime)
                && screen.getEndTime().isBefore(endDiscountTime)))) {
            return true;
        }
        return false;
    }
}
