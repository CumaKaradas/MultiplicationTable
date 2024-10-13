# Çarpım Tablosu Programı

Bu Java programı, belirli bir boyutta çarpım tablosu oluşturur ve konsola yazdırır.

## Özellikler

- Belirli bir boyutta (varsayılan olarak 10x10) çarpım tablosu oluşturur.
- Oluşturulan tabloyu konsola düzenli bir şekilde yazdırır.

## Kullanım

1. Programı derleyin ve çalıştırın.
2. Program otomatik olarak 10x10 boyutunda bir çarpım tablosu oluşturacak ve ekrana yazdıracaktır.

## Özelleştirme

Çarpım tablosunun boyutunu değiştirmek için, `tabloBoyutu` değişkeninin değerini kodda değiştirebilirsiniz.

## Gereksinimler

- Java Runtime Environment (JRE)

## Derleme ve Çalıştırma

```bash
javac CarpimTablosu.java
java CarpimTablosu
```

## Program Yapısı

- Program, iç içe iki `for` döngüsü kullanarak çarpım tablosunu oluşturur.
- Dış döngü satırları, iç döngü sütunları temsil eder.
- Her hücre, satır ve sütun numaralarının çarpımını içerir.
- Sonuçlar tab karakteri (`\t`) ile ayrılarak düzenli bir görünüm elde edilir.

---

# Multiplication Table Program

This Java program creates and prints a multiplication table of a specified size to the console.

## Features

- Creates a multiplication table of a specific size (default is 10x10).
- Prints the generated table to the console in an organized manner.

## Usage

1. Compile and run the program.
2. The program will automatically create and display a 10x10 multiplication table.

## Customization

To change the size of the multiplication table, you can modify the value of the `tabloBoyutu` variable in the code.

## Requirements

- Java Runtime Environment (JRE)

## Compilation and Execution

```bash
javac CarpimTablosu.java
java CarpimTablosu
```

## Program Structure

- The program uses two nested `for` loops to create the multiplication table.
- The outer loop represents rows, while the inner loop represents columns.
- Each cell contains the product of the row and column numbers.
- Results are separated by tab characters (`\t`) to achieve an organized layout.
