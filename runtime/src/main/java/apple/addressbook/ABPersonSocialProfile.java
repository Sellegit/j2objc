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
public class ABPersonSocialProfile 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileURLKey")
    public static native CFString URLKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileServiceKey")
    public static native CFString ServiceKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileUsernameKey")
    public static native CFString UsernameKey();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("kABPersonSocialProfileUserIdentifierKey")
    public static native CFString UserIdentifierKey();
    
}
