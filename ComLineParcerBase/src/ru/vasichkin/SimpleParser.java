package ru.vasichkin;


import static java.lang.System.out;

public class SimpleParser extends ComLineParserBase {
	
	private String InFile;
	private String OutFile;
	
	public SimpleParser(String[] keys,String[] delim){
		super(keys,delim);
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

		out.println("������ ���.������: ������������ [-r<input-fileName>] [-w<output-fileName>]");
		out.println("   -?  �������� Help ����");
		out.println("   -r  ������ ��� �������� �����");
		out.println("   -w  ��������� ����� � ��������� ����");
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
