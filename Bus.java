public class Bus{

  private Person[] passengers;

  public Bus(){
    this.passengers = new Person[10];
  }

  public int passengerCount(){
    int count = 0;
    for (Person person : passengers) {
      if (person != null) {
        count += 1;
      }
    }
    return count;
  }

  public void pickUp(Person person ){
    if(isBusFull()) return;

    int nextIndex = passengerCount();
    passengers[nextIndex] = person;
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

  public void dropOff(){
    int num = passengerCount();
    passengers[num-1] = null;
  }

  public void endOfTheRoad(){
    int i = passengerCount();
    for(int num = 0; num < i; num++){
      passengers[num] = null;
    }
  }
}