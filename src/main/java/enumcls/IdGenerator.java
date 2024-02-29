package enumcls;

import java.util.concurrent.atomic.AtomicLong;

public enum IdGenerator {
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public Long getId() {
        return id.incrementAndGet();
    }
}