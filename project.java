
import java.util.Scanner;

class pattern {

    public void p1() {
        int a, b, n = 5;
        for (a = 1; a <= n; a++) {
            for (int c = 1; c <= 5 - a; c++) {
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void p2() {

        int a, b, n = 5;
        for (a = 1; a <= n; a++) {
            for (int c = 1; c <= 5 - a; c++) {
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void p3() {
        int a, b;
        for (a = 1; a <= 6; a++) {
            for (b = 1; b <= 6; b++) {
                if (a == 1 || a == 6) {
                    System.out.print(" * "); 
                }else if (b == 1 || b == 6) {
                    System.out.print(" * "); 
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void p4() {
        int a, b;
        for (a = 1; a <= 6; a++) {
            for (b = 1; b <= 5; b++) {
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
    }

    public void p5() {
        int a, b, n = 5;
        for (a = 1; a <= n; a++) {
            for (int c = 1; c <= 5 + a; c++) {
                System.out.print(" ");
            }
            for (b = 1; b <= 5; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void s1() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        String m = x.next();
        int n = m.length();

        for (int i = 0; i < n; i++) {          
            for (int j = 0; j <= i; j++) {
                System.out.print(m.charAt(j));
            }
            System.out.println();
        }

        x.close();
    }

    public void s2() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        String m = x.next();
        int n = m.length();

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n - a; b++) {
                System.out.print(m.charAt(b));
            }
            System.out.println();
        }

        x.close();
    }

    public void s3() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        String m = x.next();
        int n = m.length();

        for (int a = 0; a < n; a++) {
            for (int c = 0; c < n - a; c++) { 
                System.out.print(" ");
            }
            for (int b = 0; b <= a; b++) {
                System.out.print(m.charAt(b));
            }
            System.out.println();
        }

        x.close();
    }

    public void s4() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        String m = x.next();
        int n = m.length();

        for (int a = 0; a < n; a++) {
            for (int c = 0; c < n - a; c++) {  
                System.out.print(" ");
            }
            for (int b = 0; b <= a; b++) {
                System.out.print(" " + m.charAt(b));
            }
            System.out.println();
        }

        x.close();
    }
    public void sy1() {
        int a, b, n = 5;
        for (a = 1; a <= n; a++) {
            for (int c = 1; c <= 5 - a; c++) {
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++) {
                System.out.print(" " + a);
            }
            System.out.println();
        }
    }

    public void sy2() {
        int a, b, n = 5;
        for (a = 1; a <= n; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(" " + b);
            }
            System.out.println(" ");
        }
    }

    public void sy3() {
        int a, b, n = 1;
        for (a = 5; a >= n; a--) {
            for (int c = 1; c <= 5 - a; c++) {
                System.out.print(" ");
            }
            for (b = 1; b <= a; b++) {
                System.out.print(" " + b);
            }
            System.out.println(" ");
        }
    }

    public void sy4() {
        int a, b, n = 1;
        for (a = 5; a >= n; a--) {
            for (b = 1; b <= a; b++) {
                System.out.print(" " + b);
            }
            System.out.println(" ");
        }
    }
}

class name {

    public void n1() {
        String m;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        m = x.next();
        String b = m.toUpperCase();
        System.out.println("Hello " + b + ", Have A Good Day");
    }

    public void n2() {
        String m = "Dear Akshat, Thanks a lot";
        String j = m.replace("Akshat", "Happy");
        System.out.println("New String is -- " + j);
    }

    public void n3() {
        String m;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        m = x.next();
        int j = m.length();
        System.out.println("Length of String -- " + j);
    }

    public void n4() {
        String n;
        int m;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        n = x.next();
        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter The Position -- ");
        m = x1.nextInt();
        char f = n.charAt(m);
        System.out.println("Character at " + m + " position is -- " + f);
    }

    public void n5() {
        String m;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter The String -- ");
        m = x.next();
        int f = m.indexOf('a');
        System.out.println("New String is -- " + f);
    }
}

public class project {

    public static void main(String[] args) {
        pattern x = new pattern();
        name y = new name();
        Scanner get = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Press 1 for Pattern");
        System.out.println("Press 2 for String Operations");
        System.out.println("Enter your choice: ");
        d = get.nextInt();
        switch (d) {
            case 1 -> {
                System.out.println("Press 1 for Symbol Pattern");
                System.out.println("Press 2 for String Pattern");
                System.out.println("Press 3 for Number Pattern");
                System.out.println("Enter your choice");
                c = get.nextInt();
                switch (c) {
                    case 1 -> {
                        System.out.println("Press 1 for Triangle Pattern");
                        System.out.println("Press 2 for Left Half Triangle Pattern");
                        System.out.println("Press 3 for Square Hollow Pattern");
                        System.out.println("Press 4 for Square Fill Pattern");
                        System.out.println("Press 5 for Rhombus Pattern");
                        b = get.nextInt();
                        switch (b) {
                            case 1 -> {
                                System.out.println("Triangle Pattern");
                                x.p1();
                            }
                            case 2 -> {
                                System.out.println("Left Half Triangle Pattern");
                                x.p2();
                            }
                            case 3 -> {
                                System.out.println("Hollow Pattern");
                                x.p3();
                            }
                            case 4 -> {
                                System.out.println("Square Fill Pattern");
                                x.p4();
                            }
                            case 5 -> {
                                System.out.println("Rhombus Pattern");
                                x.p5();
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Press 1 for String Pattern 1");
                        System.out.println("Press 2 for String Pattern 2");
                        System.out.println("Press 3 for String Pattern 3");
                        System.out.println("Press 4 for String Pattern 4");
                        System.out.println("Enter your choice");
                        b = get.nextInt();
                        switch (b) {
                            case 1 -> {
                                System.out.println("Pattern 1");
                                x.s1();
                            }
                            case 2 -> {
                                System.out.println("Pattern 2");
                                x.s2();
                            }
                            case 3 -> {
                                System.out.println("Pattern 3");
                                x.s3();
                            }
                            case 4 -> {
                                System.out.println("Pattern 4");
                                x.s4();
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Press 1 for Number Triangle");
                        System.out.println("Press 2 for Increasing Number Triangle");
                        System.out.println("Press 3 for Reverse Number Triangle");
                        System.out.println("Press 4 for Reverse Pyramid");
                        System.out.println("Enter your choice");
                        b = get.nextInt();
                        switch (b) {
                            case 1 -> {
                                System.out.println("Number Triangle");
                                x.sy1();
                            }
                            case 2 -> {
                                System.out.println("Increasing Number Triangle");
                                x.sy2();
                            }
                            case 3 -> {
                                System.out.println("Reverse Number Triangle");
                                x.sy3();
                            }
                            case 4 -> {
                                System.out.println("Reverse Pyramid");
                                x.sy4();
                            }
                        }
                    }
                }
            }
        }
        switch (d) {
            case 2 -> {
                System.out.println("Press 1 for Uppercase Greeting");
                System.out.println("Press 2 for Replace Name");
                System.out.println("Press 3 for String Length");
                System.out.println("Press 4 for Finding Character Position");
                System.out.println("Press 5 for Index of 'a'");
                System.out.println("Enter your choice: ");
                b = get.nextInt();
                switch (b) {
                    case 1 ->
                        y.n1();
                    case 2 ->
                        y.n2();
                    case 3 ->
                        y.n3();
                    case 4 ->
                        y.n4();
                    case 5 ->
                        y.n5();
                }
            }
        }
    }
}
