import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opencsv.CSVWriter;

public class WritingReport {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
	String time = dateFormat.format(new Date());
	String csv = "Report Writing " + time + " .csv";
	CSVWriter writer;

	public void writeReport(String s) {
		{
			try {
				writer = new CSVWriter(new FileWriter(csv, true));
				// Create record
				String[] record = s.split(",");

				// Write the record to file
				writer.writeNext(record);
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}