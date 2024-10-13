class ReverseStringUsingStack {

    // Method to reverse the string using a stack
    public static String reverse(String str) {
        int n = str.length();
        char[] stack = new char[n]; // Stack as a character array
        int top = -1; // Initialize top as -1 (stack is empty)

        // Push all characters of the string onto the stack
        for (int i = 0; i < n; i++) {
            stack[++top] = str.charAt(i); // Increment top and push each character
        }

        // Pop all characters from the stack and form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (top >= 0) { // Ensure we don't pop from an empty stack
            reversed.append(stack[top--]); // Append popped characters to the result
        }

        return reversed.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str)); // Output: "dlroWolleH"
    }
}
