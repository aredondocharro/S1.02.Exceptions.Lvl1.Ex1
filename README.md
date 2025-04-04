# 🛒 Exception demonstration with a ShoppingCart

## 📄 Description - Exercise Statement

Create a class called "Product" with the attributes name and price, and another class called "Sale". This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception "EmptyShoppingCartException" and displays on the screen "To make a sale you must first add products" if the product collection is empty. If the collection has products, then it must traverse the collection and save the sum of all the prices of the products in the attribute total price of the sale.

The custom exception "EmptyShoppingCartException" must be a child of the Exception class. In its constructor we must pass the message "To make a sale you must first add products" and when we capture the exception, we must display it on the screen with the exception's getMessage() method.

Write the code necessary to generate and catch an exception of type "IndexOutOfBoundsException".

## 💻 Technologies Used

- IntelliJ IDEA Community Edition 2024.3.4.1

## 📋 Requirements

- IntelliJ IDEA

## 🛠️ Installation

**Clone:**
1. File > New > Project from Version Control
2. Paste GitHub URL
3. Select destination folder

**Configure:**
1. Open File > Project Structure
2. Assign correct JDK (Java 8/11/17...)

**Dependencies:**
- For Maven: Click "Load IntelliJ IDEA Project"
- For Maven: Click "Load Maven Project"
- For Gradle: Click "Load Gradle Project"

**Run:**
1. Locate class with `public static void main`
2. Right-click > Run 'Class.main()'