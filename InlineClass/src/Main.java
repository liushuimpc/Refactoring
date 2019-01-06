
public class Main {
    private final static String name = "MarcoLi";
    private final static String areaCode = "0075";
    private final static String number = "1234567890";
    
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person person;
        person = new Person(name, areaCode, number);
        
        System.out.println(person.getInfo());
    }

}
