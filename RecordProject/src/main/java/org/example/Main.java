package org.example;

public class Main {
    public static void main(String[] args) {
        //POJO - plain old java project

        for(int i = 1;i<=5;i++){
            LPAStudent s = new LPAStudent("S92300"+i,
                    switch (i){
                         case 1 -> "John";
                         case 2 -> "Paul";
                         case 3 -> "Ravindhar";
                         case 4 -> "prem Jacob";
                         case 5 -> "Tony Stark";
                        default -> "Anonamous";
                    },"16/10/2002",
                    "Java MasterClass");
            System.out.println(s);
        }
        System.out.println();

        Student pojo = new Student("S94001","Thanos",
                "01/12/1958","Java PojoClass");
        LPAStudent rec = new LPAStudent("S91230","Iron Man",
                "08/04/2003","Java RecordClass");

        System.out.println(pojo);
        System.out.println(rec);
        System.out.println();

        //pojo can be able to make setters and getters
        System.out.println(pojo.getClassList());
        pojo.setClassList(pojo.getClassList()+", java OCP Exam 289");
        System.out.println(pojo.getClassList());

        //record cannot be able to make setters
        //rec.setClassList(rec.classList()+", java OCP Exam 289");

        System.out.println();
        //using pojo and record
        System.out.println("Name = "+pojo.getName()+", id= "+pojo.getId()+", DOB= "+pojo.getDateOfBirth());
        System.out.println("Name = "+rec.name()+", id= "+rec.id()+", DOB= "+rec.dateOfBirth());




    }
}