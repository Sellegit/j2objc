package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("UIKit/UIKit.h")
public class NSDocumentType 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSPlainTextDocumentType")
    protected static native NSString PlainValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSRTFTextDocumentType")
    protected static native NSString RTFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSRTFDTextDocumentType")
    protected static native NSString RTFDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSHTMLTextDocumentType")
    protected static native NSString HTMLValue();
    
}
