public class Main {

    public static void main(String[] args) {

        Rectangle border = new Rectangle (0, 0, 300, 300);
        Ellipse circle = new Ellipse(50, 50, 200, 200);
        Ellipse walker = new Ellipse(145, 145, 10, 10);
        border.setColor(Color.BLUE);
        border.fill();
        walker.setColor(Color.RED);
        walker.fill();
        circle.draw();
        border.draw();
        walker.draw();
        walker.fill();
        border.fill();

        int xMovement;
        int yMovement;
        int count = 0;

        while ((walker.getX() < 250 && walker.getX() > 50) && (walker.getY() < 250 && walker.getY() > 50)) {
            xMovement = (int) ((Math.random() * 20) - 10);
            yMovement = (int) ((Math.random() * 20) - 10);
            walker.translate(xMovement, yMovement);
            count = count + 1;
            try { Thread.sleep(100);}
            catch(Exception ex) {};

        }

        System.out.println("Escaped in " + count + " steps.");
    }

}