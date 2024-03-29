package Lambda.with.Api.Gateway;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class LambdaFirstDuplicate {

    public String useFirstDuplicate(String input, Context c) {
        FirstDuplicate fd = new FirstDuplicate(input);
        String output = fd.findDuplicate();
        LambdaLogger logger = c.getLogger();
        logger.log("First duplicate? " + output);

        return output;
    }

}
