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
@Library("AddressBook/AddressBook.h")
public class ABPersonInstantMessageService 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonInstantMessageServiceYahoo")
    public static native CFString YahooValue();
    @GlobalConstant("kABPersonInstantMessageServiceJabber")
    public static native CFString JabberValue();
    @GlobalConstant("kABPersonInstantMessageServiceMSN")
    public static native CFString MSNValue();
    @GlobalConstant("kABPersonInstantMessageServiceICQ")
    public static native CFString ICQValue();
    @GlobalConstant("kABPersonInstantMessageServiceAIM")
    public static native CFString AIMValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceQQ")
    public static native CFString QQValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceGoogleTalk")
    public static native CFString GoogleTalkValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceSkype")
    public static native CFString SkypeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceFacebook")
    public static native CFString FacebookValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonInstantMessageServiceGaduGadu")
    public static native CFString GaduGaduValue();

}
