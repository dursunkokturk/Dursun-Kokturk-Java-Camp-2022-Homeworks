package java2022_day3_homework_02_11;

//Birden Fazla Interface i Inheritance Yapiyoruz
public class MySqlCustomerDal implements CustomerDal,Repository{

	@Override
	public void add() {
		System.out.println("My Sql Database Added");
	}
}