package exercicios.professor;

// Defina uma classe chamada Professor com os atributos: matrícula, nome do professor e nome do departamento. Inclua na classe um construtor, os métodos gets e sets e um método para imprimir o conteúdo dos atributos.

public class Professor {
    private String registrationNumber;
    private String name;
    private String department;

    public Professor(String registrationNumber, String name, String department) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.department = department;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInformation() {
        System.out.println("The professor's name is " + getName() + ", your registration number is " + getRegistrationNumber() + " and your department is " + getDepartment() + ".");
    }
}
