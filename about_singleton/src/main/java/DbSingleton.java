public class DbSingleton {
    private static DbSingleton instance = null;

    private DbSingleton(){
        if( instance != null){
            throw new RuntimeException("Use getInstance() method to create instance");
        }
    }

    public static DbSingleton getInstance(){
        if(instance == null){ // lazy loading, it won't be created when system is starting up
            synchronized (DbSingleton.class){ // thread safe
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
