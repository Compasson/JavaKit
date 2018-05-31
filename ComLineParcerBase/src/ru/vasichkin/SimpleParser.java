package ru.vasichkin;

import ru.vasichkin.ComLineParserBase.SwitchStatus;

import static java.lang.System.out;

public class SimpleParser extends ComLineParserBase {

    private String[] keys= {"r","w","?","a","d"};           // ключи
    private String[] delim= {"/","-"};     // разделители  "/", "-"
	
	private String InFile;
	private String OutFile;
	
	public SimpleParser(String InFile,String OutFile,String[] keys,String[] delim){
		super(keys,delim);
		this.InFile=InFile;
		this.OutFile=OutFile;
	}

	public String getInFile() {
		return InFile;
	}

	public void setInFile(String inFile) {
		InFile = inFile;
	}

	public String getOutFile() {
		return OutFile;
	}

	public void setOutFile(String outFile) {
		OutFile = outFile;
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
		SwitchStatus ss = SwitchStatus.NoError;	 
		switch(key) {
			case "?":
				ss = SwitchStatus.ShowUsage;
			case "r":
				if(keyValue!=null) {
					this.InFile=keyValue;
					break;
				}
				else {
					out.println("keyValue = null");
					ss=SwitchStatus.Error;
				}
				break;
			case "w":
				if(keyValue!=null) this.OutFile=keyValue;
				else {
					out.println("keyValue = null");
					ss=SwitchStatus.Error;
				}
				break;
			default: out.println("Fail key.");
				break;
		}
        return ss;
    }

}
