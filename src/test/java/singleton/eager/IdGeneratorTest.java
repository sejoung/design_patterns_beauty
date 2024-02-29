package singleton.eager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdGeneratorTest {

    @Test
    void getId() {
        var idGenerator = IdGenerator.getInstance();
        var id = idGenerator.getId();
        assertEquals(1, id);
    }

}