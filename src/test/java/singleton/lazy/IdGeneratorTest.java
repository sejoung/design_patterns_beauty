package singleton.lazy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void getId() {
        var idGenerator = IdGenerator.getInstance();
        var id = idGenerator.getId();
        assertEquals(1, id);
    }
}