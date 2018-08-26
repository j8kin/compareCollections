import java.util.ArrayList;
import java.util.Collection;

class Solution {
    /** 
     * Compare two collections and return true if collections are equal by value and false otherwise
     * @param col1 first collection of ObjectA
     * @param col2 second collection of ObjectA
     * @return true if collections are the same (by Values) and false otherwise
     *
     */
    boolean compare(Collection<ObjectA> col1, Collection<ObjectA> col2) {
        // if ObjectsA are unique then it would be better to use HashSet instead of ArrayList
        ArrayList<ObjectA> tempSet = new ArrayList<>(col1);

        // If length of collections are not equal then it is not necessary to compare them.
        // Return false in this case.
        if (col1.size() != col2.size())
            return false;

        //go thru collection 2 and compare with element in hashSet
        for (ObjectA element : col2) {
            if (!tempSet.contains(element))
                return false;
            else
                //remove element to make sure that if element exist twice in one collection it exist twice in another
                tempSet.remove(element);
        }

        return true;
    }
}
