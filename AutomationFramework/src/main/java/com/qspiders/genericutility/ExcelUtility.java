package com.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import javax.crypto.EncryptedPrivateKeyInfo;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Chetan
 */
public class ExcelUtility {
	/**
	 * this method will read string from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void getStringDataFromExcelString(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}

	public void getbooleanDataFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}

	public void getnumericDataFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}

	public void getDataAndTimeDataFrom(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

	}
}
