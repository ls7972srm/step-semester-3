class LibraryMember
{
    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer;
    private boolean membershipIdSet;
    public LibraryMember()
    {
        membershipIdSet=false;
    }
    public String getMembershipId()
    {
        return membershipId;
    }
    public void setMembershipId(String id)
    {
        if(!membershipIdSet)
        {
            membershipId=id;
            membershipIdSet=true;
        }
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public boolean isPremiumMember()
    {
        return premiumMember;
    }
    public void setPremiumMember(boolean premiumMember)
    {
        this.premiumMember=premiumMember;
    }
    public void setSecurityAnswer(String answer)
    {
        securityAnswer=String.valueOf(answer.hashCode());
    }
}
public class Q4
{
    public static void main(String[] args)
    {
        LibraryMember m=new LibraryMember();
        m.setMembershipId("LIB-8841");
        m.setName("Priya Nair");
        m.setPremiumMember(true);
        System.out.println(m.getMembershipId());
        m.setMembershipId("FAKE-0000");
        System.out.println(m.getMembershipId());
        System.out.println(m.isPremiumMember());
        m.setSecurityAnswer("BlueMountain");
    }
}
