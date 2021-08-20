import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import commands.ProductTable;
import commands.UserTable;
import commands.UserTableRoleColumn;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<String, List<String>>();
		MigrationTool tool = new MigrationTool();
		tool.addMigration(new UserTable(database));
		tool.addMigration(new ProductTable(database));
		tool.addMigration(new UserTableRoleColumn(database));
		
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.latest();
		System.out.println(database);
		
		tool.roolback();
		System.out.println(database);
		
	}
}
