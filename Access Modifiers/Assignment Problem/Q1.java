class LibraryMember
{
    private String membershipPin;
    String branchCode;
    protected double finesOwed;
    public String displayName;
}
class AccessChecker
{
    static String classifyAccess(String fieldModifier,String accessorContext)
    {
        if(fieldModifier.equals("private"))
        {
            if(accessorContext.equals("SAME_CLASS"))
            {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if(fieldModifier.equals("default"))
        {
            if(accessorContext.equals("SAME_CLASS")||accessorContext.equals("SAME_PACKAGE"))
            {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if(fieldModifier.equals("protected"))
        {
            if(accessorContext.equals("SAME_CLASS")||accessorContext.equals("SAME_PACKAGE"))
            {
                return "ALLOWED";
            }
            return "DENIED";
        }
        if(fieldModifier.equals("public"))
        {
            return "ALLOWED";
        }
        return "DENIED";
    }
    static String summarizeByModifier(String[][] attempts)
    {
        String[] modifiers={"private","default","protected","public"};
        String result="";
        for(int i=0;i<modifiers.length;i++)
        {
            int allowed=0;
            int denied=0;
            for(int j=0;j<attempts.length;j++)
            {
                if(attempts[j][0].equals(modifiers[i]))
                {
                    if(classifyAccess(attempts[j][0],attempts[j][1]).equals("ALLOWED"))
                    {
                        allowed++;
                    }
                    else
                    {
                        denied++;
                    }
                }
            }
            if(i>0)
            {
                result+=" | ";
            }
            result+=modifiers[i]+": "+allowed+" allowed / "+denied+" denied";
        }
        return result;
    }
}
public class Q1
{
    public static void main(String[] args)
    {
        System.out.println(AccessChecker.classifyAccess("private","SAME_CLASS"));
        System.out.println(AccessChecker.classifyAccess("protected","DIFFERENT_PACKAGE"));
        String[][] attempts={
            {"private","SAME_CLASS"},
            {"private","SAME_PACKAGE"},
            {"default","SAME_PACKAGE"},
            {"default","DIFFERENT_PACKAGE"},
            {"protected","SAME_PACKAGE"},
            {"protected","SAME_CLASS"},
            {"public","DIFFERENT_PACKAGE"}
        };
        System.out.println(AccessChecker.summarizeByModifier(attempts));
    }
}
