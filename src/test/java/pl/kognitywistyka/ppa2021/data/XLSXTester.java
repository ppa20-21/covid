package pl.kognitywistyka.ppa2021.data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XLSXTester {
	
	@Test
	public void testOpenSheet() {
		try (XLSXDataReader reader = new XLSXDataReader(getClass().getResourceAsStream("owid-covid-data.xlsx"))) {
			XSSFSheet sheet = reader.getWorkbook().getSheetAt(0);
			String strVal = sheet.getRow(0).getCell(0).getStringCellValue();
			Assertions.assertEquals("iso_code", strVal);
		} catch (IOException e) {
			Assertions.fail(e);
		}
	}

}
