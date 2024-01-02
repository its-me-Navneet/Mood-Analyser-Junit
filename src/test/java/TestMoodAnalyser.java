import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.*;
public class TestMoodAnalyser {

private MoodAnalyser Mymood  ;

@Before
public void init(){
    Mymood = new MoodAnalyser() ;
}
@Test
public void happyMood(){

    String mood ="I am in any mood" ;

 assertTrue(Mymood.happyMood(mood));

}

@Test
    public void sadMood(){
    String mood = "I am in sad mood" ;

    assertFalse(Mymood.happyMood(mood));
}




}
