package apple.storekit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;
import apple.accounts.*;


/*<javadoc>*/
/*</javadoc>*/

public abstract class SKProductsRequestDelegateAdapter 
    extends SKRequestDelegateAdapter 
    implements SKProductsRequestDelegate {

    
    
    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @NotImplemented("productsRequest:didReceiveResponse:")
    public void didReceiveResponse(SKProductsRequest request, SKProductsResponse response) { throw new UnsupportedOperationException(); }
    
}
