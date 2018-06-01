package ru.vasichkin;

import static java.lang.System.out;

public class SimpleParser extends ComLineParserBase {

	private String inFile;
	private String outFile;

	public SimpleParser(String[] keys, String[] delim) {
		super(keys, delim);
	}

	public String getInFile() {
		return inFile;
	}

	public void setInFile(String inFile) {
		inFile = inFile;
	}

	public String getOutFile() {
		return outFile;
	}

	public void setOutFile(String outFile) {
		outFile = outFile;
	}

	@Override
	public void OnUsage(String errorKey) {
		if (errorKey != null)
			System.out.println("Command-line switch error:" + errorKey);

		out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
		out.println("   -?  показать Help файл");
		out.println("   -r  задать имя входного файла");
		out.println("   -w  выполнить вывод в указанный файл");
	}

	@Override
	public SwitchStatus OnSwitch(String key, String keyValue) {
		SwitchStatus status = SwitchStatus.NoError;
		switch (key) {
		case "?":
			status = SwitchStatus.ShowUsage;
		case "r": {
            if (keyValue.length() < 1) {             
                System.out.println("Нет имени входного файла.");
                status = SwitchStatus.Error; 
      
            } 
            else this.inFile = keyValue;
            break;
		}
        case "w":   
            if (keyValue.length() < 1) {
                System.out.println("Нет имени выходного файла.");
                status = SwitchStatus.Error; 
            } 
            else  this.outFile = keyValue;
            break;
		default:
			out.println("Fail key.");
			break;
		}
		return status;
	}

}
