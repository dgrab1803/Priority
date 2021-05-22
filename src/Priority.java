package academy.learnprogramming;

public class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    Priority(String name){
        thrd = new Thread(this,name);
        count = 0;
        currentName = name;
    }

    public void run(){
        System.out.println(thrd.getName() + " rozpoczyna działanie ");
        do{
            count++;
            if(currentName.compareTo(thrd.getName()) !=0){
                currentName = thrd.getName();
                System.out.println(currentName + " jest wykonywany ");
            }

        }while (stop == false && count <100000);
        stop = true;
        System.out.println("\n" + thrd.getName() + " kończy działanie ");
    }
}
