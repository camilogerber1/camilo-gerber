import org.apache.logging.log4j.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DogTest {
  private static Logger log = LogManager.getLogger(DogTest.class);
  Dog doggy = new Dog("Felipe","Cocker",5,10);

  @Test
  public void grow() {
    doggy.grow();
    assertEquals(6,doggy.getAge());
  }
  @Test
  public void testLogger(){
    log.trace("Trace Message!");
    log.debug("Debug Message!");
    log.info("Info Message!");
    log.warn("Warn Message!");
    log.error("Error Message!");
    log.fatal("Fatal Message!");
  }
  @Test
  public void checkName(){ //fail test
    assertEquals("Amanda",doggy.getName());
  }
  @Test
  public void testHappiness(){
  doggy.eatingIncreasesHappiness(); //Increase 20 happiness points
  assertEquals(30,doggy.getHappiness());
  }
}