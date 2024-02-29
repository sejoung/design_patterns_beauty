package singleton.doublechecked;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    private final AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        synchronized (IdGenerator.class) {
            if (instance == null) {
                instance = new IdGenerator();
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}