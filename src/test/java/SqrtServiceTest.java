import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaQA.SqrtService;

public
class SqrtServiceTest {
    @Test
    public
    void shouldCalcExakt() {
        SqrtService service = new SqrtService();
        int expected = 6;
        int actual = service.calcSqrt(10, 99);
        Assertions.assertEquals(expected, actual);
    }
}
