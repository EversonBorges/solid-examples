package _5_DependencyInversionPrinciple_DIP;

import _5_DependencyInversionPrinciple_DIP.Correct.ProviderBD;
import _5_DependencyInversionPrinciple_DIP.Correct.ProviderMSSQLBD;
import _5_DependencyInversionPrinciple_DIP.Correct.ProviderOracleBD;
import _5_DependencyInversionPrinciple_DIP.Correct.ProviderPostgresBD;
import _5_DependencyInversionPrinciple_DIP.Violation.ConfigurationManagerBDViolation;

public class MainDIP {
    public static void main(String[] args) {

        System.out.println("Violando o principio ISP --");
        ConfigurationManagerBDViolation managerBD = new ConfigurationManagerBDViolation();
        managerBD.startBD();

        System.out.println("Maneira correta aplicando o principio --");
        ProviderMSSQLBD mssqlbd = new ProviderMSSQLBD();
        ProviderBD providerMSSQLBD= new ProviderBD(mssqlbd);
        providerMSSQLBD.startBD();

        ProviderOracleBD oracleBD = new ProviderOracleBD();
        ProviderBD providerOracleBD= new ProviderBD(oracleBD);
        providerOracleBD.startBD();

        ProviderPostgresBD postgresBD = new ProviderPostgresBD();
        ProviderBD providerPostegresDB= new ProviderBD(postgresBD);
        providerPostegresDB.startBD();
    }
}
