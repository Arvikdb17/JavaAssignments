package Inheritance;

public class Students {
    String name;
    int id;
    String address;
    Students(){

    }
    Students(String name){
        this.name=name;
        Students student=new Students(name);
    }
    Students(String name,int id,String address){
        this.name=name;
        this.id=id;
        this.address=address;
        ZSGSStudent zsgsStudent=new ZSGSStudent(name,id,address);
    }
    public static void main(String[] args){
        //Students student=new ZSGSStudent("ACS");
        // Got Exception in thread "main" java.lang.StackOverflowError
        //Student student=new Student("ABC",1,"Chennai");
        //Exception in thread "main" java.lang.StackOverflowError
    }
}
class ZSGSStudent extends Students{
    int batch;
    boolean isPlaced;

    ZSGSStudent(String name,int id,String address){
        super(name,id,address);
    }
    ZSGSStudent(String name,int id,String address,int batch,boolean isPlaced){
        super(name, id, address);
        this.batch=batch;
        this.isPlaced=isPlaced;
    }
    ZSGSStudent(String name){
        super(name);

    }
}

