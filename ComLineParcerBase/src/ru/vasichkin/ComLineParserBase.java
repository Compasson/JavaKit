package ru.vasichkin;

public class ComLineParserBase {
    private String[] keys;           // �����
    private String[] delimeters;     // �����������  "/", "-"

    protected enum SwitchStatus { NoError, Error, ShowUsage };

    public ComLineParserBase(String[] keys) {
        this(keys, new String[] { "/", "-" });
    }
    public ComLineParserBase(String[] keys, String[] delimeters) {
        this.keys = keys;
        this.delimeters   = delimeters;
    }

    protected void OnUsage(String errorKey){
//        if (errorKey != null)
//            System.out.println("Command-line switch error:" + errorKey);
//
//        System.out.println("������ ���.������: ������������ [-r<input-fileName>] [-w<output-fileName>]");
//	System.out.println("   -?  �������� Help ����");
//	System.out.println("   -r  ������ ��� �������� �����");
//	System.out.println("   -w  ��������� ����� � ��������� ����");
    }
    protected SwitchStatus OnSwitch(String key, String keyValue) {
        return SwitchStatus.Error;
    }

    public Boolean Parse(String[] args) {
        SwitchStatus ss = SwitchStatus.NoError;	    

        int argNum;
        for (argNum = 0; (ss == SwitchStatus.NoError) && (argNum < args.length); argNum++) {

            // ������� ������� ����������� �����������
            boolean isDelimeter = false;
            for (int n = 0; !isDelimeter && (n < delimeters.length); n++) {
                isDelimeter = args[argNum].regionMatches(0,delimeters[n], 0, 1);
            }
            
            if (isDelimeter) {
                // �������� ������� ����������� �����
                Boolean isKey = false;
                int i;
                for (i = 0; !isKey && (i < keys.length); i++) {
                    isKey = args[argNum].regionMatches(true,1, 
                            keys[i],0,keys[i].length());
                    if (isKey) break;
                }
                if (!isKey) {
                    ss = SwitchStatus.Error;
                    break;
                } 
                else {
                    ss = OnSwitch(keys[i].toLowerCase(), 
                         args[argNum].substring(1 + keys[i].length()));
                }
            }
            else {
                ss= SwitchStatus.Error;
                break;
            }
        }
        // ���������� ������� ��������� ������
        if (ss == SwitchStatus.ShowUsage)    OnUsage(null);
        if (ss == SwitchStatus.Error)        OnUsage((argNum == args.length) ? null : args[argNum]);
        
        return ss == SwitchStatus.NoError;
    }      
}