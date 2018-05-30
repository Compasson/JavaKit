package ru.vasichkin.staff;

// В одном файле может быть только один публичный класс с таким же названием как у файла

public class Person {
	
	public String name;
	public int age;
	
	// Статическое поле одно для всех обьектов класса
	// Статические поля хранятся отдельно после загрузки NameClass.class
	public static int counter=0;
	
	//Статическое поле инициализации.
	// Выполняется ОДИН РАЗ!
	static {
		counter=0;
		//....
	}
	
	// Статический метод - это функция для класса.
	// У статического метода нет: this , name, age
	// НО есть доступ к counter
	public static void showTotal() {
		System.out.printf("Total person: %d\n",Person.counter);
	}
	
	public Person() {
		this("Unknown");
	}

	public Person(String name) {
		this(name,20); //Вызов конструктора должен быть в начале
		// some code
		//System.out.println("....");
	}
	// Вызов только оператором: new
	public Person(String name, int age) {
		//this это ссылка на тот обьект чей метод вызван
		//this лучше писать всегда!!!
		this.name=name;
		this.age=age;
		this.show();
		//или просто show();
		//Person.counter++;
		counter++;
	}
	
	public void show(){
		System.out.printf("%s - %d\n",this.name,this.age);
	}
}