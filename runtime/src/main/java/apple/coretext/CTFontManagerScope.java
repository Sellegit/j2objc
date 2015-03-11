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





@Library("CoreText")
@Mapping("CTFontManagerScope")
public final class CTFontManagerScope extends ObjCEnum {
    
    @GlobalConstant("kCTFontManagerScopeNone")
    public static final long None = 0L;
    @GlobalConstant("kCTFontManagerScopeProcess")
    public static final long Process = 1L;
    @GlobalConstant("kCTFontManagerScopeUser")
    public static final long User = 2L;
    @GlobalConstant("kCTFontManagerScopeSession")
    public static final long Session = 3L;
    

}
