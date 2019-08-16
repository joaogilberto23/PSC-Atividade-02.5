import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataBrasileira extends InserirData {
	
	@Override
	public String dataPersonalizada() {
		
        Date hoje = Calendar.getInstance().getTime();

        DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataBrasileira = formatar.format(hoje);	
		
		return dataBrasileira;
	}

}
