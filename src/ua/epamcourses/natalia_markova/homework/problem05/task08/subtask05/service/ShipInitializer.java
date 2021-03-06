package ua.epamcourses.natalia_markova.homework.problem05.task08.subtask05.service;

import ua.epamcourses.natalia_markova.homework.problem05.task08.subtask05.model.Cell;
import ua.epamcourses.natalia_markova.homework.problem05.task08.subtask05.model.Ship;

/**
 * Created by natalia_markova on 13.05.2016.
 */
public abstract class ShipInitializer {

    protected int qtyOfVariants;

    public int getQtyOfVariants() {
        return qtyOfVariants;
    }

    public abstract Ship getShip(Cell initialCell, int variant);
}
