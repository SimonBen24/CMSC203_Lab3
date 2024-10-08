import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
   private GradeBook g1;
   private GradeBook g2;

   /**
    * This method is called before each test case. It sets up the test environment.
    */
   @Before
   public void setUp() throws Exception {
      // Task #3: Initialize GradeBook objects and add scores
      g1 = new GradeBook(5);
      g1.addScore(85.0);
      g1.addScore(92.0);

      g2 = new GradeBook(5);
      g2.addScore(75.0);
      g2.addScore(88.0);
   }

   /**
    * This method is called after each test case. It cleans up the test environment.
    */
   @After
   public void tearDown() throws Exception {
      // Task #3: Set objects to null
      g1 = null;
      g2 = null;
   }

   /**
    * Test addScore method of GradeBook.
    */
   @Test
   public void testAddScore() {
      // Test the contents of the scores array using toString
      assertTrue(g1.toString().equals("85.0 92.0 "));
      assertTrue(g2.toString().equals("75.0 88.0 "));

      // Test the score size
      assertEquals(2, g1.getScoreSize());
      assertEquals(2, g2.getScoreSize());
   }

   /**
    * Test sum method of GradeBook.
    */
   @Test
   public void testSum() {
      // Test sum of scores
      assertEquals(177.0, g1.sum(), .0001);
      assertEquals(163.0, g2.sum(), .0001);
   }

   /**
    * Test minimum method of GradeBook.
    */
   @Test
   public void testMinimum() {
      // Test minimum score
      assertEquals(85.0, g1.minimum(), .0001);
      assertEquals(75.0, g2.minimum(), .0001);
   }

   /**
    * Test finalScore method of GradeBook.
    */
   @Test
   public void testFinalScore() {
      // Test final score (sum - minimum)
      assertEquals(92.0, g1.finalScore(), .0001);
      assertEquals(88.0, g2.finalScore(), .0001);
   }
}
