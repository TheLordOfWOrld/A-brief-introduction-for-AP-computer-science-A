public class website {
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    

    public website() {
        domain = "";
        topLevelDomain = "";
        numUsers = 0;
    }

    public website(String domainName, String topDomain) {
        this.domain = domainName;
        this.topLevelDomain = topDomain;
    }


    public website(String domainName, String topDomain, int numPeople) {
        this.domain = domainName;
        this.topLevelDomain = topDomain;
        this.numUsers = numPeople;
    }
    
    public void output(String domainName, String topDomain, int numPeople){
        System.out.println("https://www."+domainName+"."+topDomain+"   has "+numPeople+" users");
    }
    
    
    public static void main(String[] args) {
        website web = new website("cornhub","website",114514);
        website web2 = new website("github","com",1919810);
        website web3 = new website("luheintl","com",1-1+1);

        web.output(web.domain, web.topLevelDomain, web.numUsers);
        web2.output(web2.domain, web2.topLevelDomain, web2.numUsers);
        web3.output(web3.domain, web3.topLevelDomain, web3.numUsers);
    }

    
    

}
//WW