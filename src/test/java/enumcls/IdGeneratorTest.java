package enumcls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void getId() {
        var id = IdGenerator.INSTANCE.getId();
        assertEquals(1, id);
    }
}