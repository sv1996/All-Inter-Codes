package AbstractClassesImpl;

public interface myInterface {
    int  a =10;

void eating();

}


class InterfaceImpl implements  myInterface{

    @Override
    public void eating() {
        System.out.println("Eating Food");
     }




}

