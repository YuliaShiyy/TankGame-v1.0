package GameFinal;

import java.util.Vector;

/**
 * @author Yulia Shi
 * @version 1.0
 * Your own tank
 */
public class Hero extends Tank {

    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {

        // There are only 5 friendly bullets on the control panel at most.
        if(shots.size() == 5) {
            return;
        }

        Shot shot = null;
        switch (getDirect()) {
            case 0: //up
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1: //right
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2: //down
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3: //left
                shot = new Shot(getX(), getY() + 20, 3);
                break;
        }

        shots.add(shot);
        new Thread(shot).start();
    }
}