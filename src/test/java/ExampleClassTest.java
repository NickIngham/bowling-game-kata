import lombok.var;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleClassTest {
    @Test
    void GivenAnExampleClass_WhenGetOneIsCalled_ThenOneIsReturned(){
        //Arrange
        var expected = 1;
        var exampleClass = new ExampleClass();
        //Act
        var result = exampleClass.getOne();
        //Assert
        assertEquals(expected, result);
    }
}