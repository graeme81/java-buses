import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{

  Bus bus;
  Person traveller;

  @Before
  public void before(){
    bus = new Bus();
    traveller = new Person();
  }

  @Test // create empty bus
  public void startsAsEmptyBus(){
    assertEquals(0, bus.passengerCount());
  }

  @Test  // passenger boards bus
  public void passengerBoards(){
    bus.pickUp(traveller);

    assertEquals(1, bus.passengerCount());
  }

  @Test // passenger leaves the bus
  public void passengerLeaves(){
    bus.pickUp(traveller);
    bus.pickUp(traveller);

    bus.dropOff();

    assertEquals(1, bus.passengerCount());
  }

  @Test // empty the bus
  public void everybodyOff(){

    for(int i=0; i<8; i++){
      bus.pickUp(traveller);
    }

    bus.endOfTheRoad();

    assertEquals(0, bus.passengerCount());
  
  }

  @Test // can only pick up 10 passengers
  public void tooManyPassenegers(){
    for(int i = 0; i < 20; i++){
      bus.pickUp(traveller);
    }

    assertEquals(10, bus.passengerCount());
  }


}