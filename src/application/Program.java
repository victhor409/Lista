	package application;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Locale;
	import java.util.Scanner;
	
	import entites.Employee;
	
	public class Program {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			List<Employee> list = new ArrayList<>();
			
			System.out.print("How many employess will be registred? ");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
			
				System.out.println();
				System.out.println("Employee #"+i+":");
				System.out.print("Id: ");
				int id = sc.nextInt();
				System.out.print("Name: ");
				String name=sc.nextLine();
				sc.nextLine();
				System.out.print("Salary: ");
				double salary=sc.nextDouble();
				list.add(new Employee(id,name,salary));
				
				}
			
			    //Aumento de salario
				System.out.println();
				System.out.print("Enter the employee id that will have salary increase: " );
				int id =sc.nextInt();
				//expressao que percorre toda a lista e faz o filtro de ID
				Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("This id does not exist!");
				}
				else {
					System.out.print("Enter the percentage: ");
					double percentage=sc.nextDouble();
					emp.increaseSalary(percentage);
				}
				//imprimindo na tela o nome dos funcionarios
				System.out.println();
				System.out.println("List of employees:");
				for (Employee obj : list) {
					System.out.println(obj);
				}
				
			sc.close();
		}
	
	}
