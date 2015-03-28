package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public class NSURLFileResourceType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeNamedPipe")
    public static native NSString NamedPipeValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeCharacterSpecial")
    public static native NSString CharacterSpecialValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeDirectory")
    public static native NSString DirectoryValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeBlockSpecial")
    public static native NSString BlockSpecialValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeRegular")
    public static native NSString RegularValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeSymbolicLink")
    public static native NSString SymbolicLinkValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeSocket")
    public static native NSString SocketValue();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("NSURLFileResourceTypeUnknown")
    public static native NSString UnknownValue();

}
