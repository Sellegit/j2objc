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
@Mapping("CTFontOptions")
public final class CTFontOptions extends ObjCEnum {
    
    @GlobalConstant("kCTFontOptionsDefault")
    public static final long Default = 0L;
    @GlobalConstant("kCTFontOptionsPreventAutoActivation")
    public static final long PreventAutoActivation = 1L;
    @GlobalConstant("kCTFontOptionsPreferSystemFont")
    public static final long PreferSystemFont = 4L;


}
