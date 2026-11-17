

//Egger Initialization
public class ConfigurationManager {
    private static final ConfigurationManager instance = new ConfigurationManager();


    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        ConfigurationManager obj1 = ConfigurationManager.getInstance();
        ConfigurationManager obj2 = ConfigurationManager.getInstance();

        System.out.println( obj1 == obj2);
        System.out.println( "******************");

        ConfigurationManager_Interview  instance_22 = ConfigurationManager_Interview.getInstance_2();
        ConfigurationManager_Interview  instance_33 = ConfigurationManager_Interview.getInstance_2();

        System.out.println( instance_22 == instance_33);
    }
}

//Lazy Initialization - Object creates only when it needed.
class ConfigurationManager1 {

    private static ConfigurationManager1 instance1;

    private ConfigurationManager1(){

    }

    //To make it thread safe I need to use synchronized after static keyword.
    public static ConfigurationManager1 getInstance1(){

        if(instance1 == null){

            instance1 = new ConfigurationManager1();
        }

        return instance1;
    }

}

//Best for Interview
// To use the instance i can simple call the getInstance_2() method in main method
class ConfigurationManager_Interview{

    private static volatile ConfigurationManager_Interview instance_2;

    //volatile - provide visibility - If Thread-1 updates instance, Thread-2 immediately sees the latest value.

    private ConfigurationManager_Interview(){

    }
   //Double checked Locking - Double checked Locking is useful because if the object is already created then
    // unnecessarily not need to go through synchronized method we can immediatly return the instance
    public static ConfigurationManager_Interview getInstance_2(){

        if(instance_2 == null){

            synchronized (ConfigurationManager_Interview.class){

                if(instance_2 == null){

                    instance_2 = new ConfigurationManager_Interview();
                }
            }
        }

        return instance_2;
    }
}
