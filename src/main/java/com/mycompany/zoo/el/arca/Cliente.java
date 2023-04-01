package com.mycompany.zoo.el.arca;

import javax.swing.ComboBoxModel;

public class Cliente implements ComboBoxModel<Cliente> {

    private int id;
    private String name;
    private int age;
    private String tipo;
    private int numVisitas;

    
    public Cliente(int id, String name, int age, String tipo, int numVisitas) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tipo = tipo;
        this.numVisitas = numVisitas;
    }
    public Cliente() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumVisitas() {
        return numVisitas;
    }
    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name='" + name +  ", age='" + age + '\'' + '}';
    }
   
}
