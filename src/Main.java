// Creare una classe Student che accenti nel costruttore il parametro
// name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Mario",8));
        students.add(new Student("Maria",10));
        students.add(new Student("Mariana",12));
        students.add(new Student("Mariano",14));
        students.add(new Student("Mariangel",16));
        students.add(new Student("Marina",18));
        students.add(new Student("Marcos",20));
        students.add(new Student("Marcelo",22));
        students.add(new Student("Marcela",24));
        students.add(new Student("Mari",26));
        students.add(new Student("Marin",28));
        students.add(new Student("Marian",30));

        for (Student student : students){
            System.out.println("Tutti students : " +student.getNome() + " " + student.getAge());
        }
        Collections.sort(students, (nome, age) -> nome.getNome().compareTo(String.valueOf(age.getAge())));


    }
}