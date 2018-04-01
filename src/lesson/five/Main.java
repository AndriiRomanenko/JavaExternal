package lesson.five;

/**
 * Created by adrie on 29.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        String[][] matrix = {   {"X","X","X","X","X","X","X","X","X","X"},
                                {" "," ","X"," "," "," ","X"," "," "," "},
                                {"X"," ","X"," ","X"," ","X"," ","X"," "},
                                {" "," ","X"," ","X"," "," "," ","X"," "},
                                {" ","X","X"," ","X","X","X"," ","X"," "},
                                {" "," "," "," ","X"," ","X"," ","X"," "},
                                {"X","X","X"," "," "," ","X"," ","X"," "},
                                {" "," "," "," ","X","X","X"," ","X"," "},
                                {" ","X","X","X","X"," ","X"," ","X","X"},
                                {" "," "," "," "," "," ","X"," "," "," "}};

        Labyrinth labyrinth = new Labyrinth(matrix);
        labyrinth.displayLabyrinth(matrix);
        labyrinth.findExit(1,0,9,9);
        System.out.println();
        labyrinth.displayLabyrinth(labyrinth.getLabyrinth());
        System.out.println();
        labyrinth.displayDeque();
    }
}
