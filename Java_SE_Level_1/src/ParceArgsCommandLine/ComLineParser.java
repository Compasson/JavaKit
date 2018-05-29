package ParceArgsCommandLine;

public class ComLineParser {
	
	private String[] keys;
	private String[] delim;
	public static enum SwitchStatus{NoError,Error,ShowUsage};
	
	public ComLineParser(){};

	public ComLineParser(String[] k)
	{
		this(k, new String[] {"-","/"});
	};
	
	public ComLineParser(String[] k,String[] d)
	{	
		this.keys=k;
		this.delim=d;
	};
	

	
	void onUsage(String errorKey)//-подсказку по использованию программы
	{	
		if(errorKey!=null) System.out.println("Error sending param: " + errorKey);
		
		System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
		System.out.println("   -?  показать Help файл");
		System.out.println("   -r  задать имя входного файла");
		System.out.println("   -w  выполнить вывод в указанный файл");
		
	};
	
	public SwitchStatus onSwitch(String key,String keyValue)// -отрабатывает команды для каждого ключа
	{							//возвращает SwichStatus		
		System.out.printf("%s %s\n",key,keyValue);
		SwitchStatus sw =SwitchStatus.NoError;
		return sw;
	};
	
	boolean parse(String[] args)
	{			SwitchStatus  ss = SwitchStatus.NoError;
				int argNum;
				boolean isKey=false;
				for(argNum=0;(ss==SwitchStatus.NoError) && (argNum<args.length);argNum++){
					boolean isDelimeter=false;
					for(int n=0;!isDelimeter && (n<delim.length); n++)
							isDelimeter=args[argNum].regionMatches(0,delim[n],0,1);					
					if (isDelimeter) 
					{
						// проверка наличия правильного ключа
						for(int i=0;!isKey&&(i<keys.length);i++)
						{	isKey=args[argNum].regionMatches(true,1,keys[i],0,1);		// равно «isKey» результат сравнения двух ключей предварительно приведя их к
									//верхнему регистру(используйте метод regionMatches).
									//  Первый ключ для сравнения берётся из массива «args», 
									//причём не с нулевой позиции, а второй из массива «keys» 
								if(isKey)
									break;
						}
						if(!isKey) {
							ss=SwitchStatus.Error;
							break;
						}
					}
					else {
						ss= SwitchStatus.Error;
						break;
					}
				}
				
				//Завершение разбора командной строки
				if(ss==SwitchStatus.ShowUsage) onUsage(null);
				
				if(ss == SwitchStatus.Error) onUsage((argNum == args.length) ? null : args[argNum]);
				
				return ss ==SwitchStatus.NoError;
	}	
	

}
