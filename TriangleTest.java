import static org.junit.Assert.*;
import org.junit.Test;
public class TriangleTest {
 @Test
 public void test1ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,100,1);

 assertEquals("The triangle is isosceles.",TriangleClassifier.TriangleType.convertTriangleType(result));

 
 }
 
 @Test
 public void test2ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,100,2);
 assertEquals("The triangle is isosceles.", TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 
 @Test
 public void test6ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,1,100);

 assertEquals("The triangle is isosceles.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }

 @Test
 public void test7ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,2,100);

 assertEquals("The triangle is isosceles.",TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 @Test
 public void test8ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,100,100);

 assertEquals("The triangle is equiliteral.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }

 @Test
 public void test9ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,199,100);

 assertEquals("The triangle is isosceles.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 @Test
 public void test10ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,200,100);

 assertEquals("This is not a triangle.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }

 @Test
 public void test11ProduceTriangle() {


 TriangleClassifier.TriangleType result=TriangleClassifier.classify(1,100,100);

 assertEquals("The triangle is isosceles.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 @Test
 public void test12ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(2,100,100);

 assertEquals("The triangle is isosceles.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 @Test
 public void test13ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(100,100,100);

 assertEquals("The triangle is equiliteral.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }
 @Test
 public void test14ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(199,100,100);

 assertEquals("The triangle is isosceles.",
TriangleClassifier.TriangleType.convertTriangleType(result));
 }

 @Test
 public void test15ProduceTriangle() {

 TriangleClassifier.TriangleType result=TriangleClassifier.classify(200,100,100);

 assertEquals("This is not a triangle.",
TriangleClassifier.TriangleType.convertTriangleType(result));

}
}
