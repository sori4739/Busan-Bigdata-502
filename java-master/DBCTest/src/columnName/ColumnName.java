package columnName;

import java.util.Vector;

public class ColumnName {
	
	public static Vector<String> getColumnName(){
		Vector<String> ColumnName = new Vector<String>();
		ColumnName.add("ID");//������ �ѹ�
		ColumnName.add("USERNAME");
		ColumnName.add("PASSWORD");
		ColumnName.add("NAME");
		ColumnName.add("EMAIL");
		ColumnName.add("PHONE");
		ColumnName.add("CREATDATE");
		
		return ColumnName;
	}

}
