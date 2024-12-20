package app;

import java.util.Random;

  public class Main {
        public static void main(String[] args) {
            // 1. Створення масиву з 20 елементами
            int[] numbers = new int[20];
            Random random = new Random();

            // 2. Заповнення масиву випадковими числами від -100 до 100
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(201) - 100; // Діапазон [-100, 100]
            }

            // Виведення елементів масиву
            System.out.print("Елементи масиву: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // 3. Знаходження суми від'ємних чисел
            int negativeSum = 0;
            for (int num : numbers) {
                if (num < 0) {
                    negativeSum += num;
                }
            }
            System.out.println("Сума від'ємних чисел: " + negativeSum);

            // 4. Знаходження кількості парних і непарних чисел
            int evenCount = 0, oddCount = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Кількість парних чисел: " + evenCount);
            System.out.println("Кількість непарних чисел: " + oddCount);

            // 5. Знаходження найбільшого та найменшого елемента і їхніх індексів
            int min = numbers[0], max = numbers[0];
            int minIndex = 0, maxIndex = 0;

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    minIndex = i;
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                    maxIndex = i;
                }
            }
            System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
            System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

            // 6. Середнє арифметичне чисел після першого від'ємного числа
            int firstNegativeIndex = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    firstNegativeIndex = i;
                    break;
                }
            }

            if (firstNegativeIndex != -1) {
                int sumAfterNegative = 0;
                int countAfterNegative = 0;

                for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                    sumAfterNegative += numbers[i];
                    countAfterNegative++;
                }

                if (countAfterNegative > 0) {
                    double average = (double) sumAfterNegative / countAfterNegative;
                    System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", average);
                } else {
                    System.out.println("Немає чисел після першого від'ємного числа.");
                }
            } else {
                System.out.println("Від'ємних чисел немає у масиві.");
            }
        }
  }