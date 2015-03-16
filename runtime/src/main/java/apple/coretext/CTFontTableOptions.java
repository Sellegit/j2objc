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





@Library("CoreText/CoreText.h")
@Mapping("CTFontTableOptions")
public final class CTFontTableOptions extends ObjCEnum {
    
    @GlobalConstant("kCTFontTableOptionNoOptions")
    public static final long NoOptions = 0L;
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalConstant("kCTFontTableOptionExcludeSynthetic")
    public static final long ExcludeSynthetic = 1L;
    

}
