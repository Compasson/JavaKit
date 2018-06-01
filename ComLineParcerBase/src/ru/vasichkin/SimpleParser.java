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

		out.println("������ ���.������: ������������ [-r<input-fileName>] [-w<output-fileName>]");
		out.println("   -?  �������� Help ����");
		out.println("   -r  ������ ��� �������� �����");
		out.println("   -w  ��������� ����� � ��������� ����");
	}

	@Override
	public SwitchStatus OnSwitch(String key, String keyValue) {
		SwitchStatus status = SwitchStatus.NoError;
		switch (key) {
		case "?":
			status = SwitchStatus.ShowUsage;
		case "r": {
            if (keyValue.length() < 1) {             
                System.out.println("��� ����� �������� �����.");
                status = SwitchStatus.Error; 
      
            } 
            else this.inFile = keyValue;
            break;
		}
        case "w":   
            if (keyValue.length() < 1) {
                System.out.println("��� ����� ��������� �����.");
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
