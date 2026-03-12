//Practical Assignment – Collection – filtering
//Write a filter method that takes an array of any type as its input. As a second argument, the method should accept a class that implements the Filter interface, which contains a single method:
//
//T apply(T o)
//
//(parameterized).
//
//The method must be implemented so that it returns a new array in which the apply function has been applied to each element.



//Filter interface
interface Filter {
    int apply(int o);
}

public class UseFilterMethod {

    // Filter method
    public static int[] filter(int[] arr, Filter f) {

        int[] result = new int[arr.length];   // new array

        for (int i = 0; i < arr.length; i++) {
            result[i] = f.apply(arr[i]);      // apply rule
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4};

        // Filter rule
        Filter doubleValue = new Filter() {
            public int apply(int k) {
                return k * 2;
            }
        };

        int[] output = filter(numbers, doubleValue);

        // Print result
        for (int n : output) {
            System.out.print(n + " ");
        }
    }
}