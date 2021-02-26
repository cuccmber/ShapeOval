package com.yasuchenya.shape.parser;

import com.yasuchenya.shape.entity.AbstractShape;
import com.yasuchenya.shape.entity.CartesianPoint;
import com.yasuchenya.shape.entity.Oval;
import com.yasuchenya.shape.exception.ShapeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static com.yasuchenya.shape.factory.OvalFactory.createShape;
import static com.yasuchenya.shape.validator.InputDataValidator.isDataValid;

public class StringToShapeParser {
    static Logger logger = LogManager.getLogger();
    private static final String POINT_BEGINNING_DELIMITER = "(";
    private static final String POINT_COORDINATES_DELIMITER = ",";
    private static final String POINT_ENDING_DELIMITER = ")";


    public List<AbstractShape> parseStringToShape(List<String> sourceStrings) throws ShapeException {
        List<AbstractShape> ovals = new ArrayList<>();
        for(int i = 0; i < sourceStrings.size(); i++){
            if(isDataValid(sourceStrings.get(i))){
                List<CartesianPoint> coordinates = new ArrayList<>();
                String currentString = sourceStrings.get(i);
                int start = -1;
                int comma = -1;
                int end = -1;
                for(int j = 0; j < currentString.length(); j++){
                    switch (currentString.substring(j, j + 1)) {
                        case POINT_BEGINNING_DELIMITER: start = j;
                            break;
                        case POINT_COORDINATES_DELIMITER: comma = j;
                            break;
                        case POINT_ENDING_DELIMITER: end = j;
                            break;
                        }
                    if(start >= 0 && comma >= 0 && end >= 0) {
                        int x = Integer.parseInt(currentString.substring(start + 1, comma));
                        int y = Integer.parseInt(currentString.substring(comma + 1, end));
                        CartesianPoint point = new CartesianPoint(x, y);
                        coordinates.add(point);
                        start = -1;
                        comma = -1;
                        end = -1;
                    }
                    if(coordinates != null && coordinates.size() == 3){
                        AbstractShape oval = createShape(coordinates.get(0), coordinates.get(1), coordinates.get(2));
                        ovals.add(oval);
                        coordinates.clear();
                    }
                }
            }
        }
        if(ovals == null || ovals.size() == 0){
            throw new ShapeException("Nothing has been parsed");
        }
        return ovals;
    }
}
