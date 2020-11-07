public class Droid {
    int batteryLevel;
    String name;



    public Droid(String droidName){
    batteryLevel=100;
    name=droidName;
    }
    public void performTask(String task){
        batteryLevel=batteryLevel-10;
        System.out.println(name+" is performing task:"+task);
    }




    public String toString(){
        return "Hello I am the droid: " +name;
    }

    public static void main(String[] args) {
    Droid codey=new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("coding");

    }
}
