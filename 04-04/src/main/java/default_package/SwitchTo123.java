package default_package;
import com.tyss.optimize.nlp.util.Nlp;
import com.tyss.optimize.nlp.util.NlpException;
import com.tyss.optimize.nlp.util.NlpRequestModel;
import com.tyss.optimize.nlp.util.NlpResponseModel;
import com.tyss.optimize.nlp.util.annotation.InputParam;
import com.tyss.optimize.nlp.util.annotation.InputParams;
import com.tyss.optimize.nlp.util.annotation.ReturnType;
import java.util.Map;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.stereotype.Component;
import java.util.Set;
import com.tyss.optimize.nlp.util.*;
import com.tyss.optimize.common.util.CommonConstants;
import java.util.ArrayList;
import java.util.List;
  @Component("LIC5926_PJT1013_PE_NLPa0a8ec7d-e431-4d55-bd09-ca0d95e59481")
  public class SwitchTo123 implements Nlp {
         @ReturnType(name = "parentId", type = "java.lang.String")
	@Override
	public NlpResponseModel execute(NlpRequestModel nlpRequestModel) throws NlpException {
		NlpResponseModel nlpResponseModel = new NlpResponseModel();
		Map<String, Object> attributes = nlpRequestModel.getAttributes();
		String parentId = "";
		//Web driver
		WebDriver driver = (WebDriver) nlpRequestModel.getDriver().getSpecificIDriver();
		try {
			parentId = driver.getWindowHandle();
			Set<String> listOfWin = driver.getWindowHandles();
			for (String expectedWin : listOfWin) {
				if (!parentId.contains(expectedWin)) {
					driver.switchTo().window(expectedWin);
				}
				
			}
			nlpResponseModel.setStatus(CommonConstants.pass);
		} catch (Exception e) {
			nlpResponseModel.setStatus(CommonConstants.fail);
		}
		nlpResponseModel.getAttributes().put("parentId", parentId);
		return nlpResponseModel;
	}
	 @Override
      public List<String> getTestParameters() throws NlpException {
        List<String> params = new ArrayList<>();
        return params;
    }
     @Override
    public StringBuilder getTestCode() throws NlpException {
        StringBuilder sb = new StringBuilder();
        return sb;
    }
}