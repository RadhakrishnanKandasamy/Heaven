package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * This class is the utility class for the excel files. To process and
 * manipulate excel files using the Apache POI library.
 * 
 * @author sasihan
 * @since 18-10-2017
 * @version 1.0.0
 */
public class ExcelUtil {

	Workbook workbook;// excel workbook object to manipulate with the excel files

	public ExcelUtil(String fileName) {

		try {
			workbook = new XSSFWorkbook(new File(fileName));
		} catch (FileNotFoundException f) {
			System.out.println("FileNotFoundException" + f);
		} catch (Exception e) {
			System.out.println("Error while reading the file." + e);
		}
	}

	/**
	 * This method is used to get the workbook object
	 * 
	 * @return
	 */
	public Workbook getWorkbook() {
		if (Objects.isNull(workbook)) {
			System.out.println("Workbook not initialized.");
		}
		return workbook;
	}

}
