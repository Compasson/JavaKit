
/*
 * 	Универасальный класс может хранить одно поле ЛЮБОГО типа
 * Реализуется это с помощью Generic
 * 
 * 		MyType - это идентификатор(заглушка) на место которого будет подставляться реальный тип
 * 
 * 		Метод isGreate() текнически сравнивает Object  и ноль в возвращаемом значении. Здесь помогут ограничения(например классы реализующие интерфейс Comparable)
 * 
 * 		Comparable - дллжен быть типизирован типом <MyType> .Чтобы сравнивать лубой тип, а не только классы реализующие интерфейс Comparable (это очень жесткое ограничение, без наследников)
 * 
 * 		<? super MyType> Снимаем жесткое ограничение.  Все родители MyType включаяя MyType
 */

public class ReadonlyStorage<MyType extends Comparable<? super MyType>> // <? super MyType,T1,T2,T3>
	
{
	private MyType data;
	
	public boolean isGreater(MyType c)
	{
		return data.compareTo(c) > 0;
	}
	
	public ReadonlyStorage(MyType data) {
		this.data = data;
	}

	public MyType getData() {
		return data;
	}

}
