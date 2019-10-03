import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrafficLightTest {

    TrafficLight SUT;

    @Before
    //Zo wordt de traffic light opgezet/gegenereed
    public void setup() {
        SUT = new TrafficLight();
    }

    @Test
    //Laat rood licht zien
    public void showRedColor() {
        String result = SUT.showColor(1);
        assertThat(result, is("Red"));
    }
    @Test
    //Laat rood Oranje zien
    public void showOrangeColor() {
        String result = SUT.showColor(2);
        assertThat(result, is("Orange"));
    }
    @Test
    //Laat rood geel zien
    public void showGreenColor() {
        String result = SUT.showColor(3);
        assertThat(result, is("Green"));
    }

    @Test
    //Laat zien of het getal invallid is
    public void showInvalidNumber() {
        String result = SUT.showColor(0);
        assertThat(result, is("Invalid Light Number"));
    }

    @Test
    //laat zien of het getal grooter is dan 0
    public void moreThanZero() {
        boolean result = SUT.isPositiveNumber(1);
        assertThat(result, is(true));
    }

    @Test
    //laat zien dat het getal 0 is
    public void zero() {
        assertFalse(SUT.isPositiveNumber(0));
    }

    @Test
    //laat zien dat het getal kleiner dan 0 is
    public void LessThanZero() {
        assertFalse(SUT.isPositiveNumber(-1));
    }

}
