/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazadaDoble;

/**
 *
 * @author Luis Andrés
 */
public class Person {

    private String name = "";
    private String lastName = "";
    private int idNumber = 0;
    private int age = 0;

    public Person(String name, String lastName, int idNumber, int age) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ListException {

        if ((verifyNumber(name)) || (verifyWhitespace(name)) || (name == "")) {
            throw new ListException("Su nombre no debe tener números o signos");
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws ListException {

        if ((verifyNumber(lastName)) || (verifyWhitespace(lastName)) || (lastName == "")) {
            throw new ListException("Su apellido no debe tener números o signos");
        }
        this.lastName = lastName;

    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) throws ListException {

        if (idNumber < 0) {
            throw new ListException("El número de cédula debe ser mayor a 0");
        }
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ListException {

        if ((age < 0) || (age > 200)) {
            throw new ListException("La edad debe ser mayor a 0 y menor a 200");
        }
        this.age = age;
    }

    /**
     *
     * @param name
     * @return
     *
     * Method used in sets to verify its validity
     */
    private boolean verifyWhitespace(String name) {

        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param name
     * @return
     *
     * Method used in sets to verify its validity
     */
    private boolean verifyNumber(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
