package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook")
public class ABPersonInstantMessageService 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonInstantMessageServiceYahoo")
    protected static native CFString YahooValue();
    @GlobalConstant("kABPersonInstantMessageServiceJabber")
    protected static native CFString JabberValue();
    @GlobalConstant("kABPersonInstantMessageServiceMSN")
    protected static native CFString MSNValue();
    @GlobalConstant("kABPersonInstantMessageServiceICQ")
    protected static native CFString ICQValue();
    @GlobalConstant("kABPersonInstantMessageServiceAIM")
    protected static native CFString AIMValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceQQ")
    protected static native CFString QQValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceGoogleTalk")
    protected static native CFString GoogleTalkValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceSkype")
    protected static native CFString SkypeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceFacebook")
    protected static native CFString FacebookValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceGaduGadu")
    protected static native CFString GaduGaduValue();
    
}
