package homework_42.task_01;

import java.util.Comparator;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (26.03.2025)
 */
public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman man1, Sportsman man2) {
        return man1.getScore() - man2.getScore();
    }
}
