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
    public static Object ValidUsername
     
    /**
     * <p></p>
     */
    public static Object ValidPassword
     
    /**
     * <p></p>
     */
    public static Object InvalidUsername
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            ValidUsername = selectedVariables['ValidUsername']
            ValidPassword = selectedVariables['ValidPassword']
            InvalidUsername = selectedVariables['InvalidUsername']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
