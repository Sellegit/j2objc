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
@Library("CoreText/CoreText.h")
public class CTTextTab 
    extends CFType 
     {

    
    
    protected CTTextTab() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabCreate")
    public static native CTTextTab create(@Representing("CTTextAlignment") long alignment, double location, CFDictionary options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetAlignment")
    public static native CTTextAlignment getAlignment(CTTextTab tab);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetLocation")
    public static native double getLocation(CTTextTab tab);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTextTabGetOptions")
    public static native CTTextTabOptions getOptions(CTTextTab tab);
    
}
