package Groupit.model;

import java.util.ArrayList;

public class city {

private int city_id;
private String city_name;


public city(int city_id, String city_name) {
	this.city_id = city_id;
	this.city_name = city_name;
}
public String getCity_name() {
	return city_name;
}
public void setCity_name(String city_name) {
	this.city_name = city_name;
}
public int getCity_id() {
	return city_id;
}
public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public static ArrayList<city> cities() {
	ArrayList<city> cities = new ArrayList<city>();
	

	cities.add(new city(2,"Agadir"));

	cities.add(new city(3,"Aït Melloul"));

	cities.add(new city(4,"Al Hoceïma "));

	cities.add(new city(5,"Assilah"));

	cities.add(new city(6,"Azemmour"));

	cities.add(new city(7,"Azrou"));

	cities.add(new city(8,"Ben Guerir"));

	cities.add(new city(9,"Beni Mellal"));

	cities.add(new city(10,"Ben Slimane"));

	cities.add(new city(11,"Berkane"));

	cities.add(new city(12,"Berrechid"));

	cities.add(new city(13,"Bouarfa"));

	cities.add(new city(14,"Boujad"));

	cities.add(new city(15,"Boujdour"));

	cities.add(new city(16,"Bouskoura"));

	cities.add(new city(17,"Bouznika"));

	cities.add(new city(18,"Casablanca"));

	cities.add(new city(19,"Chefchaouen"));

	cities.add(new city(20,"Chichaoua"));

	cities.add(new city(21,"Dakhla"));

	cities.add(new city(22,"Demnate"));

	cities.add(new city(23,"El Jadida"));

	cities.add(new city(24,"Errachidia"));

	cities.add(new city(25,"Essaouira"));

	cities.add(new city(26,"Fès"));

	cities.add(new city(27,"Figuig"));

	cities.add(new city(28,"Fnideq"));

	cities.add(new city(29,"Fquih Ben Salah"));

	cities.add(new city(30,"Guelmim"));

	cities.add(new city(31,"Guercif"));

	cities.add(new city(32,"Ifrane"));

	cities.add(new city(33,"Imintanoute"));

	cities.add(new city(34,"Inezgane"));

	cities.add(new city(35,"Kénitra"));

	cities.add(new city(36,"Khémisset"));

	cities.add(new city(37,"Khénifra"));

	cities.add(new city(38,"Khouribga"));

	cities.add(new city(39,"Ksar el-Kébir"));

	cities.add(new city(40,"Laâyoune"));

	cities.add(new city(41,"Larache"));

	cities.add(new city(42,"Lqliâa"));

	cities.add(new city(43,"Marrakech"));

	cities.add(new city(44,"Martil"));

	cities.add(new city(45,"Mediek"));

	cities.add(new city(46,"Mehdia"));

	cities.add(new city(47,"Meknès"));

	cities.add(new city(48,"Midelt"));

	cities.add(new city(49,"Mirleft"));

	cities.add(new city(50,"Mohammédia"));

	cities.add(new city(51,"Nador"));

	cities.add(new city(52,"Ouarzazate"));

	cities.add(new city(53,"Oualidia"));

	cities.add(new city(54,"Ouezzane"));

	cities.add(new city(55,"Oujda"));

	cities.add(new city(56,"Oulad Teïma"));

	cities.add(new city(57,"Rabat"));

	cities.add(new city(58,"Safi"));

	cities.add(new city(59,"Saïdia"));

	cities.add(new city(60,"Salé"));

	cities.add(new city(61,"Sefrou"));

	cities.add(new city(62,"Settat"));

	cities.add(new city(63,"Sidi Kacem"));

	cities.add(new city(64,"Sidi Slimane"));

	cities.add(new city(65,"Skhirat"));

	cities.add(new city(66,"Smara"));

	cities.add(new city(67,"Souq Larba al Gharb"));

	cities.add(new city(68,"Tanger"));

	cities.add(new city(69,"Tan-Tan"));

	cities.add(new city(70,"Tamallalt"));

	cities.add(new city(71,"Taounate"));

	cities.add(new city(72,"Taroudannt"));

	cities.add(new city(73,"Tata"));

	cities.add(new city(74,"Taza"));

	cities.add(new city(75,"Temara"));

	cities.add(new city(76,"Tétouan"));

	cities.add(new city(77,"Tiflet"));

	cities.add(new city(78,"Tiznit"));

	cities.add(new city(79,"Youssoufia"));

	cities.add(new city(80,"Zagora"));

	cities.add(new city(81,"Zemamra"));
	
	return cities;
			
}


}
