public class BusStop{

  private Person[] wait;
  private Bus arrival;

  public BusStop(){
    this.wait = new Person[6];
    this.arrival = new Bus();
  }

  public void addWait(Person waiter){

    int nextIndex = waitCount();
    wait[nextIndex] = waiter;
  }

  public int waitCount(){
    int count = 0;
    for (Person person : wait) {
      if (person != null) {
        count += 1;
      }
    }
    return count;
  }

  public void allAboard(){

      int i = waitCount();
      for(int num = 0; num < i; num++){
        wait[num] = null;
      }
    
  } 

}
