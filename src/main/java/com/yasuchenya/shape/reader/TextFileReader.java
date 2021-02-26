package com.yasuchenya.shape.reader;

import com.yasuchenya.shape.exception.ShapeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFileReader {
    static Logger logger = LogManager.getLogger();

    public List<String> readFromTextFile(String fileName) throws ShapeException {
        List<String> strings = new ArrayList<>();
        Path filePath = Paths.get(fileName);
        if(Files.exists(filePath) && !Files.isDirectory(filePath) && Files.isReadable(filePath)) {
            Stream<String> stringStream = null;
            try {
                stringStream = Files.lines(filePath);
            } catch (IOException e) {
                logger.error("IOException while reading file  " + filePath + ": " + e.getMessage());
            }
            strings = stringStream.collect(Collectors.toList());
        } else {
            logger.error("Error occurred while reading file" + filePath.toString());
        }
        if(strings == null || strings.size() == 0){
            throw new ShapeException("Nothing has been read");
        }
        return strings;
    }
}
