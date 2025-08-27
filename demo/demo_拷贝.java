package demo;
public class demo_拷贝 {
    public static void main(String[] args) {
        // 浅拷贝示例
        Person original = new Person("A", 0);
        try {
            Person cloned = (Person) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 深拷贝示例
        Address address = new Address("New York");
        Employee original1 = new Employee("Bob", address);
        try {
            Employee cloned = (Employee) original1.clone();
            System.out.println("Original: " + original1);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    static class Person implements Cloneable {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone(); // 浅拷贝
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    static class Address implements Cloneable {
        private String city;

        public Address(String city) {
            this.city = city;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Address{city='" + city + "'}";
        }
    }

    static class Employee implements Cloneable {
        private String name;
        private Address address;

        public Employee(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            Employee cloned = (Employee) super.clone();
            cloned.address = (Address) address.clone(); // 深拷贝 Address
            return cloned;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', address=" + address + "}";
        }
    }

}
