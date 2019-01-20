package Interfaces;
interface Printable{
    void print();
}

interface Showable{
    void show();
}

class MultipleInheritanceUsingInterface implements Printable,Showable{

    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        MultipleInheritanceUsingInterface obj = new MultipleInheritanceUsingInterface();
        obj.print();
        obj.show();
    }
}
