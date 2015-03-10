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
@Library("StoreKit")
public class SKStoreProductParameters 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("SKStoreProductParameterITunesItemIdentifier")
    protected static native NSString ITunesItemIdentifierKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("SKStoreProductParameterAffiliateToken")
    protected static native NSString AffiliateTokenKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("SKStoreProductParameterCampaignToken")
    protected static native NSString CampaignTokenKey();
    
}
