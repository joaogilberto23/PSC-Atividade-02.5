import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataAmericana extends InserirData {
	
	@Override
	public String dataPersonalizada() {
		
        Date today = Calendar.getInstance().getTime();

        DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        String dataAmericana = format.format(today);	
		
		return dataAmericana;
		
	}	
}