import org.junit.Test;

import static org.junit.Assert.*;

public class TestOwnList {

    @Test
    public void testOwnList() {
        OwnList<String> strings = new OwnList<>();
        strings.add("1");
        strings.add("2");

        assertEquals(2, strings.size());

        strings.remove(1);

        assertEquals(1, strings.size());

        assertNull(strings.get(1));
    }
}
