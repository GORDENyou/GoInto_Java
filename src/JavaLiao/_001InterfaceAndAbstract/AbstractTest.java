package JavaLiao._001InterfaceAndAbstract;

public abstract class AbstractTest {
    private int privateVariable = 0;
    protected int protectedVariable = 1;
    int publicVariable = 2;


    protected int getPrivateVariable(){
        return privateVariable;
    }

    abstract void getProtectedVariable();
}
