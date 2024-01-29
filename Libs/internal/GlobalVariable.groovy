package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object Elear_usr_login
     
    /**
     * <p></p>
     */
    public static Object Elear_usr_pass
     
    /**
     * <p></p>
     */
    public static Object url_elearning
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object usrname
     
    /**
     * <p></p>
     */
    public static Object pass
     
    /**
     * <p></p>
     */
    public static Object ss_homepage
     
    /**
     * <p></p>
     */
    public static Object Gvalidasi
     
    /**
     * <p></p>
     */
    public static Object url_matahari
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Elear_usr_login = selectedVariables['Elear_usr_login']
            Elear_usr_pass = selectedVariables['Elear_usr_pass']
            url_elearning = selectedVariables['url_elearning']
            url = selectedVariables['url']
            usrname = selectedVariables['usrname']
            pass = selectedVariables['pass']
            ss_homepage = selectedVariables['ss_homepage']
            Gvalidasi = selectedVariables['Gvalidasi']
            url_matahari = selectedVariables['url_matahari']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
