public class TallyCounter_Test {
    public static void main(String[] args) {
        TallyCounter W= new TallyCounter();
        System.out.println("the value of counter after building "+W.getValue());
        W.click();
        W.click();
        W.click();
        System.out.println("the value of counter after three clicks "+W.getValue());
        W.undo();
        W.undo();
        W.undo();
        W.undo();


        System.out.println("the value of counter after the undo "+W.getValue());
        W.reset();
        System.out.println("the value of counter after reset "+W.getValue());

    }
}

