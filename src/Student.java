public class Student {
    public String nome;
    public Integer age;
    Student(String nome,Integer age){
        this.nome= nome;
        this.age= age;
    }

    public Integer getAge() {
        return age;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}
