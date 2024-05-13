/**
 * 
 */
package durga.sir.lecture;

import java.util.stream.IntStream;

/**
 * @author deby7
 *6:32:32 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class HoloSquarePattern {public static void main(String[] args) {
    int size = 6; // Adjust size as needed
    
    // Top line of the square
    IntStream.range(0, size).forEach(i -> System.out.print("*"));
    System.out.println(); // Move to the next line
    
    // Middle lines of the square
    IntStream.range(0, size - 2).forEach(i -> {	
        System.out.print("*"); // Left boundary
        IntStream.range(0, size - 2).forEach(j -> System.out.print(" ")); // Empty space in the middle
        System.out.println("*"); // Right boundary
    });
    
    // Bottom line of the square
    IntStream.range(0, size).forEach(i -> System.out.print("*"));
}}
