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
    public static native String PlainValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSRTFTextDocumentType")
    public static native String RTFValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSRTFDTextDocumentType")
    public static native String RTFDValue();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSHTMLTextDocumentType")
    public static native String HTMLValue();

}
