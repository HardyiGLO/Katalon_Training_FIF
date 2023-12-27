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
