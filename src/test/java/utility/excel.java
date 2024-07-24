package utility;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class excel {
    private Workbook workbook;
    private Sheet sheet;


    public excel(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCellValue(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        if (cell == null) {
            return ""; // Return empty string for null cells
        } else {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        // If the cell contains a date, return it as a formatted string
                        return cell.getDateCellValue().toString();
                    } else {
                        Double d=cell.getNumericCellValue();
                         DecimalFormat decimalFormat = new DecimalFormat("#");

                        // If the cell contains a numeric value, convert it to string
                        return decimalFormat.format(d);
                    }
                case BOOLEAN:
                    return String.valueOf(cell.getBooleanCellValue());
                case BLANK:
                    return ""; // Return empty string for blank cells
                default:
                    return ""; // Return empty string for other cell types
            }
        }
    }
}
