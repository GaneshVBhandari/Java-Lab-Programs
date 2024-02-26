/*
Write a program that demonstrates handling of exceptions
in inheritance tree. Create a base class called “Father” and
derived class called “Son” which extends the base class. In
Father class, implement a constructor which takes the age and
throws the exception WrongAge( ) when the input age<0. In
Son class, implement a constructor that cases both father and
son’s age and throws an exception if son’s age is >=father’s
age.
*/

class WrongAgeException extends Exception {
    WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    private int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age should be less than Father's age");
        }
        this.sonAge = sonAge;
    }

    public int getSonAge() {
        return sonAge;
    }
}

public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Ganesh Venkatraman Bhandari");
        System.out.println("1BM22CS098");
        try {
            Father father = new Father(10);
            System.out.println("Father's age: " + father.getAge());
            Son son = new Son(10, 20);
            System.out.println("Son's age: " + son.getSonAge());
        } catch (WrongAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

