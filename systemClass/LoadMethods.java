package systemClass;

// Java code illustrating runFinalization(), load(), loadLibrary() and mapLibraryName() method

public class LoadMethods {
    public static void main(String args[]) throws NullPointerException {
        // map library name
        String libName = System.mapLibraryName("os.name");
        System.out.println("os.name library= " + libName);

        //load external libraries
        System.load("lixXYZ.so");
        System.loadLibrary("libos.name.dylib");

        //run finalization
        System.runFinalization();
    }
}
