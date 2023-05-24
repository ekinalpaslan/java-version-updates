package com.cydeo.tasks;

//Q5
public class Q5 {
/*
No, the provided code will not compile. The reason is that Node<Circle> and Node<Shape> are not compatible types for assignment.

In Java, generic type parameters are invariant by default. This means that even if Circle is a subtype of Shape, Node<Circle> is not considered a subtype of Node<Shape>. Consequently, you cannot assign a Node<Circle> instance to a variable of type Node<Shape>.

This behavior is in place to ensure type safety. If it were allowed, you could potentially insert a non-circle shape into the Node<Shape> instance ns, violating the type constraint of Node<Circle>.
 */
}
