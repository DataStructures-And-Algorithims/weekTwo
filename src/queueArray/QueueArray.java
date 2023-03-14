package queueArray;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Objects;
import java.util.Scanner;

public class QueueArray {

    private static Scanner scan;
    private static Scanner deq;
    private static String[] s;
    private static String input = " ";

    private static int n;
    private static int empty;

    private static int first;

    public QueueArray() {
        s = new String[1];
        first = 0;
        n = 0;
        empty = n;
    }

    public static void main(String[] args) {
        int dequeue = 1;
        QueueArray qa = new QueueArray();
        scan = new Scanner(System.in);
        deq = new Scanner(System.in);
        while (!Objects.equals(input, "end")) {
            System.out.println("Enter value to enqueue :");
            input = scan.nextLine();
            qa.enqueue(input);
            if (Objects.equals(input, "none")) {
                System.out.println("No entry hence no change ");
            }
            if (!Objects.equals(input, "end")) {
                qa.printArrays();
                System.out.print("If you wish to dequeue enter 0: ");
                dequeue = deq.nextInt();
                if (dequeue == 0) {
                    qa.dequeue();
                    qa.printArrays();
                }
            }
        }
    }

    public static void dequeuePrompt(int choice, QueueArray q) {
        if (choice == 0) {
            q.dequeue();
            q.printArrays();
        }
    }

    public boolean isEmpty() {
        return empty == 0;
    }

    public void enqueue(String item) {
        if (!Objects.equals(item, "none") && !Objects.equals(item, "end")) {
            if (n == s.length) {
                // Resize by doubling
                resize(s.length * 2);
                s[n++] = item;
                ++empty;
            }
            else {
                s[n++] = item;
                ++empty;
            }
        }
    }

    public void dequeue() {
        if (n > 0 && n == s.length / 4) {
            // Resize array
            resize(s.length / 4);
            s[first] = "_";
            ++first;
            --empty;
        }
        else {
            s[first] = "_";
            ++first;
            --empty;
        }
    }

    public void printArrays() {
        System.out.print("[ ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.print(" ]");
        System.out.println("Empty flag: " + empty + " Queue size: " + s.length);
        System.out.println(".........................................");
    }

    public static void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < n; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }
}
