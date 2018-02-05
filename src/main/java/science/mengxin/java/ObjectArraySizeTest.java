package science.mengxin.java;

/**
 * User:    mengxin
 * Date:    05/02/2018
 * Project: java-feature-test
 * Package: science.mengxin.java
 * Description: ObjectArraySizeTest.
 *
 * @author mengxin
 * @version 1.0
 */
public class ObjectArraySizeTest {
    public static void main(String args[]) {
        Integer arrayLength = Integer.MAX_VALUE;
        Object[] objectProperties = null;
        // objectProperties = new Object[2396729];
        // System.out.print(objectProperties.length);
        for (int i=arrayLength; i>1;i=i-1000000) {
            try {
                objectProperties = new Object[i];
            } catch (OutOfMemoryError e) {
                System.out.print("Out of memory: " + String.valueOf(i) + "\n");
                // System.out.print(e.toString());
            }
            if (objectProperties != null) {
                System.out.print("Find the limit by 1000: " + String.valueOf(i) + "\n");
                System.out.print(objectProperties.length + "\n");
                break;
            }
        }
    }
}
