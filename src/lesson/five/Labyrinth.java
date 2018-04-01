package lesson.five;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by adrie on 29.03.2018.
 */
public class Labyrinth {
    private String[][] labyrinth;
    private Deque<Coordinate> route;
    public Labyrinth(String[][] labyrinth){
        this.labyrinth = labyrinth;
        this.route = new ArrayDeque<>();
    }

    public String[][] getLabyrinth() {
        return labyrinth;
    }

    public void displayLabyrinth(String[][] labyrinth){
        for(int i = 0; i<labyrinth.length; i++){
            for(int j = 0; j<labyrinth[i].length; j++){
                System.out.print( labyrinth[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void findExit(int startI, int startJ, int endI, int endJ){
        moveArea(labyrinth,startI,startJ,endI,endJ);
    }
    private boolean moveArea(String[][] area, int i, int j, int endI, int endJ){
        displayLabyrinth(area);
        area[i][j] = "o";
        //проверка на конечную точку
        if(i == endI && j == endJ){
            return true;
        }
        //передвижение
        if(j+1 < area[i].length && area[i][j+1].equals(" ")){//вниз
            route.addLast(new Coordinate(i, j+1));
            moveArea(area, i, j+1, endI, endJ);
        } else if(j-1 >= 0 && area[i][j-1].equals(" ")){//вверх
            route.addLast(new Coordinate(i, j-1));
            moveArea(area, i, j-1, endI, endJ);
        } else if(i-1 >=0 && area[i-1][j].equals(" ")){//влево
            route.addLast(new Coordinate(i-1, j));
            moveArea(area, i-1, j, endI, endJ);
        } else if(i+1 < area.length && area[i+1][j].equals(" ")){//вправо
            route.addLast(new Coordinate(i+1, j));
            moveArea(area, i+1, j, endI, endJ);
        } else {
            //возврат к другой ветке
            area[i][j] = "*";
            Coordinate backMove = route.pollLast();
            moveArea(area, backMove.getX(), backMove.getY(), endI, endJ);
        }
        return false;
    }
    public void displayDeque(){
        for(Coordinate coordinates: route){
            System.out.println(coordinates.toString());
        }
    }
}
