package apple.coretext;


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
@Library("CoreText")
public class CTParagraphStyle 
    extends CFType 
     {

    
    
    protected CTParagraphStyle() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTParagraphStyleGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTParagraphStyleCreate")
    public static native CTParagraphStyle create(CTParagraphStyleSetting settings, @MachineSizedUInt long settingCount);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTParagraphStyleCreateCopy")
    public native CTParagraphStyle createCopy();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTParagraphStyleGetValueForSpecifier")
    public native boolean getValueForSpecifier(CTParagraphStyleSpecifier spec, @MachineSizedUInt long valueBufferSize, Todo valueBuffer);
    
}
