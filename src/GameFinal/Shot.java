package GameFinal;

/**
 * @author Yulia Shi
 * @version 1.0
 * bullets
 */
public class Shot implements Runnable {
    int x;
    int y;
    int direct = 0;
    int speed = 2;
    boolean isLive = true;

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (direct) {
                case 0://up
                    y -= speed;
                    break;
                case 1://right
                    x += speed;
                    break;
                case 2://down
                    y += speed;
                    break;
                case 3://left
                    x -= speed;
                    break;
            }

            //When the bullet moves to the border of the panel OR hits the enemy tank
            //It should be destroyed (destroy the thread of the launched bullet)
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("exit thread of the bullet");
                isLive = false;
                break;
            }
        }
    }
}
