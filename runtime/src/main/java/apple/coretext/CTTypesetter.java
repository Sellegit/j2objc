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
public class CTTypesetter 
    extends CFType 
     {

    
    
    protected CTTypesetter() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateWithAttributedString")
    public static native CTTypesetter create(NSAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateWithAttributedStringAndOptions")
    public static native CTTypesetter create(NSAttributedString string, CTTypesetterOptions options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateLineWithOffset")
    public native CTLine createLine(CFRange stringRange, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateLine")
    public native CTLine createLine(CFRange stringRange);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestLineBreakWithOffset")
    public native @MachineSizedSInt long suggestLineBreak(@MachineSizedSInt long startIndex, double width, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestLineBreak")
    public native @MachineSizedSInt long suggestLineBreak(@MachineSizedSInt long startIndex, double width);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestClusterBreakWithOffset")
    public native @MachineSizedSInt long suggestClusterBreak(@MachineSizedSInt long startIndex, double width, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestClusterBreak")
    public native @MachineSizedSInt long suggestClusterBreak(@MachineSizedSInt long startIndex, double width);
    
}
