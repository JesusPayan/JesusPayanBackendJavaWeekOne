package com.clasesreforzamiento.cesaramaya.equals;


public class Student {
    int id;
    static boolean flag;
    Student(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object obj){
        if(obj.getClass() == this.getClass()){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }



}
