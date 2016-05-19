package ua.epamcourses.natalia_markova.homework03.task07.service;

import ua.epamcourses.natalia_markova.homework03.task07.model.Cell;
import ua.epamcourses.natalia_markova.homework03.task07.model.Field;
import ua.epamcourses.natalia_markova.homework03.task07.model.Ship;
import ua.epamcourses.natalia_markova.homework03.task07.model.ShipInitializingException;

/**
 * Created by natalia_markova on 13.05.2016.
 */
public class RandomFieldInitializer implements FieldInitializer {

    @Override
    public Field initializeField() {
        Field field = new Field();
        Ship[] ships = null;
        Cell[][] cells = field.getCells();

        // initializing ships
        while (true) {
            try {
                ships = ShipService.initializeShips(cells);
                break;
            } catch (ShipInitializingException e) {

            }
        }

        // initializing the rest cells of the field
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (cells[i][j] == null) {
                    cells[i][j] = new Cell(i, j);
                }
            }
        }
        field.setCells(cells);
        field.setShips(ships);
        return field;
    }
}
