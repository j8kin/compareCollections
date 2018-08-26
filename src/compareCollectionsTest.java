import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

import static org.junit.Assert.*;

public class compareCollectionsTest {

    /**
     * Verify that 2 different type of collection
     */
    @org.junit.Test
    public void compare1() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertTrue(sol.compare(col1,col2));
    }

    /**
     * Verify that if length is different collections are not equal
     */
    @org.junit.Test
    public void compare2() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));
        col1.add(new ObjectA(3, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * id field for one of the record is differ
     */
    @org.junit.Test
    public void compare3() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(3, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * name field for one of the record is differ
     */
    @org.junit.Test
    public void compare4() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name3", "value1"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * value field for one of the record is differ
     */
    @org.junit.Test
    public void compare5() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value3"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * Verify that collection is equal to itself
     */
    @org.junit.Test
    public void compare6() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        assertTrue(sol.compare(col1,col1));
    }

    /**
     * Verify that collection is equal to itself
     */
    @org.junit.Test
    public void compare7() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = col1;

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(4, "name2", "value2"));

        assertTrue(sol.compare(col1,col2));
    }

    /**
     * Verify that collection 1 contain 2 Objects with the same data.
     * Collection 2 only one Object.
     * Verify that collections are different.
     */
    @org.junit.Test
    public void compare8() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * Verify that collection 2 contain 2 Objects with the same data.
     * Collection 1 only one Object.
     * Verify that collections are different.
     */
    @org.junit.Test
    public void compare9() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertFalse(sol.compare(col1,col2));
    }

    /**
     * Verify that collection 1 contain 2 Objects with the same data.
     * Collection 2 contains 2 Objects with the same data but different then in Collection 1.
     * Verify that collections are different.
     */
    @org.junit.Test
    public void compare10() {
        Solution sol = new Solution();

        Collection<ObjectA> col1 = new Vector<>();
        Collection<ObjectA> col2 = new LinkedList<>();

        col1.add(new ObjectA(0, "name0", "value0"));
        col1.add(new ObjectA(1, "name1", "value1"));
        col1.add(new ObjectA(2, "name2", "value2"));
        col1.add(new ObjectA(2, "name2", "value2"));

        col2.add(new ObjectA(2, "name2", "value2"));
        col2.add(new ObjectA(0, "name0", "value0"));
        col2.add(new ObjectA(1, "name1", "value1"));
        col2.add(new ObjectA(1, "name1", "value1"));

        assertFalse(sol.compare(col1,col2));
    }
}
