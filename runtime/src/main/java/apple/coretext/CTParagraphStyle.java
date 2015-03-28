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
@Mapping("CTParagraphStyleRef") @Library("CoreText/CoreText.h")
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
    public static native CTParagraphStyle createCopy(CTParagraphStyle paragraphStyle);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTParagraphStyleGetValueForSpecifier")
    public static native boolean getValueForSpecifier(CTParagraphStyle paragraphStyle, @Representing("CTParagraphStyleSpecifier") long spec, @MachineSizedUInt long valueBufferSize, Todo valueBuffer);

}
