package Versus;

class Chicken extends Thread {

    Chicken(String name) {
        setName(name);
    }
    @Override
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            try{
                sleep(5000);
            }catch(InterruptedException e){}

            System.out.println("Курица");
        }
    }
}
