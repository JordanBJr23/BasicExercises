package BasicExercises;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class BasicExercises {
    
    public void greet() {
        System.out.println("Hola Mundo");
    }
    
    public void miniCalculator() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
        
        while (number2 == 0) {
            JOptionPane.showMessageDialog(null, "you can't divide by 0");
            number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
            number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
        }
        System.out.println("The result of the sum is: " + (number1 + number2));
        System.out.println("The result of the subtraction is: " + (number1 - number2));
        System.out.println("The result of the multiplication is: " + (number1 * number2));
        System.out.println("The result of the division is: " + (number1 / number2));
    }
    
    public void numberToASCII() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        char ascii = (char) number;
        System.out.println("The number you digital belong to the caracter: " + ascii);
        
    }
    
    public void evenOrOdd() {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        
    }
    
    public void compare() {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
        
        if (number1 > number2) {
            System.out.println("The largest number is: " + number1);
        }
        if (number1 < number2) {
            System.out.println("The largest number is: " + number2);
        } else if (number1 == number2) {
            System.out.println("the numbers are the same");
        }
    }
    
    public void countTo100() {
        System.out.println("While");
        
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        
        System.out.println("\nFor");
        
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }
    }
    
    public void divisibility() {
        String divisibility2 = "numbers divisible by 2: ";
        String divisibility3 = "numbers divisible by 3: ";
        
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
            if (j % 3 == 0) {
                divisibility3 += j + " ";
            }
            if (j % 2 == 0) {
                divisibility2 += j + " ";
            }
        }
        System.out.println("\n" + divisibility2);
        System.out.println(divisibility3);
    }
    
    public void insert1() {
        int num = 0;
        while (num != -1) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Do not type -1"));
        }
        JOptionPane.showMessageDialog(null, "The application ended");
        
    }
    
    public void addition(int n1, int n2) {
        System.out.println("The sum is: " + (n1 + n2));
    }
    
    public int askForNumbers() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
        return num;
    }
    
    public void majorMinor() {
        int num = askForNumbers();
        if (num > 0) {
            System.out.println("The number is greater than zero");
        }
        if (num < 0) {
            System.out.println("The number is less than zero");
        }
        
    }
    
    public int Ascii(char a) {
        int numberAscii = (int) a;
        return numberAscii;
        
    }
    
    public int randomNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (min - (max + 1)) + (max + 1));
    }
    
    public int[] array100() {
        int list[] = new int[100];
        
        for (int i = 0; i <= 99; i++) {
            list[i] = i + 1;
        }
        
        for (int i : list) {
            // System.out.println(i);
        }
        return list;
    }
    
    public void sumArray(int array[]) {
        int addition = 0;
        double half = 0;

        // addition
        for (int i = 0; i < array.length; i++) {
            addition += array[i];
        }
        System.out.println("The sum total is: " + addition);

        // half
        half = addition / 100;
        System.out.println("The mean is: " + half);
        
    }
    
    public void arrayUser() {
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the arrangement"));
        int list[] = new int[tam];
        int num;
        
        for (int i = 0; i < tam;) {
            num = randomNumber(0, 10);
            if (num >= 0 && num <= 10) {
                list[i] = num;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "The number must be between 0 and 10");
            }
        }
        
        for (int j : list) {
            System.out.println(j);
        }
        
    }
    
    public void Abc() {
        char list[] = new char[26];
        int pos = 0;
        int num = 0;
        for (int i = 65; i < 91; i++) {
            list[pos] = (char) i;
            pos++;
        }
        
        while (num != -1) {
            num = askForNumbers();
            if (num >= 0 && num <= 25) {
                System.out.println(list[num]);
            } else if (num != -1) {
                JOptionPane.showMessageDialog(null, "You must enter a number between 0 and 25");
            }
        }
        
    }
    
    public String fact(int num) {
        double fac = 1;
        String facc = num + "! =" + " ";
        for (int i = 1; i < num; i++) {
            facc += i + " x ";
            fac *= i + 1;
        }
        facc += num + " =" + " " + fac;
        return facc;
    }
    
    public void isCousin(int num) {
        
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        
    }
    
    public char[] reverseArray(char array[]) {
        
        char number[] = new char[array.length];
        int j = 0;
        
        for (int i = array.length - 1; i >= 0; i--) {
            number[j] = array[i];
            j++;
        }
        
        return number;
    }
    
    public void palindrome() {
        
        char array1[] = JOptionPane.showInputDialog("Ingrese una palabra").replace(" ", "").toCharArray();
        char array2[] = new char[array1.length];
        boolean isPalindrome = false;
        
        array2 = reverseArray(array1);
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            
        }
        
        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        
    }
    
    public void matriz3x3() {
        int matriz[][] = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = askForNumbers();
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void array5xn() {
        int n = askForNumbers();
        int array[][] = new int[5][n];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = randomNumber(0, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public void verMatriz(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public int casteo(String n) {
        int numero = Integer.parseInt(n);
        return numero;
    }
    
    public void adittionArray() {
        int fil = askForNumbers();
        int col = askForNumbers();
        
        int array1[][] = new int[fil][col];
        int array2[][] = new int[fil][col];
        int array3[][] = new int[fil][col];
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array1[i][j] = casteo(JOptionPane.showInputDialog("Digite un numero para la fila "
                        + i + " columna " + j + " de la matriz 1"));
                array2[i][j] = casteo(JOptionPane.showInputDialog("Digite un numero para la fila "
                        + i + " columna " + j + " de la matriz 2"));
                array3[i][j] = array1[i][j] + array2[i][j];
            }
            
        }
        verMatriz(array1);
        System.out.println("");
        verMatriz(array2);
        System.out.println("");
        verMatriz(array3);
        
    }
    
    public void llenarArray(int n[]) {
        for (int i = 0; i < n.length; i++) {
            n[i] = askForNumbers();
        }
    }
    
    public void fillArrays() {
        int num[] = new int[10];
        Arrays.fill(num, -1);
        Arrays.fill(num, 3, 5, -3);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        
    }
    
    public void copyOFF() {
        int num[] = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = randomNumber(1, 9);
            System.out.print(num[i] + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        int array2[] = Arrays.copyOf(num, 12);
        
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        
    }
    
    public void equalsArrays() {
        int array1[] = new int[4];
        int array2[] = new int[4];
        JOptionPane.showMessageDialog(null, "Llena el primer array");
        llenarArray(array1);
        JOptionPane.showMessageDialog(null, "Llena el segundo array");
        llenarArray(array2);
        
        boolean igual = Arrays.equals(array1, array2);
        
        if (igual) {
            System.out.println("son iguales");
            
        }else{
            System.out.println("No son iguales");
        }
    }
    
    public void sortsArray(){
        int array[] = new int [5];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(1, 9);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        Arrays.sort(array);
        
       for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        
    }
    public String requestText(String sentence){
       return JOptionPane.showInputDialog(sentence);
    }
    
    public void vowels (){
        String sentence = requestText("Type a sentence");
       String sentence2 = sentence.toLowerCase();
        int contVowels = 0;
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence2.charAt(i);
            
            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contVowels++;
            }
        }
        
        System.out.println("The phrase " + sentence + " has " + contVowels + " vowels");
    }
    
    
}
