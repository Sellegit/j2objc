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
public class CTFontCollection 
    extends CFType 
     {

    
    
    protected CTFontCollection() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionCreateFromAvailableFonts")
    public static native CTFontCollection createFromAvailableFonts(CFDictionary options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionCreateWithFontDescriptors")
    public static native CTFontCollection create(CFArray queryDescriptors, CFDictionary options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionCreateCopyWithFontDescriptors")
    public native CTFontCollection createCopy(CFArray queryDescriptors, CFDictionary options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionCreateMatchingFontDescriptors")
    public native List<CTFontDescriptor> getMatchingFontDescriptors();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback")
    protected native List<CTFontDescriptor> getMatchingFontDescriptorsSorted(FunctionPtr sortCallback, Todo refCon);
    
}
